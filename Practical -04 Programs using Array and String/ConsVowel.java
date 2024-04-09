/*Write a program to accept a line and check how many consonants and vowels are there in
line.*/
import java.util.Scanner;
class ConsVowel
{
	public static void main(String[] args)
	 {
	 	Scanner sc=new Scanner(System.in);
	 	System.out.println("Enter string");
	 	String s=sc.nextLine();
	 	int length=s.length();
	 	int vowels=0,consonants=0,i;
	 	for (i=0;i<length;i++) 
	 	{
	 		char c=s.charAt(i);
	 		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
	 		{
	 			vowels++;
	 		}
	 		else
	 		{
	 			consonants++;
	 		}
	 	}
	 	System.out.println("voels="+vowels);
	 	System.out.println("consonants="+consonants);
	 }
}