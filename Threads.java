class A extends Thread
{
    // As soon as the start() method is called by thread, 
    // the run() method will execute
    public void run()       
    {
        for (int i = 0; i < 100; i++)
            System.out.println("Hi " + i);
    }
}

class B extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; i++)
            System.out.println("Hello " + i);
    }
}

public class Threads {
    public static void main(String[] args) {
        A thrd1 = new A();        // Thread is created
        B thrd2 = new B();

        thrd1.start();
        thrd2.start();
    }
}
