public class WaitingTask extends implements Runnable {

    private static final Object lock = new Object();
    @Override
    public void run() {

        synchronized (lock)
        {
            try
            {
                System.out.println(Thread.currentThread().getName() + "is going to wait...");
                lock.wait();

                System.out.println(Thread.currentThread().getName() + "is resumed");
            }
            catch ()
            {

            }
        }
    }
}
