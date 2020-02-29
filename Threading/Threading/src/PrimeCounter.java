import java.util.Random;

/**
 * Created by swakkhar on 7/25/16.
 */

public class PrimeCounter {
    int count;
    Random rnd=new Random();
    public PrimeCounter(int count) {
        this.count = count;
    }
    public int getAndIncrement()
    {
        int temp = count;
        try {
            Thread.sleep(rnd.nextInt(500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count = temp + 1;
        return temp;
    }
    public static boolean isPrime(int num)
    {
        for(int i=2;i<=Math.sqrt(num);i++)
            if(num%i==0) return false;
        return true;
    }
}
