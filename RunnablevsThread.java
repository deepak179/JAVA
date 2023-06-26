import java.lang.Thread;

// class A implements Runnable
// {
//     // As soon as the start() method is called by thread, 
//     // the run() method will execute
//     public void run()       
//     {
//         for (int i = 0; i < 100; i++)
//         {
//             System.out.println("Hi " + i);
//             try{
//                 Thread.sleep(10);
//             } catch (InterruptedException e) { e.printStackTrace(); }
//         }
//     }
// }

// class B implements Runnable
// {
//     public void run()
//     {
//         for (int i = 0; i < 100; i++)
//         {
//             System.out.println("Hello " + i);
//             try{
//                 Thread.sleep(10);
//             } catch (InterruptedException e) { e.printStackTrace(); }
//         }
//     }
// }

public class RunnablevsThread {
    public static void main(String[] args) {
        // Runnable obj1 = new Runnable(){                // Anonymous Class
        //     public void run()
        //     {
        //         for (int i = 1; i <= 5; i++)
        //         {
        //             System.out.println("Hello " + i);
        //             try{
        //                 Thread.sleep(10);
        //             } catch (InterruptedException e) { e.printStackTrace(); }
        //         }
        //     }
        // };        
        // Runnable obj2 = new Runnable(){
        //     public void run()
        //     {
        //         for (int i = 1; i <= 5; i++)
        //         {
        //             System.out.println("Hello " + i);
        //             try{
        //                 Thread.sleep(10);
        //             } catch (InterruptedException e) { e.printStackTrace(); }
        //         }
        //     }
        // };    
        
        Runnable obj1 = () ->            // Using LAmbda Expression for functional interface Runnable
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Hi " + i);
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        };
        Runnable obj2 = () ->          
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("Hello " + i);
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

