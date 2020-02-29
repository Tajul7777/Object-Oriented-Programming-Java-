/**
 * Created by swakkhar on 7/21/16.
 */
public class CurrentThreadTest {
    public static void main(String ... args)
    {
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("Main Method!");
        System.out.println(t);

        for(int i=0;i<5;i++)
        {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Print After Sleep:"+i);
        }
    }
}


