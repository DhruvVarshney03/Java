/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;



public class Main
{
	public static void main(String[] args) 
	{
	    int population;
        System.out.println("Enter the amount of Expected population for voting: ");
        Scanner p=new Scanner(System.in);
        population=p.nextInt();
	    int ctr=0;
	    
	    int a=0,b=0,c=0,d=0,e=0;
		int arr[]={a,b,c,d,e};
		int vote;
		System.out.println("Enter 1 for A ");
	    System.out.println("Enter 2 for B ");
	    System.out.println("Enter 3 for C ");
	    System.out.println("Enter 4 for D ");
	    System.out.println("Enter 5 for E ");
		Scanner sc=new Scanner(System.in);
		for (int i=0; i<population; i++)
		{

		    System.out.print("Enter vote: ");
            vote=sc.nextInt();
            
            switch(vote)
            {
                case 1:
                {
                    arr[0]++;
                    break;
                }
                case 2:
                {
                    arr[1]++;
                    break;
                }
                case 3:
                {
                    arr[2]++;
                    break;
                }
                case 4:
                {
                    arr[3]++;
                    break;
                }
                case 5:
                {
                    arr[4]++;
                    break;
                }
                default:
                {
                    ctr++;
                    break;
                }
            }
            
            
		    
		}
		for(int i=1;i<6;i++)
        {
            System.out.println("\tThe votes for "+i+" candidate is: "+arr[i-1]);
        }
    
        System.out.println("\nSpoiled Ballets are: "+ctr);
	}
}
