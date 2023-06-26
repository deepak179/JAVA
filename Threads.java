class A extends Thread
{
    // As soon as the start() method is called by thread, 
    // the run() method will execute
    public void run()       
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Hi " + i);
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println("Hello " + i);
            try{
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace(); }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A thrd1 = new A();        // Thread is created
        B thrd2 = new B();

        // System.out.println(thrd1.getPriority());
        // thrd1.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(thrd1.getPriority());

        thrd1.start();
        try{
            Thread.sleep(5);
        } catch (InterruptedException e) { e.printStackTrace(); }
        thrd2.start();
    }
}
