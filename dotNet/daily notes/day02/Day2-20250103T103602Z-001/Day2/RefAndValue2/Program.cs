namespace RefAndValue2
{
    internal class Program
    {
        static void Main1()
        {
            int a=1;
            int b=2;
            Init(out a, out b);
            Swap(ref a, ref b);
            //Console.WriteLine(a);
            //Console.WriteLine(b);
            Print(in a);
            Print(b);

        }
        static void Swap(ref int i, ref int j)
        {
            int temp = i;
            i = j;
            j = temp;
        }
        //out is similar to ref - changes made in func reflect back in calling code
        //the initial value is discarded
        //out variables MUST be initialized in the function
        static void Init(out int i, out int j)
        {
            //Console.WriteLine(i); //error
            i = 1000;
            j = 2000;
        }
        static void Print(in int x)
        {
            //x is a readonly value
            //x = 100; //error
            Console.WriteLine(x);

        }
    }
}

//ref types
namespace RefAndValue3
{
    internal class Program
    {
        static void Main()
        {
            Class1 o1 = new Class1();
            o1.i = 100;
            //DoSomething1(o1);
            //DoSomething2(o1);
            //DoSomething3(ref o1);
            //DoSomething4(out o1);
            DoSomething5(in o1);
            Console.WriteLine(o1.i);
        }
        static void DoSomething1(Class1 obj)//obj = o1
        {
            //changes made in func (changing value of properties) is reflected in calling code o

            obj.i = 200;
        }
        static void DoSomething2(Class1 obj)//obj = o1
        {
            //changes made in func (obj pointing to some other block) is NOT reflected in calling code o

            obj = new Class1();
            obj.i = 200;
        }
        static void DoSomething3(ref Class1 obj)//obj = o1
        {
            //changes made in func (obj pointing to some other block) is reflected in calling code o

            obj = new Class1();
            obj.i = 200;
        }
        static void DoSomething4(out Class1 obj)//obj = null
        {
            //obj MUST be initialized
            //changes made in func (obj pointing to some other block) is reflected in calling code o

            obj = new Class1();
            obj.i = 200;
        }
        static void DoSomething5(in Class1 obj)//obj = o1
        {
            //obj CANNOT be initialized
            //obj = new Class1(); //error

            //changes made in func (changing value of properties) is reflected in calling code o
            obj.i = 200;
        }
    }

    public class Class1
    {
        public int i;
    }
}
