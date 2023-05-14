package Questions;
//Butterfly pattern
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);	
		   System.out.println("Enter the Number of rows  for which stars will be made");
		   int n=sc.nextInt();
		   for(int i=1;i<=n;i++) 
		   {
			   for(int j=1;j<=i;j++) 
			   {
				   System.out.print("*");
			   }
			   for(int j=1;j<=2*(n-i);j++)
			   {
				   System.out.print(" ");
			   }
			   for(int j=1;j<=i;j++) {
				   System.out.print("*");
			   }
			   System.out.println(" ");
		   }
		   for(int i=n;i>=1;i--) 
		   {
			   for(int j=1;j<=i;j++) 
			   {
				   System.out.print("*");
			   }
			   for(int j=1;j<=2*(n-i);j++)
			   {
				   System.out.print(" ");
			   }
			   for(int j=1;j<=i;j++) {
				   System.out.print("*");
			   }
			   System.out.println(" ");
		   }
	}

}
