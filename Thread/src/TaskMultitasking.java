public class TaskMultitasking extends Thread {

    public void run()
    {
        System.out.println("Task One");
    }

    public static void main(String[] args) {
        TaskMultitasking t1 = new TaskMultitasking();
        TaskMultitasking t2 = new TaskMultitasking();
        TaskMultitasking t3 = new TaskMultitasking();

        t1.start();
        t2.start();
        t3.start();
    }
}
