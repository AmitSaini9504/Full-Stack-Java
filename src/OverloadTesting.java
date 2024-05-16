
public class OverloadTesting
{
    void hello()
    {
        System.out.println("Hello");
    }

    void hello(String name)
    {
        System.out.println("Hello " +name);
    }

    void hello(int rollno)
    {
        System.out.println("Hello " +rollno);
    }

    void hello(String name, int rollno)
    {
        System.out.println("Hello " +name+ " ("+rollno+")");
    }

    void hello(int rollno, String name)
    {
        System.out.println("Hello " +rollno+ " ("+name+")");
    }

    void hello(int rollno, String name, char sec)
    {
        System.out.println("Hello " +rollno+ " ("+name+") of " +sec);
    }

    public static void main(String ar[])
    {
        OverloadTesting  ov=new OverloadTesting();
        ov.hello();
        ov.hello("Shrawan");
        ov.hello(10);
        ov.hello("Shubham", 11);
        ov.hello(12, "Amit");
        ov.hello(5, "Maanav", 'A');
    }

}
