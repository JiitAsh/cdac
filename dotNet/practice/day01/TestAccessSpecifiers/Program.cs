namespace TestAccessSpecifiers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello Programmer :)");
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
}
