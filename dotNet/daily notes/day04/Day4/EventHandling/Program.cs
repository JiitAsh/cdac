namespace EventHandling
{
    internal class Program
    {
        static void Main()
        {
            Class1 objClass1 = new Class1();
            objClass1.InvalidP1 += objClass1_InvalidP1;
            objClass1.P1 = 1000;
        }

        static void objClass1_InvalidP1()
        {
            Console.WriteLine("Event handled");
        }
    }

    //step 1 : create a delegate class having the same signature
    // as the event handler function
    public delegate void InvalidP1EventHandler();
    public class Class1
    {
        //step 2 : declare the event
        //event is a delegate reference
        public event InvalidP1EventHandler InvalidP1;

        private int p1;
        public int P1
        {
            get
            {
                return p1;
            }
            set
            {
                if (value < 100)
                    p1 = value;
                else
                {
                    //step 3 : raise the event 
                    InvalidP1();
                }
            }
        }
    }
}