namespace FieldsAndProperties
{
    internal class Program
    {
        static void Main()
        {
            Class1 o = new Class1();
            ////o.i = 123;
            //o.Seti(123);
            //Console.WriteLine(o.Geti());

            //o.i = ++o.i + o.i++ - --o.i - o.i--;

            o.P1 = 13;  //set
            Console.WriteLine(o.P1);  //get

            o.P4 = 10;
            Console.WriteLine(o.P4);
        }
    }

    public class Class1
    {
        //private int i; //class level variable - field
        //public void Seti(int VALUE)
        //{
        //    if(VALUE <100)
        //        i = VALUE;
        //    else
        //        Console.WriteLine("invalid value");
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
                if(value < 100)
                    p1 = value;
                else
                    Console.WriteLine("invalid value");
            }
            get
            {
                return p1;
            }
        }
        private string p2;
        public string P2
        {
            set 
            { 
                p2 = value; 
            }
            get 
            { 
                return p2; 
            }
        }
        public string P3;
        //automatic property - auto property
        //no validations
        //compiler generates code for get /set
        //compiler generates private variable
        public int P4 { set; get; }

        //To Do - create a read only property
    }
}
