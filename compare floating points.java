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
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating point number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second floating point number: ");
        double num2 = sc.nextDouble();
        num1=Math.round(num1*1000);
        num1=num1/1000;
        num2=Math.round(num2*1000);
        num2=num2/1000;
        if (num1 == num2) 
        {
            System.out.println("The numbers are equal");
        } 
        else 
        {
            System.out.println("The numbers are not equal");
        }
	}
}
