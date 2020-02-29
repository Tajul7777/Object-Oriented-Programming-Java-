/**
 * Created by swakkhar on 5/23/16.
 */

class ParentFour {
    public ParentFour( ) {
        System.out.println( "In ParentFour, No Argument" );
    }
    public ParentFour(String message ) {
        System.out.println( "In Parent" + message );
    }
}
class ChildFour extends ParentFour {
    public ChildFour(String message, int value ) {
        this( message );
        // if occurs must be first
        System.out.println( "In Child" );
    }
    public ChildFour(String message ) {
        super( message );
// if occurs must be first
        System.out.println( "In Child" + message );
    }
}
public class ConstructorOrderTestTwo {
    public static void main( String args[] ) {
        System.out.println("Construct Child");
        ChildFour care = new ChildFour( ">Start from Child<", 5 );
    }
}





