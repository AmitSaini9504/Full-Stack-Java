
public class OuterClass
{
    class InnerClass
    {
        void show()
        {
            System.out.println("Hello, this is Inner Class");
        }
    }

    void show()
    {
        System.out.println("Hello, this is Outer Class.");
    }
    public static void main(String ar[])
    {
        OuterClass oc = new OuterClass();
        oc.show();
        OuterClass.InnerClass nc = new OuterClass().new InnerClass();
        nc.show();
        System.out.println("Hello, this is main method.");
    }
}

