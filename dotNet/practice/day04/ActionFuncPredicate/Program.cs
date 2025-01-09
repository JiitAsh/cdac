namespace ActionFuncPredicate
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Action obj = Display;
            obj();

            Action<string> obj2 = DisplayName;
            obj2("Ram");
        }

        static void Main()
        {
            Console.WriteLine("Hello Programmer :)");

            Func<string> obj = GetTime;
            Console.WriteLine(obj());

            Func<int, int> obj2 = MakeDouble;
            Console.WriteLine(obj2(34));

            Func<int, int, int> obj3 = Add;
            Console.WriteLine(obj3(3,4));

            Func<int, bool> obj4 = IsEven;
            Console.WriteLine(obj4(33));

            Func<Employee, bool> obj5 = BasicMoreThan1000;
            Employee e = new Employee { Basic = 3400 };
            Console.WriteLine(obj5(e));

            Console.WriteLine();
            Predicate<int> obj6 = IsEven;
            Console.WriteLine(obj6(45));

            Predicate<Employee> obj7 = BasicMoreThan1000;
            Console.WriteLine(obj7(e));
        }

        static void Display()
        {
            Console.WriteLine("Display fun");
        }

        static void DisplayName(string name)
        {
            Console.WriteLine("Hello " + name);
        }

        static void Show()
        {
            Console.WriteLine("Show fun");
        }

        static int Add(int a, int b)
        {
            return a + b;
        }

        static string GetTime()
        {
            return DateTime.Now.ToLongTimeString();
        }

        static int MakeDouble(int a)
        {
            return a * 2;
        }

        static bool IsEven(int a)
        {
            if (a % 2 == 0) return true;
            return false;
        }

        static bool BasicMoreThan1000(Employee e)
        {
            if (e.Basic > 1000) return true;
            return false;
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public decimal Basic { get; set; }
    }
}