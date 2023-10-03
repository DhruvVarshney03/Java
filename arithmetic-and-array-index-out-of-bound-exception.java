/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int a =5,b=0;
		int[] arr={1,2,3};
		
		try 
		{
		    int d=arr[3];
		    System.out.println("Value of arr[3]: "+ d);
		    int c=a/b;
		    System.out.println("Result: "+c);

		} catch(ArrayIndexOutOfBoundsException e){
		    System.out.println("Array Index Out Of Bounds Exception occured");
		    
		} catch(ArithmeticException e) {
		    System.out.println("Arithmetic Exception occured");
		    
		} finally{
		    System.out.println("Finally block executed");
		}
	}
}
