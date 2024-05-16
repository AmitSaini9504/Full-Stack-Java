//Using the thread class : Thread runnable r string name
public class Thread4  implements Runnable{
    @Override
    public void run() {
        System.out.println("Now the thread is running ....");
    }

    public static void main(String[] args) {
        Runnable r1 = new Thread4();

        Thread th1 = new Thread(r1, "My new thread");

        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
}
