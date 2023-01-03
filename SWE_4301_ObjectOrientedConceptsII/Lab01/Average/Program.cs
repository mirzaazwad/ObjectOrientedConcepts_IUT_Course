// See https://aka.ms/new-console-template for more information
public static class Average
{
    public static void average(string a,params int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < arr.Length; i++)
        {
            sum+=arr[i];
            
        }
        Console.Write(a+": ");
        Console.WriteLine(sum/arr.Length);
        
    }


}

public class Program
{
    public static void Main(string[] Args)
    {
        Average.average("Average",5, 6, 7);

    }
}
