package packone;

/**
 * Created by swakkhar on 5/23/16.
 */
public class AccessObjectOne
{
    public String publicString = "public";
    private String privateString= "private";
    protected String protectedString= "protected";

    public void accessSelf()
    {
        System.out.println("The public String:"+ publicString);
        System.out.println("The private String:"+privateString);
        System.out.println("The protected String:"+protectedString);
    }

    public String getPrivateString()
    {
        return privateString;
    }

}
