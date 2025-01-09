
namespace LanguageFeatures
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello Programmer :)");
            int i = 100;
            var j = 100;
            //j = "sjfkd";   // can not reassign another data type value bcz it is int and can not change to string or other data type
            //var k;    // only declaration is not allowed, initialization is mandatory
            Console.WriteLine(j.GetType());

        }
    }
}

namespace AnonymousTypes
{
    internal class Program
    {
        static void Main1()
        {
            Console.WriteLine("Hello Programmer :)");

            var obj = new { a = 1, b = "aaa", c = true };
            var obj2 = new { a = 1, b = "std", c = false, d = 1.2 };

            Console.WriteLine(obj.a);
            Console.WriteLine(obj.b);
            Console.WriteLine(obj.c);

            Console.WriteLine();

            Console.WriteLine(obj2.a);
            Console.WriteLine(obj2.b);
            Console.WriteLine(obj2.c);
            Console.WriteLine(obj2.d);

            Console.WriteLine();

            Console.WriteLine(obj.GetType());
            Console.WriteLine(obj2.GetType());
        }
    }
}

namespace PartialClasses
{
    internal class Program
    {
        static void Main1()
        {
            Class1 obj = new Class1();
            Console.WriteLine(obj.i);
            Console.WriteLine(obj.j);
            //Console.WriteLine(obj.l);
        }
    }

    public  partial class Class1
    {
        public  int i=100;
    }

    public  partial class Class1
    {
        public  int j = 200;
    }
}

//namespace PartialClasses
//{
//    public partial class Class1
//    {
//        int l = 400;
//    }
//}


namespace PartialMethods
{
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("Hello Programmer :)");

            Class1 obj = new Class1();
            Console.WriteLine(obj.Check());
            
        }
    }

    public partial class Class1
    {
        private bool isValid = true;
        partial void Validate();
        public bool Check()
        {
            Validate();
            return isValid;
        }
    }

    public partial class Class1
    {
        partial void Validate()
        {
            isValid = false;
        }
    }
}

