// See https://aka.ms/new-console-template for more information


namespace lab09MirzaMohammadAzwad21
{
    public class Program
    {
        public static void Main(string[] args)
        {
            Circle circle = new Circle(5.0);
            circle.whoami();
            Console.WriteLine(circle.Area());
            Console.WriteLine(circle.Perimeter());

            Sphere sphere = new Sphere(5.0);
            sphere.whoami();
            Console.WriteLine(sphere.SurfaceArea());
            Console.WriteLine(sphere.Volume());
            Cat cat = new Cat("kitty", "savanna", 5, 5);
            cat.Vocalize();
            cat.getInformation();
            Console.ReadKey();
        }
    }
}
