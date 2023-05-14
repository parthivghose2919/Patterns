package Questions;
import java.util.Scanner;
//Floyd's Triangle
public class Question08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);	
		   System.out.println("Enter the Number of rows  for which stars will be made");
		   int n=sc.nextInt();
		   int counter=1;
		 for(int i=1;i<=n;i++) 
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(counter+" ");
				 counter++;
			 }
			 
			System.out.println(" ");
			
	}
  }
}
