namespace Interfaces
{
    internal class Program
    {
        static void Main1(string[] args)
        {
            Console.WriteLine("Hello Programmer :)");
            Class obj = new Class();
            obj.Display();
            // method 1
            obj.Delete();
            obj.Insert();
            obj.Update();

            Console.WriteLine();
            // method 2 - explicit reference
            IDbFun obj1;
            obj1 = obj;
            obj1.Delete();
            obj1.Update();
            obj1.Insert();

            Console.WriteLine();
            // method 3 - implicit reference
            ((IDbFun)obj).Insert();
            ((IDbFun)obj).Update();
            ((IDbFun)obj).Delete();
            //((IDbFun)obj).Display();   // can not accesss, here we know that object is of child but reference is not of child, here refence is of parent(papa).



            Console.WriteLine();
            // method 4
            (obj as IDbFun).Delete();
            (obj as IDbFun).Insert();
            (obj as IDbFun).Update();
            //(obj as IDbFun).Display();    // can not accesss, here we know that object is of child but reference is not of child, here refence is of parent(papa).
        }
    }

    public interface IDbFun
    {
        void Insert();
        void Update();
        void Delete();
    }

    public class Class : IDbFun
    {
        public void Display()
        {
            Console.WriteLine("Display from class...");
        }
        public void Delete()
        {
            Console.WriteLine("Delete from class...");
        }

        public void Insert()
        {
            Console.WriteLine("Insert from class...");
        }

        public void Update()
        {
            Console.WriteLine("Update from class...");
        }
    }
}

namespace Interfaces2
{
    internal class Program
    {
        static void Main2()
        {
            Console.WriteLine("You're in Interface 2.....");

            Class obj = new Class();
            obj.Insert();
            obj.Update();
            obj.Open();
            obj.Close();
            //obj.Delete();

            IDbFun obj1 = new Class();
            obj1.Delete();

            (obj as IDbFun).Delete();
            ((IDbFun)obj).Delete();

            (obj as IFileFun).Delete();
            ((IFileFun)obj).Delete();
        }
    }

    public interface IDbFun
    {
        void Insert();
        void Update();
        void Delete();
    }

    public interface IFileFun
    {
        void Open();
        void Close();
        void Delete();
    }

    public class Class : IDbFun, IFileFun
    {
        public void Insert()
        {
            Console.WriteLine("IDbFun insert in Class");
        }

        public void Update()
        {
            Console.WriteLine("IDbFun update in Class");
        }

        public void Open()
        {
            Console.WriteLine("IFileFun open in Class");
        }

        public void Close()
        {
            Console.WriteLine("IFileFun close in Class");
        }


        //public void IDbFun.Delete()    // can not use public 
        //{

        //}

        //public void IFileFun.Delete()   // can not use public 
        //{

        //}



        // explicit implementation
        void IDbFun.Delete()
        {
            Console.WriteLine("IDbFun delete in Class");
        }

        void IFileFun.Delete()
        {
            Console.WriteLine("IFileFun delete in Class");
        }



        //implicit implementation
        //public void Delete()
        //{
        //    Console.WriteLine("Common delete method for both...");
        //}
    }
}

namespace Interfaces3
{
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("You're in Interfaces 3...");
        }
    }
}
