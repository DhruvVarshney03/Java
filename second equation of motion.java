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
	    Scanner x = new Scanner(System.in); 
	    System.out.print("Enter number of time intervals:");
        int n =x.nextInt();
    	for (int i=1;i<=n;i++)	
		{
    		System.out.print("Enter time interval:");
    		int t =x.nextInt();
    		System.out.print("Enter intial velocity:");
    		int u =x.nextInt();
    		System.out.print("Enter acceleration:");
    		int a =x.nextInt();
    		int s =(u*t)+(a*t*t)/2;
    		
    		System.out.println("The distance travelled: "+s);
    		
    		
    	
		}
		
		
		
		
	}
}
