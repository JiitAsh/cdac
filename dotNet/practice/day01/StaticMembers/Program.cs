using System.Net.Http.Headers;
using System.Runtime.CompilerServices;

namespace StaticMembers
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");
            Class1 obj;
            obj = new Class1();

            Student.marks=12;
            Student.Dispaly();
        }

        public class Class1
        {
            static Class1()
            {
                Console.WriteLine("static ctor is called....");
            }
        }

        public static class Student
        {
            public static int marks;
            static Student()
            {
                marks = 65;
                Console.WriteLine("Static ctor is called of static class 'Student'");
                Console.WriteLine("marks are : " + marks);
                

            }

            public static void Dispaly()
            {
                Console.WriteLine("marks are : " + marks);
            }
        }


        //public class Std : Student     // cannot derive from static class
        //{

        //}

    }
}
