/*Write an interactive program to print a diamond shape. For example, if user enters the
number 3, the diamond will be as follows:*/
import java.util.Scanner;
class Pattern2
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		int n=sc.nextInt();
		int i,j,k;
		for (i=0;i<n;i++) 
		{
			for (k=0;k<n-i-1;k++) 
			{
				System.out.print(" ");
			}
			for (j=0;j<=i;j++) 
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
		for (i=n-1;i>=1;i--) 
		{
			for (k=1;k<=n-i;k++) 
			{
				System.out.print(" ");
			}
			for (j=1;j<=i;j++) 
			{
				System.out.print("*"+" ");
			}
			System.out.println("");
		}
	}
}