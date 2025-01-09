using System.Net.Http.Headers;

namespace OverloadingHidingOverriding
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello Programmer :)");

            DerivedClass obj = new DerivedClass();
            //obj.Display1();
            //obj.Display1("Hello");
            obj.Display2();
            obj.Display3();
        }

        static void Main()
        {
            BaseClass obj;

            obj = new BaseClass();
            obj.Display1();
            obj.Display2();
            obj.Display3();

            obj = new DerivedClass();
            Console.WriteLine();

            obj.Display1();
            obj.Display2();
            obj.Display3();

        }
    }

    public class BaseClass
    {
        public void Display1()
        {
            Console.WriteLine("base dispaly 1");
        }
        public void Display2()
        {
            Console.WriteLine("base display 2");
        }
        public virtual void Display3()
        {
            Console.WriteLine("base display 3");
        }


    }

    public class DerivedClass : BaseClass
    {
        public void Display1(string s)
        {
            Console.WriteLine("derived display 1");
        }

        public new void Display2()
        {
            Console.WriteLine("derived display 2");
        }

        public override void Display3()
        {
            Console.WriteLine("derived display 3");
        }
    }
}
