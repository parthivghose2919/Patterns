package Questions;
//Half Pyramid Triangle
import java.util.*;
public class Question03 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);	
	   System.out.println("Enter the Number of rows  for which stars will be made");
	   int n=sc.nextInt();
	   for (int i=1;i<=n;i++) {
		   for(int j=1;j<=i;j++)
		   {
			System.out.print(j+" ");  
		   }
		   System.out.println(" "); 
	   }
	}
}
