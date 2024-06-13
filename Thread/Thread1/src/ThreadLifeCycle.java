import java.time.LocalTime;

public class ThreadLifeCycle
{
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try
            {
                System.out.println("1 Thread state: " + Thread.currentThread().getState()); // RUNNABLE/ RUNNABLE
                Thread.sleep(2000); // TIMED_WAITING
                System.out.println("2 Thread state: " + Thread.currentThread().getState()); // RUNNABLE/ RUNNABLE
                Thread.sleep(6000); // TIMED_WAITING
                System.out.println("3 Thread state: " + Thread.currentThread().getState()); // RUNNABLE/ RUNNABLE
                //Thread.currentThread().join();
                //Thread.currentThread().wait(1000);
                synchronized (ThreadLifeCycle.class) {
                    System.out.println("3 inside synchronized");
                    ThreadLifeCycle.class.wait(1000); // TIMED_WAITING
                }
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        });
        //////
        System.out.println("4 Thread state: " + thread.getState()); // NEW
        thread.start();
        System.out.println("5 Thread state: " + thread.getState()); // RUNNABLE
        try
        {
            Long ts = System.currentTimeMillis();
            System.out.println("ts "+ts);
            System.out.println(LocalTime.now());
            Thread.sleep(5000); // Main thread sleeps to allow demo thread to enter TIMED_WAITING
            System.out.println("6 Thread state: " + thread.getState()); // TIMED_WAITING
            thread.join(); // WAITING for thread to finish
            //thread.notify();
            System.out.println("7 Thread state: " + thread.getState()); // TERMINATED
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}