using System.Dynamic;

namespace FieldAndProperties
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            //Class1 obj = new Class1();
            //obj.Seti(230);

            //Console.WriteLine(obj.Geti());


            Class1 obj = new Class1();

            obj.P1 = 123;   // calling set 
            Console.WriteLine(obj.P1);   // calling get

            obj.P3 = 123;
            Console.WriteLine(obj.P3);

            obj.P4 = 900;
            Console.WriteLine(obj.P4);

            //obj.P5 = 340;    // will show error bcz P5 is read only property
            Console.WriteLine(obj.P5);

        }
    }

    public class Class1
    {
        //private int i;
        //public void Seti(int val)
        //{
        //    if (val < 100)
        //    {
        //        i = val;
        //    }
        //    else
        //    {
        //        Console.WriteLine("Invalid value");
        //    }
        //}

        //public int Geti()
        //{
        //    return i;  
        //}

        private int p1;
        public int P1
        {
            set
            {
                if (value < 100)
                {
                    p1 = value;
                }
                else
                {
                    Console.WriteLine("Invalid value");
                }
            }

            get
            {
                return p1;
            }
        }

        public int P3;

        public int P4 { set; get; }


        public int P5
        {
            get
            {
                return 230;
            }
        }
    }
}
