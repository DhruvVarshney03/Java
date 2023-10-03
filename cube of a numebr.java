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
		System.out.print("Enter no. of terms: ");
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++){
		    double cube=Math.pow(i,3);
		    System.out.println("Number is: "+i+" and the cube is: "+cube);
		}
	}
}
