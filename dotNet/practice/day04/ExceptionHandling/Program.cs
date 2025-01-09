using System.Reflection.Metadata;

namespace ExceptionHandling
{
    internal class Program
    {
        static void Main0(string[] args)
        {
            Console.WriteLine("Hello Programmer :)");

            Class1 obj = new Class1();
            obj = null;
            int x = Convert.ToInt32(Console.ReadLine());
            obj.P1 = 100 / x;
            Console.WriteLine(obj.P1);
        }

        static void Main1()
        {
            Console.WriteLine("Hello Programmer :)");
            Class1 obj = new Class1();
            try
            {
                //obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100 / x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exception...");
            }
            catch
            {
                Console.WriteLine("Exception Occurred...");
            }
        }

        static void Main2()
        {
            Class1 obj = new Class1();
            try
            {
                //obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100 / x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exception...");
            }
            catch (DivideByZeroException exc)
            {
                Console.WriteLine("Divide by zero exception occurred...");

                Console.WriteLine();
                //Console.WriteLine(exc);
            }
            catch (NullReferenceException exc)
            {
                Console.WriteLine("Null Ref Exc occurred...");

                Console.WriteLine();
                //Console.WriteLine(exc);
            }
            catch(FormatException exc)
            {
                Console.WriteLine("Format Exc occurred....");

                Console.WriteLine();
                //Console.WriteLine(exc);
            }
        }

        static void Main() //catch base class exception before derived class   --> no error but not a good practice
        {
            Console.WriteLine("Hello Programmer :)");

            Class1 obj = new Class1();
            try
            {
                //obj = null;
                int x = Convert.ToInt32(Console.ReadLine());
                obj.P1 = 100 / x;
                Console.WriteLine(obj.P1);
                Console.WriteLine("No Exception...");
            }
            
            catch (NullReferenceException exc)
            {
                Console.WriteLine("Null Ref Exc occurred...");

                Console.WriteLine();
                //Console.WriteLine(exc);
            }
            catch (FormatException exc)
            {
                Console.WriteLine("Format Exc occurred....");

                Console.WriteLine();
                //Console.WriteLine(exc);
            }
            catch (DivideByZeroException exc)  //dividebyzero should be handeled first, not after format and nullable
            {
                Console.WriteLine("Divide by zero exception occurred...");

                Console.WriteLine();
                //Console.WriteLine(exc);
            }
            catch (Exception ex) //catches all unhandled exceptions
            {
                Console.WriteLine(ex.Message);
            }

        }
    }

    public class Class1
    {
        private int p1;
        public int P1
        {
            set
            {
                p1 = value;
            }
            get
            {
                return p1;
            }
        }
    }
}
