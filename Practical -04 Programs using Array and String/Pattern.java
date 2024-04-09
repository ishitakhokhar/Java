/*Write an interactive program to print a string entered in a pyramid form. For instance, the
string "stream" has to be displayed as follows:*/
import java.util.Scanner;
class Pattern
{
	public static void main(String[] args)
	 {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.nextLine();
		int len=s.length();
		int i,j,k;
		for (i=0;i<len;i++)
		 {
			for (k=0;k<len-i-1;k++) 
			{
				System.out.print(" ");
			}
			for (j=0;j<=i;j++) 
			{
				System.out.print(s.charAt(j)+" ");
			}
			System.out.println("");
		}
	}
}