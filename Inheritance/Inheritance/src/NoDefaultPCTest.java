/**
 * Created by swakkhar on 6/3/16.
 */

class ParentFive {
    public ParentFive(String message ) {
        System.out.println( "In Parent" + message );
    }
}
class ChildFive extends ParentFive {

    /*public ChildFive()
    {
       // this constructor will generate a compile error
    }*/
    public ChildFive(String message ) {
        super( message );
// if occurs must be first
        System.out.println( "In Child" + message );
    }
}

public class NoDefaultPCTest {
}








