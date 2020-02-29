import java.util.logging.Logger;

/**
 * Created by swakkhar on 6/19/16.
 */
public class NestedTryCatch {
    public static void main( String args[] ) {
        int students[] = new int[5];
        try {
            System.out.println( "Start Try" );
            try{
                System.out.println( "Start Change" );
                students[ 10 ] = 1;
                System.out.println( "End Change" );
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println( "Change Catch: "
                        + e.getMessage());
            }
            System.out.println( "After change" );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println( "Main Catch: " + e.getMessage());
        }
        System.out.println( "After try " );
    }
}


