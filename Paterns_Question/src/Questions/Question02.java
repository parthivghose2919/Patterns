package Questions;
//Basic Star Pattern Part2
import java.util.*;
public class Question02 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);	
		   System.out.println("Enter the Number of rows  for which stars will be made");
		   int n=sc.nextInt();
		 for (int i=1;i<=5;i++) {
			   for(int j=1;j<=n-i+1;j++)
			   {
				System.out.print("*");  
			   }
			   System.out.println(" "); 
		   }
	}
}
