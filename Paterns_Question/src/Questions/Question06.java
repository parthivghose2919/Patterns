package Questions;

import java.util.*;
//Inverted And Rotated Half Rotated Pyramid
public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		   System.out.println("Enter the Number of rows  for which stars will be made");
		   int n=sc.nextInt();
		   for(int i=1;i<=n;i++)
		   {
			   for(int j=1;j<=n-i;j++)
			   {
				   System.out.print(" ");
			   }
			   for(int k=1;k<=i;k++)
			   {
				   System.out.print("*");
			   }
			   System.out.println(" ");
		   }
	}

}
