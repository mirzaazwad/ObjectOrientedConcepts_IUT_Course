using System;
public class Complex
{
    private double real;
    private double imaginary;
    public Complex(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(string real, string imaginary)
    {
        this.real =Convert.ToDouble( real);
        this.imaginary = Convert.ToDouble(imaginary);
    }

    public Complex()
    {

    }

    public static Complex operator +(Complex a, Complex b)
    {
        return new Complex(a.real + b.real, a.imaginary + b.imaginary);
    }

    public static Complex operator -(Complex a, Complex b)
    {
        return new Complex(a.real - b.real, a.imaginary - b.imaginary);
    }

    public static Complex operator *(Complex a, Complex b)
    {
        return new Complex(a.real * b.real - a.imaginary * b.imaginary, a.real * b.imaginary + a.imaginary * b.real);
    }

    public static Complex operator /(Complex a, Complex b)
    {
        return new Complex((a.real * b.real + a.imaginary * b.imaginary)/(b.real*b.real+b.imaginary*b.imaginary), ((-1)*a.real * b.imaginary + a.imaginary * b.real) / (b.real * b.real + b.imaginary * b.imaginary));
    }

    public string Conjugate(Complex a)
    {
        if (a.imaginary < 0)
        {
            return Convert.ToString(a.real) + "+" + Convert.ToString(a.imaginary*(-1))+"i";
        }
        else if(a.imaginary==0)
        {
            return Convert.ToString(a.real);
        }
        else
        {
            return Convert.ToString(a.real) + "-" + Convert.ToString(a.imaginary)+"i";
        }
    }

    public double argument(Complex a)
    {
        return Math.Atan(Convert.ToDouble(a.imaginary) / Convert.ToDouble(a.real));
    }

    public double Real
    {
        get { return real; }
        set { real = value; }
    }

    public double Imaginary
    {
        get { return imaginary; }
        set { imaginary = value; }
    }

    public string output()
    {
        
        if (this.imaginary < 0)
        {
            return Convert.ToString(this.real)  + Convert.ToString(this.imaginary)+"i";
        }
        else if (this.imaginary == 0)
        {
            return Convert.ToString(this.real);
        }
        else
        {
            return Convert.ToString(this.real) + "+" + Convert.ToString(this.imaginary)+"i";
        }
    }
}

class Program
{
    static void Main(string[] args)
    {
    //trying out complex class practically with operator overloading
        Complex num = new Complex(3, 4);
        Complex num2 = new Complex(5, 6);

        Console.WriteLine((num - num2).output());
        Console.WriteLine((num + num2).output());
        Console.WriteLine((num * num2).output());
        Console.WriteLine((num / num2).output());

    }
}
