namespace Lambdas
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            // lambda for MakeDouble
            Func<int, int> obj = (a) => a * 2;
            Console.WriteLine(obj(3));
            Console.WriteLine();

            Func<int, int> obj2 = a => a * 2;   // without ()
            Console.WriteLine(obj2(5));
            Console.WriteLine();

            Func<int, int, int> obj3 = (a, b) => a + b;
            Console.WriteLine(obj3(34,5));
            Console.WriteLine();

            Func<string> obj4 = () => DateTime.Now.ToLongTimeString();
            Console.WriteLine(obj4());
            Console.WriteLine();

            Func<int, bool> obj5 = a => a % 2 == 0;
            Console.WriteLine(obj5(69));
            Console.WriteLine();

            Func<int, bool> obj6 = a =>
            {
                if (a % 2 == 0) return true;
                return false;
            };
            Console.WriteLine(obj6(45));
            Console.WriteLine();

            Predicate<Employee> obj7 = e => e.Basic > 10000;
            Console.WriteLine(obj7(new Employee { Basic=34070}));
            Console.WriteLine();
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public decimal Basic { get; set; }
    }
}
