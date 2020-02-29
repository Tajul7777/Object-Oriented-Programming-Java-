import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by swakkhar on 7/23/16.
 */
public class ChildRunnable implements Runnable {
    public void run()
    {
        System.out.println("Hello Runnable!");
    }
    public static void main(String ... args)
    {
        ChildRunnable c= new ChildRunnable();
        Thread t = new Thread(c);
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        System.out.println("Main goes to sleep");
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main wakes up");
        System.out.println(t.getState());

    }
}

