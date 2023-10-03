/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
// Class contains two methods to Find largest of Two Numbers

import java.util.Scanner;
class LargestofTwo {

	int x, y, largest;
	
	public void LargestofTwo() 
	{
		if(x == y) 
	    {
			System.out.println("\n Both are Equal");     
	    }
		else
		{
			largest = (x > y)? x: y;
			System.out.println("\n The Largest Number = " + largest);   
		}
	}
	
	public int LargestofTwoNumber(int x, int y) {
		largest = (x > y)? x: y;
		return largest;	
	}
}
public class Main
{


	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number1, number2, largest;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		number1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		number2 = sc.nextInt();	
		
		LargestofTwo ln = new LargestofTwo();
		ln.x = number1;
		ln.y = number2;
		ln.LargestofTwo(); // Calling First Method
		
		largest = ln.LargestofTwoNumber(number1, number2); 
		
	}	
}
	

