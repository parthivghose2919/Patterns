package Questions;
//Pallindromic Patterns With Numbers
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the Number of Rows");
		  int n=sc.nextInt();
		  for(int i=1;i<=n;i++)
		  {   //Spaces
			  for(int j=1;j<=(n-i);j++)
			  {
				  System.out.print(" ");
			  }
			  //Desc
			  for(int j=i;j>=1;j--)
			  {
				  System.out.print(j);
			  }
			  //Asce
			  for(int j=2;j<=i;j++)
			  {
				  System.out.print(j);
			  }
			  System.out.println(" ");
	     }
	}
}
