package packone.packtwo;

/**
 * Created by swakkhar on 5/23/16.
 */
public class AccessObjectTwo {
    private String myVarPrivate="packtwoprivate";
    public String myVarPublic="packtwopublic";
    protected String myVarProtected="packtwoprotected";

    public String getMyVarPrivate() {
        return myVarPrivate;
    }

    public void setMyVarPrivate(String myVarPrivate) {
        this.myVarPrivate = myVarPrivate;
    }

    public String getMyVarPublic() {
        return myVarPublic;
    }

    public void setMyVarPublic(String myVarPublic) {
        this.myVarPublic = myVarPublic;
    }

    public String getMyVarProtected() {
        return myVarProtected;
    }

    public void setMyVarProtected(String myVarProtected) {
        this.myVarProtected = myVarProtected;
    }
}
