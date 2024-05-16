//Java Thread example by implemneting rinnable interface
public class Thread2  implements Runnable{

    @Override
    public void run() {

        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        Thread2 m1 = new Thread2();

        Thread t1 = new Thread(m1);
        t1.start();
    }
}
