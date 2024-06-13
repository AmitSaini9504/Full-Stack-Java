
// thread class
// Runnable interface

class FirstThread extends Thread {

    @Override
    public void run()
    {
        System.out.println("inside run method with extends");
    }
}

public class FirstProgram implements Runnable
{

    public static void main(String[] args) throws InterruptedException {

        // First way
        FirstThread firstThread = new FirstThread();
        //firstThread.run(); // calling only run method
        firstThread.start(); // starting thread life cycle // memory, reference
        //Second Way
        FirstProgram firstProgram = new FirstProgram();
        //firstProgram.run(); // calling only run method
        Thread thread = new Thread(firstProgram);
        thread.start();
        Thread thread1 = new Thread();
        thread1.start();
    }

    @Override
    public void run() {

        System.out.println("inside run method with implements");
    }
}
