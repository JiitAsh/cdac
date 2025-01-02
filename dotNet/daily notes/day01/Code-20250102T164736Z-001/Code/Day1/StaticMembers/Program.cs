namespace StaticMembers
{
    internal class Program
    {
        static void Main()
        {
            Class1 o1;
            o1= new Class1();
            Class1.s_Display();
            Class1 o2 = new Class1();

            o1.i = 100;
            o2.i = 200;
            o1.Display();


            Class1.s_i = 1000;
            Console.WriteLine(Class1.s_i);
            Class1.s_P1 = 10;

        }
    }
    public class Class1
    {
        public int i;

        //only a single copy for the entire class (shared data)
        public static int s_i;

        public void Display()
        {
            Console.WriteLine("display");
            Console.WriteLine(i);
            Console.WriteLine(s_i);
        }
        //static methods can be called directly from the class without creating an object of the class

        public static  void s_Display()
        {
            Console.WriteLine("static display");
            //from a static member you can only access static members directly.
            //to access a non static member you need to have an object reference
            //Console.WriteLine(i);  //error
            Console.WriteLine(s_i);

        }

        private int p1;
        public int P1
        {
            set
            {
                if (value < 100)
                    p1 = value;
                else
                    Console.WriteLine("invalid value");
            }
            get
            {
                return p1;
            }
        }

        private static int s_p1;
        public static int s_P1
        {
            set
            {
                if (value < 100)
                    s_p1 = value;
                else
                    Console.WriteLine("invalid value");
            }
            get
            {
                return s_p1;
            }
        }
        //why constructor - to initialise data
        //why static constructor - to initialise Static data

        //implicitly private - cannot have an access specifier
        //parameterless
        //cannot be overloaded
        //when is the static constructor called? - when class is loaded
        //when is the class loaded? - 1st object created OR
        //static member accessed for the 1st time
        static Class1()
        {
            Console.WriteLine("static cons");
            s_i = 200;
        }
        public Class1()
        {
            Console.WriteLine("cons");
        }
    }
}



//why create static variable - single copy
//why property - validations
//why static property -  single copy with validations

//why constructor - to initialise data members
//why static constructor - to initialise static data members


//To Do - create a static class
//can only contain static members
//cannot be instantiated
//cannot be used as a base class