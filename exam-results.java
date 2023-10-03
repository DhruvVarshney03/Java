/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] marks = new int[10][3];
        int[] totalMarks = new int[10];
        int[] maxMarks = new int[5];
        int[] maxRollNo = new int[5];
        int maxTotalMarks = 0;
        int maxTotalRollNo = 0;
      
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the roll no of student " + (i+1) + ": ");
            int rollNo = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter the marks of subject " + (j+1) + " for student " + rollNo + ": ");
                marks[i][j] = sc.nextInt();
                sum += marks[i][j];
                
                
                if (marks[i][j] > maxMarks[j]) {
                    maxMarks[j] = marks[i][j];
                    maxRollNo[j] = rollNo;
                }
            }
            totalMarks[i] = sum;
            
            
            if (sum > maxTotalMarks) {
                maxTotalMarks = sum;
                maxTotalRollNo = rollNo;
            }
        }
        
       
        System.out.println("\nTotal marks obtained by each student:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Roll no: " + (i+1) + ", Total marks: " + totalMarks[i]);
        }
        
        
        System.out.println("\nHighest marks obtained in each subject:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Subject " + (i+1) + ": " + maxMarks[i] + " by Roll no " + maxRollNo[i]);
        }
        
        
        System.out.println("\nStudent who obtained the highest total marks:");
        System.out.println("Roll no: " + maxTotalRollNo + ", Total marks: " + maxTotalMarks);
    }
}



