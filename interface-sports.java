/******************************************************************************
Interface-Sports

*******************************************************************************/
import java.util.Scanner;

class student
{
    int rollno;
    Scanner sc=new Scanner(System.in);
    void get_rollno()
    {
        System.out.print("Enter rollno. : ");
        rollno= sc.nextInt();
    }
    void put_rollno()
    {
        System.out.println("The roll no. is "+ rollno);   
    }
}

class Test extends student
{
    int m1,m2;
    Scanner sc=new Scanner(System.in);
    void get_marks()
    {
        System.out.print("Enter marks of subject 1: ");
        m1= sc.nextInt();
        System.out.print("Enter marks of subject 2: ");
        m2= sc.nextInt();
    }   
    void put_marks()
    {
        System.out.println("Marks of subject 1: "+m1);
        System.out.println("Marks of subject 2: "+m2);
    }
        
}

interface sports
{
    int sportwt=85;
    void put_weight();
}

class Result  extends Test implements sports
{
    int total;
    
    void display()
    {
        total=m1+m2+sportwt;
        System.out.println(m1);
        System.out.println(m2);
        System.out.println("Total:"+ total);
    }
    public void put_weight()
    {
       System.out.println("Sports Weight: "+ sportwt);
    }   

}
    



public class Main
{
	public static void main(String[] args) {
	    student s=new student();
	    s.get_rollno();
		s.put_rollno();
		Test t=new Test();
		
		t.get_marks();
	    t.put_marks();
	    Result r=new Result();
		r.put_weight();
		r.display();
		
	}
}
