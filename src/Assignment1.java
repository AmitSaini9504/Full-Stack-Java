//wap to create multiple object of a class

public class Assignment1 {
    int x;
    int y ;

    void object()
    {
        //System.out.println(x);

    }

    public static void main(String[] args) {
        Assignment1 obj1 = new Assignment1();
        obj1.object();
        obj1.y = 5;

        System.out.println(obj1.x);
        System.out.println(obj1.y);



    }
}

