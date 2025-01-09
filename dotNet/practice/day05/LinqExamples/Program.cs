using System.ComponentModel.DataAnnotations;
using System.Security.Cryptography;

namespace LinqExamples1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello, World!");
        }
    }
}

namespace LinqExamples2
{
    internal class Program 
    {
        static List<Employee> lstEmp = new List<Employee>();
        static List<Department> lstDept = new List<Department>();


        public static void AddRecs()
        {
            lstDept.Add(new Department { DeptNo = 10, DeptName = "SALES" });
            lstDept.Add(new Department { DeptNo = 20, DeptName = "MKTG" });
            lstDept.Add(new Department { DeptNo = 30, DeptName = "IT" });
            lstDept.Add(new Department { DeptNo = 40, DeptName = "HR" });

            lstEmp.Add(new Employee { EmpNo = 1, Name = "Vikram", Basic = 10000, DeptNo = 10, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 2, Name = "Vishal", Basic = 11000, DeptNo = 10, Gender = "M" });

            lstEmp.Add(new Employee { EmpNo = 3, Name = "Abhijit", Basic = 12000, DeptNo = 20, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 4, Name = "Mona", Basic = 11000, DeptNo = 20, Gender = "F" });
            lstEmp.Add(new Employee { EmpNo = 5, Name = "Shweta", Basic = 12000, DeptNo = 20, Gender = "F" });

            lstEmp.Add(new Employee { EmpNo = 6, Name = "Sanjay", Basic = 11000, DeptNo = 30, Gender = "M" });
            lstEmp.Add(new Employee { EmpNo = 7, Name = "Arpan", Basic = 10000, DeptNo = 30, Gender = "M" });

            lstEmp.Add(new Employee { EmpNo = 8, Name = "Shraddha", Basic = 11000, DeptNo = 40, Gender = "F" });
        }



        static void Main0()
        {
            Console.WriteLine("Hello Programmer :)");
        }

        static bool IsBasicGreaterThan10000(Employee emp)
        {
            return emp.Basic > 10000;
        }
        static void Main4()
        {
            AddRecs();
            Console.WriteLine("Hello Programmer :)");
            Console.WriteLine();

            //var emps = from emp in lstEmp
            //           where emp.Basic > 10000
            //           select emp;

            //var emps = lstEmp.Select(IsBasicGreaterThan10000);

            //var emps = lstEmp.Select(delegate (Employee emp) { return emp.Basic > 10000; });

            //var emps = lstEmp.Select(emp => emp.Basic > 10000);

            //var emps = lstEmp.Where(IsBasicGreaterThan10000);

            //var emps = lstEmp.Where(delegate (Employee emp) { return emp.Basic > 10000; });

            //var emps = lstEmp.Where(emp => emp.Basic > 10000);

            //var emps = lstEmp.Where(emp => emp.Basic > 10000).Select(emp => emp);

            //var emps = lstEmp.Select(emp => emp).Where(emp => emp.Basic > 10000);

            //var emps = lstEmp.Where(emp => emp.Basic > 10000).Select(emp => emp.Name);

            //var emps = lstEmp.Select(emp => emp.Name).Where(emp => emp.Basic > 10000);    // error bcz we are selecting names and then from name list we are trying to select salary which is not present in name list. salary is present in whole details list.

            // always write where before select;

            var emps = lstEmp.Select(emp => emp.Basic).Where(emp => emp > 10000);   

            foreach(var item in emps)
            {
                //Console.WriteLine(item.Name);
                Console.WriteLine(item);
            }
        }

        static void Main5()
        {
            AddRecs();

            Console.WriteLine("Hello Programmer :)");
            Console.WriteLine();

            //var emps = from emp in lstEmp
            //           orderby emp.Name
            //           select emp;


            //var emps = lstEmp.OrderBy(delegate (Employee emp) { return emp.Name; });

            //var emps = lstEmp.OrderBy(emp => emp.Name);

            //var emps = lstEmp.OrderByDescending(emp => emp.Name);



            //var emps = from emp in lstEmp
            //           orderby emp.DeptNo ascending, emp.Name descending
            //           select emp;

            var emps = lstEmp.OrderBy(emp => emp.DeptNo).ThenByDescending(emp => emp.Name);

            foreach(var item in emps)
            {
                Console.WriteLine(item);
            }
        
        }

        static void Main()
        {
            AddRecs();

            Console.WriteLine("Hello Programmer :)");
            Console.WriteLine();

            //var emps = from emp in lstEmp
            //           join dept in lstDept
            //           on emp.DeptNo equals dept.DeptNo
            //           select new { emp, dept };

            //var emps = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp, dept });


            //var emps = from emp in lstEmp
            //           join dept in lstDept
            //           on emp.DeptNo equals dept.DeptNo
            //           select new { emp.Name, dept.DeptName };


            var emps = lstEmp.Join(lstDept, emp => emp.DeptNo, dept => dept.DeptNo, (emp, dept) => new { emp.Name, dept.DeptName });

            foreach(var item in emps)
            {
                Console.WriteLine(item);
            }
        }
    }


    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }
        public decimal Basic { get; set; }
        public int DeptNo { get; set; }
        public string Gender { get; set; }
        public override string ToString()
        {
            string s = Name + "," + EmpNo.ToString() + "," + Basic.ToString() + "," + DeptNo.ToString();
            return s;
        }
    }
    public class Department
    {
        public int DeptNo { get; set; }
        public string DeptName { get; set; }

        public override string ToString()
        {
            return DeptName + ", " + DeptNo;
        }
    }

}
