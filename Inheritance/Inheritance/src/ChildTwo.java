/**
 * Created by swakkhar on 5/23/16.
 */
public class ChildTwo extends ParentTwo {
    String name; // this name hides the name in ParentTwo - overriding

    public ChildTwo(String a, String b) {
        super.name = a; // i in ParentTwo
        name = b; // i in ChildTwo
    }
    public void printMe()
    {
        System.out.println(super.name);
        System.out.println(this.name);
    }

}












