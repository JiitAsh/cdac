namespace AbstractClasses
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello, World!");
            //AbsClass1 obj = new AbsClass1() ;
            AbsClass1 obj;
            obj = new DerivedClass();
            obj.Display();
            obj.Display2();


        }
    }

    public abstract class AbsClass1
    {
        public void Display()
        {
            Console.WriteLine("display method of AbsClass1...");
        }

        public abstract void Display2();


    }

    //public abstract class DerivedClass : AbsClass1
    //{
    //    public new void Display()
    //    {
    //        Console.WriteLine("display method of DerivedClass...");
    //    }


    //}

    //public class SubClass : DerivedClass
    //{
    //    public override void Display2()
    //    {
    //        throw new NotImplementedException();
    //    }
    //}


    public  class DerivedClass : AbsClass1
    {
        public new void Display()
        {
            Console.WriteLine("display method of DerivedClass...");
        }

        public override void Display2()
        {
            Console.WriteLine("derived class display2...");
        }
    }

}


namespace AbstractClasses2
{
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("Hello Programmer :), from AbstractClasses2...");

            AbsClass obj;
            //obj = new AbsClass();

            obj = new DerivedClass();
            obj.Display();
            obj.Show();

            Console.WriteLine();
            DerivedClass obj2 = new DerivedClass();
            obj2.Display();
            obj2.Show();

            Console.WriteLine();
            SubClass obj3 = new SubClass();
            obj3.Display();
        }
    }

    public abstract class AbsClass
    {
        public abstract void Display();
        public abstract void Show();
    }



    public class DerivedClass : AbsClass
    {
        public override void Display()
        {
            Console.WriteLine("Display in derived....");
        }

        public override void Show()
        {
            Console.WriteLine("Show in derived...");
        }
    }

    public class SubClass : DerivedClass
    {
        public new void Display()
        {
            Console.WriteLine("Display in SubClass...");
        }
    }

    
}