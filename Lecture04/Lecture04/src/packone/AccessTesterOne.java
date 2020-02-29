package packone;

/**
 * Created by swakkhar on 5/23/16.
 */
public class AccessTesterOne {
    public static void main(String args[])
    {
        AccessObjectOne accObj=new AccessObjectOne();
        System.out.println("Can access the public field:"+accObj.publicString);
        System.out.println("Can access the public method:"+accObj.getPrivateString());
        accObj.accessSelf(); // another public method

        // cant access to private fields
        // System.out.println(accObj.privateInteger); // this is not valid

        // can access to protected fields
        System.out.println("Can access the protected field:"+accObj.protectedString);
    }
}
