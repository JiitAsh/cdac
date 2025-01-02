namespace InheritanceExamples
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            //BaseClass objB = new BaseClass();
            //BaseClass objB = new BaseClass(2);

            //DerivedClass objD = new DerivedClass();
            DerivedClass objD = new DerivedClass(23);


        }

        
    }

    public class BaseClass
    {
        private int i;
        public BaseClass()
        {
            Console.WriteLine("base class param less ctor invoked....");
        }

        public BaseClass(int i)
        {
            this.i = i;
            Console.WriteLine("base class param ctor invoked....");
        }
    }

    public class DerivedClass : BaseClass
    {
        public int i;
        public DerivedClass()
        {
            Console.WriteLine("derived class param less ctor invoked....");
        }

        public DerivedClass(int i)
        {
            this.i = i;
            Console.WriteLine("derived class param ctor invoked....");
        }
    }

}
