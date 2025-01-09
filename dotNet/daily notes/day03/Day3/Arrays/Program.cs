namespace Arrays
{
    internal class Program
    {
        static void Main1()
        {
            int[] arr = new int[5];
            for (int i = 0; i < arr.Length; i++)
            {
                // Console.Write("Enter value for arr[" + i + "] :"); //string concatenation
                //Console.Write("Enter value for arr[{0}] :", i); //placeholders
                Console.Write($"Enter value for arr[{i}] :"); //interpolation
                arr[i] =int.Parse( Console.ReadLine()!);
            }
            Console.WriteLine();
            foreach (int item in arr)
            {
                //item = 10; //error - item is readonly
                Console.WriteLine(item);
            }
        }
        static void Main2()
        {
            int[] arr = { 10, 20, 30, 40 };
            int[] arr2 = new int[4] { 1, 2, 3,4 };

            int pos = Array.IndexOf(arr, 20);
            pos = Array.LastIndexOf(arr, 20);
            if (pos == -1)
            {
                Console.WriteLine("not found");
            }
            pos = Array.BinarySearch(arr, 20);
            if (pos < 0)
            {
                Console.WriteLine("not found");
            }

            Array.Clear(arr);

            Array.Copy(arr, arr2, arr.Length);

            //Array.ConstrainedCopy
            Array.Reverse(arr); 
            Array.Sort(arr);
        }
        static void Main3()
        {
            int[,] arr= new int[5,3];
            //arr[00 01, 02 
            //....40, 41 42
            Console.WriteLine(arr.Length); //15
            Console.WriteLine(arr.Rank); //no of dimensions
            Console.WriteLine(arr.GetLength(0)); //5
            Console.WriteLine(arr.GetLength(1)); //3

            Console.WriteLine(arr.GetUpperBound(0)); //4
            Console.WriteLine(arr.GetUpperBound(1)); //2

            for (int i = 0; i < arr.GetLength(0); i++)
                for(int j = 0; j < arr.GetLength(1); j++)
                {
                    //Console.Write("Enter value for arr[{0},{1}] :", i, j); //placeholders
                    Console.Write($"Enter value for arr[{i},{j}] :"); //interpolation
                    arr[i,j] = int.Parse(Console.ReadLine()!);
                }

            for (int i = 0; i < arr.GetLength(0); i++)
                for (int j = 0; j < arr.GetLength(1); j++)
                {//the value of arr[0,0] is 10
                    Console.WriteLine($"the value of arr[{i},{j}] is {arr[i,j]}");
                }

        }
        static void Main4()
        {
            //jagged
            int[][] arr = new int[4][];

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    arr[i] = new int[x]
            //}

            arr[0] = new int[3]; // arr[0][0] arr[0][1] arr[0][2]
            arr[1] = new int[4]; // arr[1][0] arr[1][1] arr[1][2] arr[1][3]
            arr[2] = new int[2];//  arr[2][0] - arr [2][1]
            arr[3] = new int[3];//  arr[3][0] arr[3][1] arr[3][2]

            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.Write("enter value for subscript [{0}][{1}] : ", i, j);
                    arr[i][j] = Convert.ToInt32(Console.ReadLine());
                }
                Console.WriteLine();
                Console.WriteLine();
            }


            Console.WriteLine();
            Console.WriteLine();
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr[i].Length; j++)
                {
                    Console.WriteLine("value for subscript {0},{1} is {2}  ", i, j, arr[i][j]);

                }
            }
            Console.ReadLine();
        }

        static void Main()
        {
            Employee[] arr = new Employee[4];
            //arr[0] = new Employee();
            //arr[1] = new Employee();
            //arr[2] = new Employee();
            //arr[3] = new Employee();
            for (int i = 0;i < arr.Length; i++)
                arr[i] = new Employee();
            foreach (Employee e in arr)
            {
                //e = new Employee();  //error
                e.Name = Console.ReadLine();
            }
        }

    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public string? Name { get; set; }

    }
}