/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int a=sc.nextInt();
		System.out.print("Enter number 2: ");
		int b=sc.nextInt();
		System.out.print("Enter number 3: ");
		int c=sc.nextInt();
		
		if ((a>b)&&(b>c)){
		    System.out.print("Decreasing Order");
		    
		}
		else if ((c>b)&&(b>a)){
		    System.out.print("Increasing Order");
		}
		
		else{
		    System.out.print("Neither Increasing nor Decreasing Order");
		}
	}
}
