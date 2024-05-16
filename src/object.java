public class object {
    int quantity = 10;
    String name = "Amit Saini";

    void calculate()
    {
        System.out.println(quantity);

    }

    public static void main(String[] args) {
        object a1 = new object();
        a1.calculate();
        a1.quantity = 10;
        System.out.println(a1.quantity);
        System.out.println(a1.name);
    }
}
