using System.Security.Cryptography.X509Certificates;
using System.Xml.Serialization;
using static System.Console;
namespace ClassBasic
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Console.WriteLine("Hello, Hell:)");
            WriteLine("Testing 'using static System.Console'");

            Class1 obj = new Class1();
            obj.Display();
            obj.Display("Overloaded fun.");

            WriteLine(obj.Add(3));
            WriteLine(obj.Add(2, 3));
            WriteLine(obj.Add(1, 2, 3));

            obj.DoSomething();

            WriteLine(obj.LocalOverLoading(1));
            WriteLine(obj.LocalOverLoading(1,2));
            WriteLine(obj.LocalOverLoading(1,2,3));

            obj.NamedParams(10, y: 20);
            obj.NamedParams(y:20, x:40);
            //obj.NamedParams(y:20, 40);   // default values will be passed first
            obj.NamedParams(40, y:50);

        }


        public class Class1
        {
            public void Display()
            {
                WriteLine("Display mehtod...");
            }

            public void Display(string s)
            {
                WriteLine("Display with " + s);
            }



            //public int Add(int x)
            //{
            //    return x;
            //}

            //public int Add(int x, int y)
            //{
            //    return x + y;
            //}

            //public int Add(int x, int y, int z)
            //{
            //    return x + y + z;
            //}


            // use default values for overloading funs. bcz it'll will reduce the writing same fun/code.
            //public int Add(int x=0, int y=0,int z = 0)
            //{
            //    return x+y+z;
            //}

            public int Add(int x, int y = 0, int z = 0)
            {
                return x + y + z;
            }

            public void DoSomething()
            {
                WriteLine("You're in DoSomething fun...");
                //DoSomething();    // it's recusive function

                void DoSomething2()
                {
                    WriteLine("You're in DoSomething's DoSomething2 fun....");
                }

                DoSomething2();

            }

            public  int LocalOverLoading(int a=0,int b=0,int c=0)
            {

                int res = 0;
                void Add2(int x=0, int y=0,int z=0)
                {
                    x = a;
                    y = b;
                    z = c;

                    res = x+y+z;
                }
                Add2(a, b, c);

                return res;


            }


            public void NamedParams(int x,int y)
            {
                WriteLine("NamedParams fun invoked... " + (x+y));
            }

        }


    }
}
