namespace AnonymousFunctions1
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello, World!");
            int i = 100;
            Action obj = delegate ()
            {
                Console.WriteLine(i++);
                Console.WriteLine(i);
                Console.WriteLine("Anonymous for action");
            };

            obj();
            Console.WriteLine();

            Func<int, int, int> obj2 = delegate (int a, int b)
            {
                return a + b;
            };

            Console.WriteLine(obj2(3,5));
        }
    }
}

namespace AnonymousFunctions2
{
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("Hello Programmer :)");
            Func<string> obj = delegate ()
            {
                return DateTime.Now.ToLongTimeString();
            };
            Console.WriteLine(obj());
            Console.WriteLine();

            Func<int, int> obj2 = delegate (int a)
            {
                return a * 2;
            };
            Console.WriteLine(obj2(3));
            Console.WriteLine();

            Func<int, int, int> obj3 = delegate (int a, int b)
            {
                return a + b;
            };
            Console.WriteLine(obj3(3,4));
            Console.WriteLine();

            Func<int, bool> obj4 = delegate (int a)
            {
                if (a % 2 == 0) return true;
                return false;
            };
            Console.WriteLine(obj4(5));
            Console.WriteLine();

            Func<Employee, bool> obj5 = delegate (Employee emp)
            {
                if (emp.Basic > 1000) return true;
                return false;
            };
            Employee emp = new Employee { Basic = 5784 };
            Console.WriteLine(obj5(emp));
            Console.WriteLine();


            Predicate<int> obj6 = delegate (int a)
            {
                if (a % 2 == 1) return false;
                return true;
            };
            Console.WriteLine(obj6(59));
            Console.WriteLine();

            Predicate<Employee> obj7 = delegate (Employee emp)
            {
                if (emp.Basic > 1000) return true;
                return false;
            };
            Console.WriteLine(obj7(emp));
            Console.WriteLine();
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public decimal Basic { get; set; }
    }
}