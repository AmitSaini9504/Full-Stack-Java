//create thread with extends thread class
public class ThreadClassExample extends Thread{

    public static void main(String[] args) {

        ThreadClassExample threadClassExample = new ThreadClassExample();
        threadClassExample.start();
        System.out.println("Inside main method");
    }

    @Override
    public void run() {
        System.out.println("Inside run");
    }
}
