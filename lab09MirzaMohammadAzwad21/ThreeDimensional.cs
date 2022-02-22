using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace lab09MirzaMohammadAzwad21
{
    public abstract class ThreeDimensional : Properties//single-level inheritance
    {
        public abstract double Volume();
        public abstract double SurfaceArea();
        public abstract void whoami();
    }

    //Shapes are given below Sphere, Cone, Pyramid, Cuboid
    public class Sphere : ThreeDimensional//multi-level inheritance
    {
        private double radius;
        public Sphere(double radius)
        {
            this.radius = radius;
        }
        public double Radius
        {
            get { return radius; }
            set { radius = value; }
        }
        public override double Volume()
        {
            return (Math.PI * 4 * radius * radius * radius) / 3;
        }
        public override double SurfaceArea()
        {
            return 4 * Math.PI * radius * radius;
        }
        public override void whoami()
        {
            Console.WriteLine("I am a Sphere of radius " + Convert.ToString(radius) + ". I am a 3D shape");
        }
    }
    public class Cone : ThreeDimensional//multi-level inheritance
    {
        private double baseradius, height;
        public Cone(double baseradius, double height)
        {
            this.baseradius = baseradius;
            this.height = height;
        }
        public override double Volume()
        {
            return (Math.PI * baseradius * baseradius * height) / 3;
        }
        public override double SurfaceArea()
        {
            double lateral = Math.Sqrt(baseradius * baseradius + height * height);
            return Math.PI * baseradius * (baseradius + lateral);
        }

        public override void whoami()
        {
            Console.WriteLine("I am a cone with base radius " + Convert.ToString(baseradius) + " and height " + Convert.ToString(height) + ". I am a 3D shape");
        }

    }
    public class Cuboid : ThreeDimensional//multi-level inheritance
    {
        private double length, breadth, height;
        public Cuboid(double length, double breadth, double height)
        {
            this.breadth = breadth;
            this.length = length;
            this.height = height;
        }
        public override double Volume()
        {
            return length * breadth * height;
        }
        public override double SurfaceArea()
        {
            return 2 * ((length * breadth) + (length * height) + (height * breadth));
        }
        public override void whoami()
        {
            Console.WriteLine("I am a Cuboid of length " + Convert.ToString(length) + ", breadth " + Convert.ToString(breadth) + " and height " + Convert.ToString(height) + ". I am a 3D shape");
        }

    }
    public class Pyramid : ThreeDimensional//multi-level inheritance
    {
        private double basearea, height, triangularfaces;//triangular faces indicates the sum of area of the triangular faces of the pyramid
        public Pyramid(double basearea, double height, double triangularfaces)
        {
            this.basearea = basearea;
            this.height = height;
            this.triangularfaces = triangularfaces;
        }
        public override double Volume()
        {
            return (basearea * height) / 3;
        }
        public override double SurfaceArea()
        {
            return triangularfaces + basearea;
        }
        public override void whoami()
        {
            Console.WriteLine("I am a pyramid with base area " + Convert.ToString(basearea) + ", " + "sum of area of trangular faces " + Convert.ToString(triangularfaces) + " and height " + Convert.ToString(height) + ". I am a 3D shape");
        }
    }
}
