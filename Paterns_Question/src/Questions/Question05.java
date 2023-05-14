package Questions;
//Hollow Rectangle Pattern
import java.util.*;
public class Question05 {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the total Number of rows");
	   int totRows=sc.nextInt();
	   System.out.println("Enter the total Number of Columns");
	   int totCols=sc.nextInt();
	   for(int i=1;i<=totRows;i++)
	   {
		   for(int j=1;j<=totCols;j++)
		   {
			   if(i==1||i==totRows||j==1||j==totCols)
			   {
				   System.out.print("*"+" ");
			   }
			   else
			   {
				   System.out.print(" "+" ");
			   }
		   }
		   System.out.println(" ");
	   }
    }

}
