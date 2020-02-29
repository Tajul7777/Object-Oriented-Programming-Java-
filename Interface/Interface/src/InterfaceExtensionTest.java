/**
 * Created by swakkhar on 6/16/16.
 */
interface BasicDoor{
    void open();
    void close();
}
interface LockableDoor extends BasicDoor{
    void lock();
    void unlock();
}

class CarDoor implements LockableDoor{
    boolean isLocked=false;
    public void open(){
        if(!isLocked)
            System.out.println("Door Opened!");
    }
    public void close(){
        System.out.println("Door Closed!");
    }
    public void lock(){isLocked=true;}
    public void unlock(){isLocked=false;}
}
public class InterfaceExtensionTest {
    public static void main(String []args) {
        BasicDoor b;
        LockableDoor l;
        CarDoor c= new CarDoor();
        b=c;
        b.close();
        // cant do this - b.lock();
        l=c;
        l.lock();
    }
}



