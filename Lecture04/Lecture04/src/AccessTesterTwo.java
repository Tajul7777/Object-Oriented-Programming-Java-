import packone.AccessObjectOne;

/**
 * Created by swakkhar on 5/23/16.
 */
public class AccessTesterTwo {
    public static void main(String args[])
    {
        AccessObjectOne accObj2=new AccessObjectOne();
        // access public field
        System.out.println("Can access the public field:"+accObj2.publicString);
        System.out.println("Can access the public method:"+accObj2.getPrivateString());

        // now it can not access protected members
        // System.out.println("Can't access the protected filed:"+accObj2.protectedString);

    }
}

