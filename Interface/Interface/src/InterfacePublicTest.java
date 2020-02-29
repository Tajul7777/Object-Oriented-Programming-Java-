/**
 * Created by swakkhar on 6/16/16.
 */
interface InterfaceOne {
    void myMethod();
    // protected wrongOne(); can not do this
}

class ImplementerOne implements InterfaceOne{
    /*void myMethod(){
     error - must be declared public
    }*/
    public void myMethod() {
        // now ok
    }
}

public class InterfacePublicTest {
}



