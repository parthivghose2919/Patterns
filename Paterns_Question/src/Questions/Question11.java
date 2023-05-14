package Questions;
//Solid Rhombus Pattern
import java.util.*;
public class Question11 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Total Number of Rows");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=(n-i);j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
  }
}
