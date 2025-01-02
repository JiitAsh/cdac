//using Payroll.n1;
global using Payroll.n1;  //for the entire project
using System.Data;
//using static System.Console;  
namespace ClassBasics
{
    internal class Program
    {
        static void Main1()
        {
            //Payroll.Employee o = new Payroll.Employee();
            ////Payroll.n1.Class1;
            //Class1 o2= new Class1();
            Console.WriteLine("Hello, World!");
            Console.WriteLine("aa");
            //WriteLine("aa");  //works if using static is given
        }
        static void Main()
        {
            //Class1 obj; //obj is a reference of type Class1
            //obj = new Class1(); //new Class1() is the object
            Class1 obj = new Class1();
            obj.Display();
            obj.Display("aaa");

            //positional parameters
            Console.WriteLine(obj.Add(10, 20,30));
            Console.WriteLine(obj.Add(10, 20));
            Console.WriteLine(obj.Add(10));
            Console.WriteLine(obj.Add());

            //named parameters
            Console.WriteLine(obj.Add(x: 10, y: 20, z: 30));
            Console.WriteLine(obj.Add(z: 30, x: 10, y: 20));
            Console.WriteLine(obj.Add(z: 30, y: 20));
            Console.WriteLine(obj.Add(10,z: 30));
            Console.WriteLine(obj.Add(z: 30, x: 10));

            obj.DoSomething();

        }
    }

    public class Class1
    {
        public void Display()
        {
            Console.WriteLine("Display");
        }
        //func overloading
        public void Display(string s)
        {
            Console.WriteLine("Display" + s);
        }

        //public int Add(int x, int y, int z)
        //{
        //    return x + y;
        //}
        //public int Add(int x, int y)
        //{
        //    return x + y;
        //}

        //default values
        //given from right to left
        //        public int Add(int x, int y = 0, int z=0) - okay
        //        public int Add(int x=0, int y = 0, int z) - not okay
        public int Add(int x=0, int y = 0, int z=0)
        {
            return x + y;
        }

        public void DoSomething()
        {
            //int i; //local variable
            //Console.WriteLine(i); //error - unassigned

            int i = 10;
            Console.WriteLine(i);

            DoSomething2();

            //local function - func defined within another func
            //implicitly private

            void DoSomething2()
            {
                //can access local variables declared in the outer function
                Console.WriteLine(++i);
            }
            //TO Do - try to overload a local function
        }
        

    }
}

namespace Payroll
{
    public class Employee {
        static void Main1()
        {

        }
    }
    public class Department { }
    namespace n1
    {
        public class Class1 { }
    }
}