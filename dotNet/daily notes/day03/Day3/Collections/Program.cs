using System.Collections;
using System.Collections.Generic;

namespace Collections
{
    internal class Program
    {
        static void Main1()
        {
            ArrayList objArrayList = new ArrayList();
            objArrayList.Add("Vikram");
            objArrayList.Add(10);
            //object = int
            objArrayList.Add(true);

            objArrayList.Insert(0, "inserted");

            ArrayList objArrayList2 = new ArrayList();
            objArrayList2.Add(10);
            objArrayList2.Add(20);
            objArrayList2.Add(30);

            //objArrayList.AddRange(objArrayList2);
            //objArrayList.InsertRange(0,objArrayList2);

            objArrayList.Remove("Vikram");  //object
            objArrayList.RemoveAt(0);  //index
            //objArrayList.RemoveRange(start, no);
            //objArrayList.RemoveRange(0, 3);

            //ArrayList ar3 = (ArrayList)objArrayList.Clone();

            //objArrayList.Clear();

            bool ispresent = objArrayList.Contains(10);

            objArrayList2 = objArrayList.GetRange(0,3); //start, count

            ArrayList objArrayList3 = new ArrayList();
            objArrayList3.Add(10);
            objArrayList3.Add(20);
            objArrayList3.Add(30);
            objArrayList.SetRange(0, objArrayList2); //overwrite

            //objArrayList.Sort() -- try with IComparer

            object[] arr = new object[objArrayList.Count];
            objArrayList.CopyTo(arr);

            object[] arr2 = objArrayList.ToArray()!;

            //objArrayList[]

            //Console.WriteLine(objArrayList.Count);
            foreach (object item in objArrayList)
            {
                Console.WriteLine(item);
            }
        }
        static void Main2()
        {
            ArrayList objArrayList = new ArrayList();
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");
            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.Add("a");
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

            objArrayList.TrimToSize();
            Console.WriteLine($"Count={objArrayList.Count}, Capacity={objArrayList.Capacity}");

        }

        static void Main3()
        {
            //Hashtable objDictionary = new Hashtable();
            SortedList objDictionary = new SortedList();
            objDictionary.Add(4, "Shivangi");
            objDictionary.Add(1, "Ankit");
            objDictionary.Add(2, "Raj");
            objDictionary.Add(3, "Shivani");
            objDictionary.Add(5, "Vikram");

            objDictionary[6] = "new";
            objDictionary[5] = "update";

            objDictionary.Remove(6);//key
            objDictionary.RemoveAt(4); //index

            foreach (DictionaryEntry item in objDictionary)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value);
            }
            objDictionary.Contains(1); //key
            objDictionary.ContainsKey(1); //key
            objDictionary.ContainsValue("Ankit"); //value

            //objDictionary.GetByIndex(10) -- returns value at given index
            //objDictionary.GetKey(10) -- returns key at given index

            IList keys = objDictionary.GetKeyList();
            IList value = objDictionary.GetValueList();
            objDictionary.IndexOfKey(1); // get index at given key
            objDictionary.IndexOfValue("Ankit"); // get index at given value
            //objDictionary.SetByIndex(1, "changed");

        }
        static void Main4()
        {
            Stack s = new Stack();
            s.Push("aa");
            Console.WriteLine(s.Peek());
            Console.WriteLine(s.Pop());

            Queue q = new Queue();
            q.Enqueue(1);
            Console.WriteLine(q.Peek());
            Console.WriteLine(q.Dequeue());
        }
        static void Main5()
        {
            List<int> list = new List<int>();
            list.Add(1);

            List<string> list2 = new List<string>();
            list2.Add("sss");

            List<Employee> employees = new List<Employee>();
            employees.Add(new Employee { EmpNo = 1, Name = "Ankit" });
            employees.Add(new Employee { EmpNo = 2, Name = "Raj" });

            foreach (int item in list)
            {
                Console.WriteLine(item);
            }
            foreach (Employee e in employees)
            {
                Console.WriteLine(e.Name);
            }
        }
        static void Main6()
        {
            SortedList<int, Employee> emps = new SortedList<int, Employee>();
            emps.Add(1, new Employee { EmpNo = 1, Name = "Ankit" });
            emps.Add(2, new Employee { EmpNo = 2, Name = "Raj" });
            foreach (KeyValuePair<int, Employee> item in emps)
            {
                Console.WriteLine(item.Key);
                Console.WriteLine(item.Value.Name);
            }
        }
        static void Main()
        {
            Stack<int> stack = new Stack<int>();
            stack.Push(1);
            Console.WriteLine(stack.Peek());
            Console.WriteLine(stack.Pop());

            Queue<int> queue = new Queue<int>();
            queue.Enqueue(1);
            Console.WriteLine(queue.Peek());
            Console.WriteLine(queue.Dequeue());
        }
    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public string Name { get; set; }

    }
}
/*
https://learn.microsoft.com/en-us/dotnet/standard/collections/commonly-used-collection-types
https://learn.microsoft.com/en-us/dotnet/standard/collections/
https://learn.microsoft.com/en-us/dotnet/standard/collections/selecting-a-collection-class

 */