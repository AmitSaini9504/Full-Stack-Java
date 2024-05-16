//using the thread class
public class Thread3 {

    public static void main(String[] args) {
        Thread t  = new Thread("My First Thread");
        t.start();
        String str = t.getName();
        System.out.println(str);
    }
}
