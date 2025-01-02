using System.Net.Http.Headers;

namespace Constructors
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Class1 obj;
            obj = new Class1();
            obj = new Class1(45);

        }
    }

    public class Class1
    {
        public int i;
        //public Class1()
        //{
        //    i = 10;
        //    Console.WriteLine("No params ctor called");
        //}

        //public Class1(int i)
        //{
        //    this.i = i;
        //    Console.WriteLine("ctor with param called");
        //}

        public Class1(int i = 20)
        {
            this.i = i;
            Console.WriteLine("Overloaded fun called...");
        }


    }
}
