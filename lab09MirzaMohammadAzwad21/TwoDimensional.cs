using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab09MirzaMohammadAzwad21
{
    public abstract class TwoDimensional : Properties//single-level inheritance
    {
        public abstract double Area();
        public abstract double Perimeter();
        public abstract void whoami();
    }

    //Shapes given below Circle, Rectangle, Parallelogram, Trapezium
    public class Circle : TwoDimensional//multi-level inheritance
    {
        private double radius;
        public Circle(double radius)
        {
            this.radius = radius;
        }
        public double Radius
        {
            get { return radius; }
            set { radius = value; }
        }
        public override double Area()
        {
            return Math.PI * radius * radius;
        }
        public override double Perimeter()
        {
            return Math.PI * radius * 2;
        }

        public override void whoami()
        {
            Console.WriteLine("I am a Circle of radius " + Convert.ToString(radius) + ". I am a 2D shape");
        }
    }
    public class Rectangle : TwoDimensional//multi-level inheritance
    {
        private double length, breadth;
        public double Length
        {
            get { return length; }
            set { length = value; }
        }
        public double Breadth
        {
            get { return breadth; }
            set { breadth = value; }
        }
        public override double Area()
        {
            return length * breadth;
        }
        public override double Perimeter()
        {
            return 2 * length * breadth;
        }

        public override void whoami()
        {
            Console.WriteLine("I am a Rectange of length " + Convert.ToString(length) + " and breadth " + Convert.ToString(breadth) + ". I am a 2D shape");
        }

    }

    public class Parallelogram : TwoDimensional//multi-level inheritance
    {
        private double baselen, height;
        public Parallelogram(double baselen, double height)
        {
            this.baselen = baselen;
            this.height = height;
        }
        public override double Area()
        {
            return baselen * height;
        }
        public override double Perimeter()
        {
            return 2 * (baselen + height);
        }

        public override void whoami()
        {
            Console.WriteLine("I am a Parallelogram of base " + Convert.ToString(baselen) + " and height " + Convert.ToString(height) + ". I am a 2D shape");
        }
    }
    public class Trapezium : TwoDimensional//multi-level inheritance
    {
        private double side1, side2, height, side3, side4;
        public Trapezium(double side1, double side2, double height, double side3, double side4)
        {
            this.side1 = side1;
            this.side2 = side2;
            this.height = height;
            this.side3 = side3;
            this.side4 = side4;
        }
        public override double Area()
        {
            return (0.5) * height * (side1 + side2);
        }
        public override double Perimeter()
        {
            return side1 + side3 + side2 + side4;
        }

        public override void whoami()
        {
            Console.WriteLine("I am a Trapezium of sides " + Convert.ToString(side1) + ", " + Convert.ToString(side2) + ", " + Convert.ToString(side1) + ", " + Convert.ToString(side3) + ", and " + Convert.ToString(side3) + " and height " + Convert.ToString(height) + ". I am a 2D shape");
        }
    }
}
