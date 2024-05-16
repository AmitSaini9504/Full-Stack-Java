public class class1 extends Thread{

    public void run()
    {
        System.out.println("Task One running");
    }
}

class class2 extends Thread
{
    public void run()
    {
        System.out.println("Task Two");
    }
}

class class3
{
    public static void main(String[] args) {

        Simple1 t1 = new Simple1();
        Simple2 t2 = new Simple2();

        t1.start();
        t2.start();

    }
}
