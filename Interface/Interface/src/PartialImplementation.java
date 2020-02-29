/**
 * Created by swakkhar on 6/16/16.
 */
interface Door
{
    void open();
    void close();
    void lock();
}
abstract class LocklessDoor implements Door{
    public void open() {
        System.out.println("Door Opens!");
    }
    public void close() {
        System.out.println("Door Closes!");
    }
}

class FullyImplementedDoor extends LocklessDoor{
    public void lock() {
        System.out.println("Door Locks!");
    }
}
public class PartialImplementation {
    public static void main(String [] args) {
        Door dr;
        LocklessDoor lr;
        FullyImplementedDoor fl=
                new FullyImplementedDoor();
        dr=fl;
        dr.lock();
        lr=fl;
        lr.lock();
    }
}





