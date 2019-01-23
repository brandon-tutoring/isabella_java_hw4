package isabella_java_hw4;

import java.util.Scanner;


public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    {
		        Scanner sc = new Scanner(System.in);
		        //Taking noOfRows value from the user
		        System.out.println("Enter the height of your pyramid");
		        int noOfRows = sc.nextInt();
		        //Initializing rowCount with 1
		        int rowCount = 1;ß
		        //Implementing the logic
		        for (int i = noOfRows; i > 0; i--)
		        {
		            //Printing i spaces at the beginning of each row
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(" ");
		            }
		            //Printing 'rowCount' value 'rowCount' times at the end of each row
		            for (int j = 1; j <= rowCount; j++)
		            {
		                System.out.print(rowCount+" ");
		            }
		            System.out.println();
		            //Incrementing the rowCount
		            rowCount++;
		        }
		    }
		}
	}

