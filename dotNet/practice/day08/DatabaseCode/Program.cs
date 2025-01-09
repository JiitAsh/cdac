using System;
using System.Data;
using System.Net.Http.Headers;
using System.Runtime.Intrinsics.X86;
using Microsoft.Data.SqlClient;
using static System.Net.Mime.MediaTypeNames;
using static System.Runtime.InteropServices.JavaScript.JSType;

namespace DatabaseCode
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            //Connect();   // to check connection establishment

            //Insert();     // to insert data

            //Employee obj = new Employee { EmpNo = 7, Name = "Atharv Tiwari", Basic = 45000, DeptNo = 10 };
            //Insert2(obj);    // to insert data by passing employee as an argument

            //Employee obj = new Employee { EmpNo = 9, Name = "Narendra Dolas", Basic = 80000, DeptNo = 30 };
            //InsertWithParams(obj);     // to insert data  using param method


            //Employee obj = new Employee { EmpNo = 10, Name = "Mohit Nigam", Basic = 78562, DeptNo = 20 };
            //InsertWithStoredProcedure(obj);     // to insert data using stored procedure


            //SelectSingleValueOnly();     // to select data(only single cell) using ExecuteScalar() 

            //SelectMultipleValues();      // to select multiple values using SqlDataReader


            //Employee emp = GetSingleEmployee(6);
            //Console.WriteLine(emp.ToString());       // to select employee using empNo 



            //List<Employee> empList = GetAllEmployees();
            //foreach (Employee emp in empList)
            //{
            //    Console.WriteLine(emp.ToString());
            //}                                     // to select List of emp using SqlDataReader


            //NextResult();       // to select next/2nd data set if we run two queries for two differ tables/data set at same time

            //MARS();       // creating multiple DataReader from single connection using MultipleActiveResultSets=True   property.

            //CallFuncReturningSqlDataReader();       // closing DataReader and connection using ExecuteReader(CommandBehavior.CloseConnection)

        }
        static void Connect()
        {
            SqlConnection cn = new SqlConnection();
            //Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True; Connect Timeout = 30; Encrypt = False; Trust Server Certificate = False; Application Intent = ReadWrite; Multi Subnet Failover = False

            //cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; User id=userId; Password=password";   // when we use enterprise edition db, but we do not need this bcz we are using localdb which is free

            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";

            try
            {
                cn.Open();
                Console.WriteLine("woo hooooooo... Connection established.");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void Insert()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                //SqlCommand cmd = new SqlCommand();
                //cmd.Connection = cn;

                // or in single line
                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "insert into Employees values(6,'Akshay Dubey', 15000, 20)";
                cmd.ExecuteNonQuery();
                Console.WriteLine("woohooooo.... Data inserted successfully.");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void Insert2(Employee emp)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = new SqlCommand();
                cmd.Connection = cn;

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = $"insert into Employees values({emp.EmpNo}, '{emp.Name}',{emp.Basic},{emp.DeptNo})";

                //Console.WriteLine(cmd.CommandText);
                //Console.ReadLine();

                cmd.ExecuteNonQuery();
                Console.WriteLine("woohoooo... data inserted successfully.");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void InsertWithParams(Employee emp)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "insert into Employees values(@EmpNo, @Name, @Basic, @DeptNo)";

                cmd.Parameters.AddWithValue("@EmpNo", emp.EmpNo);
                cmd.Parameters.AddWithValue("@Name", emp.Name);
                cmd.Parameters.AddWithValue("@Basic", emp.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);

                cmd.ExecuteNonQuery();
                Console.WriteLine("woohooo.... data inserted succussfully");
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex);
            }
            finally
            {
                cn.Close();
            }
        }

        static void InsertWithStoredProcedure(Employee emp)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = CommandType.StoredProcedure;
                cmd.CommandText = "InsertEmployee";

                cmd.Parameters.AddWithValue("@EmpNo", emp.EmpNo);
                cmd.Parameters.AddWithValue("@Name", emp.Name);
                cmd.Parameters.AddWithValue("@Basic", emp.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);

                cmd.ExecuteNonQuery();
                Console.WriteLine("woohooo... data inserted successfully.");

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void SelectSingleValueOnly()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select Name from Employees where EmpNo=6";
                //cmd.CommandText = "select count(*) from Employees";
                //cmd.CommandText = "select * from Employees where EmpNo=6";

                object retval = cmd.ExecuteScalar();
                Console.WriteLine(retval);

                Console.WriteLine("woohoooo...... data retrieved.");

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void SelectMultipleValues()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select * from Employees";

                SqlDataReader dr = cmd.ExecuteReader();
                // dr.HasRows   --> returns bool


                // dr.Read()   --> reads record and returns that data has been read or not.
                while (dr.Read())
                {
                    Console.WriteLine(dr["Name"]);
                    Console.WriteLine(dr[0]);
                    //Console.WriteLine(dr);
                }

                dr.Close();

                Console.WriteLine("woohooooo.... data retrieved.");

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static Employee GetSingleEmployee(int empNo)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            Employee employee = null;


            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select * from Employees";


                SqlDataReader dr = cmd.ExecuteReader();

                while (dr.Read())
                {
                    if (dr["EmpNo"].Equals(empNo))
                    {
                        employee = new Employee { EmpNo = Convert.ToInt32(dr["EmpNo"]), Name = dr["Name"].ToString().Trim(), Basic = Convert.ToDecimal(dr["Basic"]), DeptNo = Convert.ToInt32(dr["DeptNo"]) };

                        break;
                    }
                }

                dr.Close();

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }

            return employee;
        }

        static List<Employee> GetAllEmployees()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";


            List<Employee> empList = new List<Employee>();
            Employee emp;

            try
            {
                cn.Open();


                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select * from Employees";

                SqlDataReader dr = cmd.ExecuteReader();

                while (dr.Read())
                {
                    emp = new Employee { EmpNo = Convert.ToInt32(dr["EmpNo"]), Name = dr["Name"].ToString().Trim(), Basic = Convert.ToDecimal(dr["Basic"]), DeptNo = Convert.ToInt32(dr["DeptNo"]) };
                    empList.Add(emp);
                }

            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }




            return empList;
        }

        static void NextResult()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";

            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = CommandType.Text;
                cmd.CommandText = "select * from Employees; select * from Departments";


                SqlDataReader dr = cmd.ExecuteReader();

                while (dr.Read())
                {
                    Console.WriteLine(dr["Name"]);
                }

                Console.WriteLine();
                dr.NextResult();
                while (dr.Read())
                {
                    Console.WriteLine(dr["DeptName"]);
                }

                dr.Close();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void MARS()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True; MultipleActiveResultSets=True";

            cn.Open();

            SqlCommand cmdDepts = cn.CreateCommand();

            cmdDepts.CommandType = CommandType.Text;
            cmdDepts.CommandText = "select * from Departments";

            SqlCommand cmdEmps = cn.CreateCommand();

            cmdEmps.CommandType = CommandType.Text;


            SqlDataReader drDepts = cmdDepts.ExecuteReader();
            while (drDepts.Read())
            {
                Console.WriteLine((drDepts["DeptName"]));

                cmdEmps.CommandText = "select * from Employees where DeptNo = " + drDepts["DeptNo"];
                SqlDataReader drEmps = cmdEmps.ExecuteReader();
                while (drEmps.Read())
                {
                    Console.WriteLine(("    " + drEmps["Name"]));
                }

                drEmps.Close();
            }
            drDepts.Close();
            cn.Close();
        }

        static void CallFuncReturningSqlDataReader()
        {
            SqlDataReader dr = GetDataReader();
            while (dr.Read())
            {
                Console.WriteLine(dr["Name"]);
            }
            dr.Close();
        }

        static SqlDataReader GetDataReader()
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            cn.Open();

            SqlCommand cmdInsert = cn.CreateCommand();

            cmdInsert.CommandType = CommandType.Text;
            cmdInsert.CommandText = "select * from Employees";

            //SqlDataReader dr = cmdInsert.ExecuteReader();
            SqlDataReader dr = cmdInsert.ExecuteReader(CommandBehavior.CloseConnection);
            //cn.Close();

            return dr;
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }

        public override string ToString()
        {
            return "EmpNo = " + EmpNo.ToString() + ", Name = " + Name + ", Basic = " + Basic.ToString() + ", DeptNo = " + DeptNo.ToString();
        }
    }

}