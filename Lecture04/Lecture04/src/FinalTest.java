import javax.swing.plaf.synth.SynthTextAreaUI;

/**
 * Created by swakkhar on 6/1/16.
 */
public class FinalTest
{
    protected final int SIZE = 10;
    protected final int[] CLASS_ARRAY = new int [ SIZE ];
    protected final int NO_VALUE_YET;
    // blank final
    public void aMethod( int input, final float FIXED)
    {
        final int NEW_FEATURE = 123;
        final int ALSO_FIXED = input;
        CLASS_ARRAY[ 3 ] = input;
    }
    public FinalTest( int aValue )
    {
        NO_VALUE_YET = aValue;
    }
    public static void main( String args[] )
    {
        FinalTest test = new FinalTest( 5);
        test.aMethod( 13, 2.2f);
        System.out.println( test.NO_VALUE_YET);
        System.out.println(test.CLASS_ARRAY[3]);
    }
}


