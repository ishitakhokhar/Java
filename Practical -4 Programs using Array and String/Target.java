import java.util.Scanner;
class Target
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int num[]=new int[n];
		System.out.println("Enter element in Ascending order");
		for (i=0;i<n;i++) 
		{
			num[i]=sc.nextInt();
		}
		System.out.println("Enter pivot index:");
		int pivot=sc.nextInt();
		System.out.println("Enter Target element");
		int target=sc.nextInt();

		int p=pivot;
		int j=0;
		int num1[]=new int[n];
		
		for (p=pivot;p<n;p++) 
		{
	
			num1[j]=num[p];
			j++;
		}
		for (p=0;p<pivot;p++) 
		{
			
			num1[j]=num[p];
			j++;
		}
		
		
	}
}