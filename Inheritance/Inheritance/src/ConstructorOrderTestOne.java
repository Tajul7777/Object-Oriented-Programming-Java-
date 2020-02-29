/**
 * Created by swakkhar on 5/23/16.
 */

class ParentThree {
    public ParentThree() {
        System.out.println("\t In Parent");
    }
}
class ChildThree extends ParentThree {
    public ChildThree() {
        System.out.println( "\t In Child" );
    }
    public ChildThree(String notUsed ) {
        System.out.println( "\t In Child with argument" );
    }
}

public class ConstructorOrderTestOne {
    public static void main( String args[] ) {
        System.out.println( "Construct Parent" );
        ParentThree sleepy
                = new ParentThree();
        System.out.println( "Construct Child" );
        ChildThree care = new ChildThree();
        System.out.println( "Construct Second Child" );
        care = new ChildThree( "Try Me" );
    }
}













