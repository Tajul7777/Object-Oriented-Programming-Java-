import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LazyRunnable implements Runnable {
    int waitInMills;
    String threadName;
    public LazyRunnable(int waitInMills, String threadName) {
        this.waitInMills = waitInMills;
        this.threadName = threadName;
    }
    public void run()
    {
        try {
            System.out.println(threadName + " going to sleep for "
                    +waitInMills + " ms");
            Thread.sleep(waitInMills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadName + " done sleeping");
    }

    public static void main(String ... args)
    {
        Random myRnd = new Random();
        LazyRunnable t1=new LazyRunnable(myRnd.nextInt(5000),"Thread 1");
        LazyRunnable t2=new LazyRunnable(myRnd.nextInt(5000),"Thread 2");
        LazyRunnable t3=new LazyRunnable(myRnd.nextInt(5000),"Thread 3");

        ExecutorService myExecutor = Executors.newCachedThreadPool();
        myExecutor.execute(t1);
        myExecutor.execute(t2);
        myExecutor.execute(t3);

        myExecutor.shutdown();

        System.out.println("End of Main method!");

    }
}
