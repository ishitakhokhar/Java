//Define class for Complex number with real and imaginary as data members. 
//Create its contructor, overload the constructors. Also define addition method to add two complex objects.
import java.util.Scanner;
class Complex
{
	double real,img;
	double total_real,total_img;
	Complex()
	{

	}
	Complex(double r,double i)
	{
       real=r;
       img=i;
	}
	void Add(Complex c1,Complex c2)
	{
       total_real=c1.real+c2.real;
       total_img=c1.img+c2.img;
       System.out.println("total="+total_real+"+"+total_img+"i");
	}

}
class ComplexAdd
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter real number r1:");
		double r1=sc.nextDouble();
		System.out.println("Enter imaginary number I1:");
		double i1=sc.nextDouble();
		System.out.println("Enter real number r2:");
		double r2=sc.nextDouble();
		System.out.println("Enter imaginary number I2:");
		double i2=sc.nextDouble();
		Complex c1=new Complex(r1,i1);
		Complex c2=new Complex(r1,i2);
		Complex c3=new Complex();
		c3.Add(c1,c2);
    }
}