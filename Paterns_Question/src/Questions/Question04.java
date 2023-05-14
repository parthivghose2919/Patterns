package Questions;

import java.util.Scanner;

//Letters Half Pyramid
public class Question04 {
public static void main(String[]args)
{
	  Scanner sc=new Scanner(System.in);	
	   System.out.println("Enter the Number of rows  for which stars will be made");
	   int n=sc.nextInt();
	   char ch='A';
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print(ch+" ");
			   ch++;
		   }
		   System.out.println(" ");
	   }
}
}
