namespace OverloadingHidingOverriding
{
    internal class Program
    {
        static void Main1()
        {
            DerivedClass obj = new DerivedClass();
            //obj.Display1();
            //obj.Display1("sss");
            obj.Display2();
            obj.Display3();
        }
        static void Main()
        {
            BaseClass obj;

            obj = new BaseClass();
            obj.Display2();  //non virtual - early binding / compile time binding
            obj.Display3(); //virtual - late bound / run time binding

            Console.WriteLine();
            obj = new DerivedClass();
            obj.Display2();
            obj.Display3();

            Console.WriteLine();
            obj = new SubDerivedClass();
            obj.Display2();
            obj.Display3();

            Console.WriteLine();
            obj = new SubSubDerivedClass();
            obj.Display2();
            obj.Display3();

            SubSubDerivedClass o2 = new SubSubDerivedClass();

        }
    }

    public class BaseClass
    {
        public void Display1()
        {
            Console.WriteLine("base display1");
        }
        public void Display2()
        {
            Console.WriteLine("base display2");
        }
        public virtual void Display3()
        {
            Console.WriteLine("base display3");
        }
    }
    public class DerivedClass : BaseClass
    {
        //overloading 
        public void Display1(string s)
        {
            Console.WriteLine("derived display1" + s);
        }
        //hiding
        public new void Display2()
        {
            Console.WriteLine("derived display2");
        }
        //overriding
        public override void Display3()
        {
            Console.WriteLine("derived display3");
        }
    }
    public class SubDerivedClass : DerivedClass
    {
       
        //overriding
        public sealed override void Display3()
        {
            Console.WriteLine("subderived display3");
        }
    }
    public class SubSubDerivedClass : SubDerivedClass
    {
        public new void Display3()
        {
            Console.WriteLine("subsubderived display3");
        }
    }
}
