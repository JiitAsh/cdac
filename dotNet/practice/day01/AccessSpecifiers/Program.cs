namespace AccessSpecifiers
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Console.WriteLine("Hello Programmer :)");
            BaseClass obj = new BaseClass();
            //obj.

            DerivedClass obj2 = new DerivedClass();
            //obj2.

            DerivedClass2 obj3 = new DerivedClass2();
            //ojb3.
        }
    }

    public class BaseClass
    {
        int a;
        public int PUBLIC;
        private int PRIVATE;
        protected int PROTECTED;
        internal int INTERNAL;
        protected internal int PROTECTED_INTERNAL;
        private protected int PRIVATE_PROTECTED;
    }

    public class DerivedClass : TestAccessSpecifiers.BaseClass
    {

        void DoSomething()
        {
            //this.
        }

    }


    public class DerivedClass2 : BaseClass
    {

        void DoSomething()
        {
            //this.
        }

    }


}
