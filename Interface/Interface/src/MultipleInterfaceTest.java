/**
 * Created by swakkhar on 6/16/16.
 */
interface BaseDoor{
    void open();
    void close();
}
interface LockableBaseDoor extends BaseDoor{
    void lock();
    void unlock();
}
interface Alarm{
    void turnAlarmOn();
    void turnAlarmOff();
}

class SafeDoor implements LockableBaseDoor,Alarm{
    boolean isLocked=false;
    boolean isAlarmOn=false;
    public void open(){
        if(!isLocked)
            System.out.println("Door Opened!");
    }
    public void close(){
        System.out.println("Door Closed!");
    }
    public void lock(){
        isLocked=true;
    }
    public void unlock(){
        isLocked=false;
    }
    public void turnAlarmOn(){
        isAlarmOn = true;
    }
    public void turnAlarmOff(){
        isAlarmOn = false;
    }
}

public class MultipleInterfaceTest {
    public static void main(String []args) {
        BaseDoor b;
        LockableBaseDoor l;
        Alarm a;
        SafeDoor s= new SafeDoor();
        b=s;
        b.close();
        // cant do this - b.lock();
        l=s;
        l.lock();
        // cant do this l.turnAlarmOn();
        a=s;
        a.turnAlarmOn();
    }
}
