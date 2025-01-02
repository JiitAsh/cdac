namespace ObjectInitializers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Class1 o1 = new Class1();
            o1.i = 1;
            o1.P1 = 2;
            o1.P2 = 3;
            o1.P3 = 4;

            //object initializer
            Class1 o2 = new Class1() { i = 1, P1 = 2, P2 = 3, P3 = 4 };
            Class1 o3 = new Class1{ i = 1, P1 = 2, P2 = 3, P3 = 4 };
            
        }
    }

    public class Class1
    {
        public int i;
        public int P1 { set; get; }
        public int P2 { set; get; }
        public int P3 { set; get; }
        
    }
}
