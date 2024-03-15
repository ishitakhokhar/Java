//WAP that counts the number of objects created using static.
import java.util.Scanner;
class object
{
    static int count=0;
    object()
    {
    	count++;
    }
}
class NumofObj
{
	public static void main(String[] args)
    {
		object o1=new object();
		object o2=new object();
		object o3=new object();
		object o4=new object();
		System.out.println("Number of object="+o1.count);
	}
}