class A extends Thread
{
    public void run()
    {
        for (int i=1; i<=5; i++)
        {
            System.out.println("\tFrom ThreadA: i="+i);

        }
        System.out.println("Exit from A");
    }
}
class B extends Thread{
    public void run()
    {
        for (int j=1; j<=5; j++)
        {
            System.out.println("\tFrom ThreadB: J="+j);

        }
        System.out.println("Exit from B");
    }
}
class C extends Thread{
    public void run()
    {
        for (int k=1; k<=5; k++)
        {
            System.out.println("\tFrom ThreadC: k="+k);

        }
        System.out.println("Exit from C");
    }
}

class Threadtest
{
    public static void main (String args[]){
    A a = new A();
    B b = new B();
    C c =new C();
    
    a.start();
    b.start();
    c.start();
    }
    
}

