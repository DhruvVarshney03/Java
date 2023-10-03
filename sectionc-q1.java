interface shape{
     void get();
}

class cuboid implements shape{
    public void get()
    {
        System.out.println("Cuboid");
    }

}

class rectangle implements shape{
    public void get()
    {
        System.out.println("Rectangle");
    }
}

public class Main
{
    public static void main(String[] args) {
        rectangle r= new rectangle();
        r.get();
        cuboid c= new cuboid();
        c.get();
    }
}