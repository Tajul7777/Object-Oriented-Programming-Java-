import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by swakkhar on 7/25/16.
 */
public class PrimeChecker implements Runnable {

    PrimeCounter pc;
    public PrimeChecker(PrimeCounter pc) {
        this.pc = pc;
    }
    public void run()
    {
        int i=0;
        int limit=10;
        while(i<limit)
        {
            i=pc.getAndIncrement();
            System.out.print(Thread.currentThread()+ " Checking: "+i);
            if(PrimeCounter.isPrime(i))
                System.out.println("-> prime");
            else System.out.println("-> not prime");
        }
    }
    public static void main(String ... args)
    {
        PrimeCounter pC = new PrimeCounter(2);
        PrimeChecker p1 = new PrimeChecker(pC);
        PrimeChecker p2 = new PrimeChecker(pC);

        ExecutorService myExecutor = Executors.newCachedThreadPool();
        myExecutor.execute(p1);
        myExecutor.execute(p2);
        myExecutor.shutdown();
    }
}
