/**
 * Created by swakkhar on 5/23/16.
 */
public class ParentOne {
    private int parentPrivate=12;
    public int parentPublic=10;

    public int getProduct()
    {
        return parentPrivate*parentPublic;
    }

    private int getLess()
    {
        return parentPrivate-parentPublic;
    }

    public int getParentPrivate() {
        return parentPrivate;
    }

    public void setParentPrivate(int parentPrivate) {
        this.parentPrivate = parentPrivate;
    }

    public int getParentPublic() {
        return parentPublic;
    }

    public void setParentPublic(int parentPublic) {
        this.parentPublic = parentPublic;
    }


}



