namespace Delegates1
{
    public delegate void Del1();

    public delegate int Del2(int a, int b);
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello Programmer :)");
            Del1 obj = new Del1(Display);
            obj();
        }
        static void Main2()
        {
            Del1 obj = Display;
            obj();
            Console.WriteLine();

            obj = Show;
            obj();
            Console.WriteLine();
        }
        static void Main3()
        {
            Del1 obj = new Del1(Display);
            obj();
            Console.WriteLine();


            // adding another fun in delegate 'obj'
            obj += Show;
            obj();
            Console.WriteLine();

            obj += Display;
            obj();
            Console.WriteLine();

            obj -= Display;
            obj();
            Console.WriteLine();

            obj -= Display;
            obj();
            Console.WriteLine();

            obj -= Show;
            obj();    // will show error bcz now obj not pointing anything now it is null
            Console.WriteLine();

        }


        static void Main5()
        {
            Console.WriteLine("Hello Programmer :)");
            Del1 obj = (Del1) Delegate.Combine(new Del1(Display), new Del1(Show), new Del1(Display));
            obj();
            Console.WriteLine();

            obj = (Del1) Delegate.Remove(obj, new Del1(Display));
            obj();
            Console.WriteLine();

            obj = (Del1) Delegate.RemoveAll(obj, new Del1(Display));
            obj();
            Console.WriteLine();
        }

        static void Main6()
        {
            Del1 obj = Class1.Display;
            obj();
            Console.WriteLine();

            Class1 oc1 = new Class1();
            obj += oc1.Show;
            obj();
        }

        static void Main7()
        {
            Del2 obj = Add;
            Console.WriteLine(obj(3,4));
            Console.WriteLine();

            obj += Sub;
            Console.WriteLine(obj(3,1));
            Console.WriteLine();

        }

        static void Display()
        {
            Console.WriteLine("Display fun");
        }

        static void Show()
        {
            Console.WriteLine("Show fun");
        }

        static int Add(int a, int b)
        {
            return a + b;
        }

        static int Sub(int a, int b)
        {
            return a - b;
        }
    }

    public class Class1
    {
        public static void Display()
        {
            Console.WriteLine("Display fun");
        }

        public void Show()
        {
            Console.WriteLine("Show fun");
        }
    }
}

namespace Delegates2
{
    public delegate int Del(int a, int b);
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("Hello Programmer :)");
            Console.WriteLine(Operation(Add, 3, 4));
            Console.WriteLine(Operation(Sub, 4, 1));
        } 

        static int Add(int a, int b)
        {
            return a + b;
        }

        static int Sub(int a, int b)
        {
            return a - b;
        }


        static int Operation(Del delObj, int a, int b)
        {
            return delObj(a, b);
        }
    }
}