package Questions;
//Hollow Rhombus Pattern
import java.util.*;
public class Question12 {
      public static void main(String[] args) {
		// TODO Auto-generated method stub
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
        	if(i==1||i==n||j==1||j==n)
        	{
        		System.out.print("*");
        	}
        	else
        	{
        		System.out.print(" ");
        	}}
        	System.out.println(" ");
        
       }
	}
}
