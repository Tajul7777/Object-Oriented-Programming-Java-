/**
 * Created by swakkhar on 7/26/16.
 */
public class ParallelChild extends Thread
{
    private int maxCount = 32;
    public ParallelChild( String name ) {
        super( name );
    }
    public ParallelChild( String name, int repetitions ) {
        super( name );
        maxCount = repetitions;
    }
    public ParallelChild( int repetitions ) {
        maxCount = repetitions;
    }
    public void run() {
        for ( int count = 0; count < maxCount; count++) {
            System.out.println( count + " From: " + getName() );
        }
    }
    public static void main( String[] args ) {
        ParallelChild first = new ParallelChild( 5 );
        ParallelChild second = new ParallelChild( 5 );
        first.start();
        second.start();
        System.out.println( "End" );
    }
}





