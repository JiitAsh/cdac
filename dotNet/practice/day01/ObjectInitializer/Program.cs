namespace ObjectInitializer
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Class1 obj = new Class1();
            obj.i = 10;
            obj.P1 = 34;
            obj.P2 = 45;
            obj.P3 = 56;

            Console.WriteLine(obj.i);
            Console.WriteLine(obj.P1);
            Console.WriteLine(obj.P2);
            Console.WriteLine(obj.P3);

            Console.Write('\n');

            // using object initializer
            Class1 obj2 = new Class1() { i = 11, P1 = 12, P2 = 13, P3 = 14 };
            Console.WriteLine(obj2.i);
            Console.WriteLine(obj2.P1);
            Console.WriteLine(obj2.P2);
            Console.WriteLine(obj2.P3);


            Console.Write('\n');
            Class1 obj3 = new Class1{ i = 311, P1 = 312, P2 = 313, P3 = 314 };
            Console.WriteLine(obj3.i);
            Console.WriteLine(obj3.P1);
            Console.WriteLine(obj3.P2);
            Console.WriteLine(obj3.P3);
        }

        public class Class1
        {
            public int i;
            public int P1 { set; get; }
            public int P2 { set; get; }
            public int P3 { set; get; }
        } 
    }
}
