package Questions;
//0-1 Triangle Pattern
import java.util.*;
public class Question09 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);	
	   System.out.println("Enter the Number of rows  for which stars will be made");
	   int n=sc.nextInt();
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   if((i+j)%2==0)
			   {
				   System.out.print("1"+" ");
			   }
			   else
			   {
				   System.out.print("0"+" ");
			   }
		   }
		   System.out.println(" ");
	   }
	}

}
