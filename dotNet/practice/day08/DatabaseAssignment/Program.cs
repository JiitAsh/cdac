using Microsoft.Data.SqlClient;

namespace DatabaseAssignment
{
    // assignment---> write methods that return employee(by emp no ) and all employee (in list<employee> ), and use update and delete for param method and stored procedure
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            //Employee emp = GetSingleEmployee(6);
            //Console.WriteLine(emp.ToString()) ;

            //List<Employee> empList = GetAllEmployees();
            //foreach(Employee emp in empList)
            //{
            //    Console.WriteLine(emp.ToString());
            //}

            //Employee emp = new Employee { EmpNo = 3, Name = "Karen Pott", Basic = 22445.89m, DeptNo = 30 };
            //UpdateByParam(emp);

            //Employee emp = new Employee { EmpNo = 5, Name = "Will Smith", Basic = 22445.89m, DeptNo = 10 };
            //UpdateByStoredPro(emp);

            //DeleteByParam(5);

            DeleteByStoredPro(6);
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

                cmd.CommandType = System.Data.CommandType.Text;
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

            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = "select * from Employees";

                SqlDataReader dr = cmd.ExecuteReader();

                while (dr.Read())
                {
                    empList.Add(new Employee { EmpNo = Convert.ToInt32(dr["EmpNo"]), Name = dr["Name"].ToString().Trim(), Basic = Convert.ToDecimal(dr["Basic"]), DeptNo = Convert.ToInt32(dr["DeptNo"]) });

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

            return empList;
        }

        static void UpdateByParam(Employee emp)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = "update Employees set Name=@Name, Basic=@Basic, DeptNo=@DeptNo where EmpNo=@EmpNo";

                cmd.Parameters.AddWithValue("@EmpNo", emp.EmpNo);
                cmd.Parameters.AddWithValue("@Name", emp.Name);
                cmd.Parameters.AddWithValue("@Basic", emp.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);

                cmd.ExecuteNonQuery();

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

        static void UpdateByStoredPro(Employee emp)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "UpdateEmployee";

                cmd.Parameters.AddWithValue("@EmpNo", emp.EmpNo);
                cmd.Parameters.AddWithValue("@Name", emp.Name);
                cmd.Parameters.AddWithValue("@Basic", emp.Basic);
                cmd.Parameters.AddWithValue("@DeptNo", emp.DeptNo);

                cmd.ExecuteNonQuery();

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

        static void DeleteByParam(int empNo)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = System.Data.CommandType.Text;
                cmd.CommandText = "delete from Employees where EmpNo=@EmpNo";

                cmd.Parameters.AddWithValue("@EmpNo", empNo);

                cmd.ExecuteNonQuery();

                Console.WriteLine("record deleted for empNo=" + empNo + "...");
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
        }

        static void DeleteByStoredPro(int empNo)
        {
            SqlConnection cn = new SqlConnection();
            cn.ConnectionString = @"Data Source = (localdb)\MSSQLLocalDB; Initial Catalog = EmployeeDB; Integrated Security = True;";
            try
            {
                cn.Open();

                SqlCommand cmd = cn.CreateCommand();

                cmd.CommandType = System.Data.CommandType.StoredProcedure;
                cmd.CommandText = "DeleteEmployee";

                cmd.Parameters.AddWithValue("@EmpNo", empNo);

                cmd.ExecuteNonQuery();

                Console.WriteLine("record deleted for empNo=" + empNo + "...");
            }
            catch(Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
            finally
            {
                cn.Close();
            }
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
