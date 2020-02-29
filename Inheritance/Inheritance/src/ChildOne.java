/**
 * Created by swakkhar on 5/23/16.
 */
public class ChildOne extends ParentOne {

    private int diff;
    public int getDiff()
    {
        // can not do the following
        //diff= Math.abs(parentPublic-parentPrivate);

        // can not do the following
        //diff=Math.abs(getLess());

        // following is ok
        diff=Math.abs(parentPublic-getParentPrivate());
        return diff;

    }
}

