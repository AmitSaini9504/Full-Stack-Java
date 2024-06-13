//create thread with implement runnable interface

public class ImplementRunnableInterface implements Runnable
{

    @Override
    public void run() {

        System.out.println("Inside run...");
    }

    public static void main(String[] args) {

        ImplementRunnableInterface implementRunnableInterface = new ImplementRunnableInterface();

        Thread thread = new Thread(implementRunnableInterface);

        thread.start();
    }
}