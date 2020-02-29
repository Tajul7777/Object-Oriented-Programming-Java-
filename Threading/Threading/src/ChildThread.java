/**
 * Created by swakkhar on 7/21/16.
 */
public class ChildThread extends Thread{
    public void run()
    {
        System.out.println("Hello thread!");
    }
    public static void main(String ... args) {
        Thread t = new ChildThread();
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

