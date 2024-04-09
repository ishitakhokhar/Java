//Write a program to find length of string and print second half of the string.
import java.util.Scanner;
class HalfString
{
	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter String:");
      String s=sc.next();
      int len=s.length();
      int a=len/2;
      int i;
      for (i=a;i<len;i++) 
      {
      	System.out.print(s.charAt(i));
      }
    }
}      