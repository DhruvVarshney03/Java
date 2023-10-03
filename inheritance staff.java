/******************************************************************************

An education institution wishes to maintain a database of its employees. The database
is divided into a number of classes whose hierachical relationship is given in the figure.
The figure also shows the minimum info required for each class. Specify all the classes 
and define methods to create the database and retrieve individual info when required.

*******************************************************************************/
import java.util.Scanner;

class Staff
{
    int code;
    String name;
    Scanner sc=new Scanner(System.in);
    Scanner s= new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter Staff code: ");
        code=sc.nextInt();
        System.out.println("Enter the Staff name: ");
        name=s.nextLine();
    }
    void display()
    {
        System.out.println("The staff code is:"+ code);
        System.out.println("The staff name is:"+ name);
    }
}

class Teacher extends Staff
{
    String subject;
    String publication;
    Scanner sc = new Scanner(System.in);
    void getdata_SP()
    {
        System.out.println("Enter the subject name: ");
        subject=sc.nextLine();
        System.out.println("Enter the publication name: ");
        publication=sc.nextLine();
    }
    void display_SP()
    {
        System.out.println("The subject name is:"+ subject);
        System.out.println("The publication name is:"+ publication);
    }
}

class Officer extends Staff
{
    String grade;
    Scanner sc = new Scanner(System.in);
    void getdata_G()
    {
        System.out.println("Enter the grade of Officer: ");
        grade=sc.nextLine();
    }
    void display_G()
    {
        System.out.println("The grade of the officer:"+ grade);
    }
}

class Typist extends Staff
{
    int speed;
    Scanner sc = new Scanner(System.in);
    void getdata_S()
    {
        System.out.println("Enter the speed of the Typist: ");
        speed=sc.nextInt();
    }
    void display_S()
    {
        System.out.println("The speed of the Typist:"+ speed);
    }

    
}

class Regular extends Typist
{
    int salary;
    Scanner sc = new Scanner(System.in);
    void getdata_Rs()
    {
        System.out.println("Enter the salary amount for regular typist: ");
        salary=sc.nextInt();
    }
    void display_Rs()
    {
        System.out.println("The salary of a regularTypist:"+ salary);
    }
}

class Casual extends Typist
{
    int wages;
    Scanner sc = new Scanner(System.in);
    void getdata_C()
    {
        System.out.println("Enter the wage amount for Casual typist: ");
        wages=sc.nextInt();
    }
    void display_C()
    {
        System.out.println("The wage of a Casual Typist:"+ wages);
    }
    
}

public class Main
{
	public static void main(String[] args) 
	{
	    int a,b;
	    Staff s=new Staff();
	    s.getdata();
	    s.display();
	    try (Scanner sc = new Scanner(System.in))
	    {
	        System.out.println("Enter 1 for Teacher: ");
	        System.out.println("Enter 2 for Officer: ");
	        System.out.println("Enter 3 for Typist: ");
	        System.out.println("Enter your choice: ");
	        a=sc.nextInt();
	        if (a==1)
	        {
	            Teacher t= new Teacher();
	            t.getdata_SP();
	            t.display_SP();
	        }
	        else if (a==2)
	        {
	            Officer o= new Officer();
	            o.getdata_G();
	            o.display_G();
	        }
	        else if (a==3)
	        {
	            System.out.println("Enter 1 for Regular Typist: ");
	            System.out.println("Enter 2 for Casual Typist: ");
	            b=sc.nextInt();
	            if (b==1)
	            {
	                Regular r=new Regular();
	                r.getdata_Rs();
	                r.display_Rs();
	                
	            }
	            else if (b==2)
	            {
	                Casual c= new Casual();
	                c.getdata_C();
	                c.display_C();
	            }
	        }
	    }
	    
    
	
	}
}
