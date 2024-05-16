public class Example2 {

    int a;
    int b;

    //constructor
    Example2(){

    }
    //passing argument
    Example2(int a, int b)
    {
        this.a = a;
        this.b = b;

    }
    int sum()
    {
        return (a+b);

    }
    int sub()
    {
        return (a-b);
    }

    int mult()
    {
        return (a*b);
    }

    public static void main(String[] args) {

        Example2 ex = new Example2(5,10);

        System.out.println(ex.sum());
        System.out.println(ex.sub());
        System.out.println(ex.mult());
    }
}
