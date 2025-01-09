namespace NullableTypes
{
    internal class Program
    {
        static void Main()
        {
            int? i = 10;
            i= null;

            int j;

            if (i != null) 
                j = (int)i;
            else
                j = 0;

            if(i.HasValue)
                j = i.Value;
            else
                j = 0;

            j = i.GetValueOrDefault();
            j = i.GetValueOrDefault(100);

            j = i ?? 0; //null coalasence operator

            Console.WriteLine(j);
        }
        static void NullableRefTypes()
        {
            string? s;
            s = Console.ReadLine();
        }
    }
}
