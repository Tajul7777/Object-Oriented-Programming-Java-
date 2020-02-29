/**
 * Created by swakkhar on 6/19/16.
 */
interface Implementable{
    public void implementMe();
}
public class AnonymousClassTest {

    public static void main(String...args)
    {
        Implementable Obj=new Implementable() {
            public String myVar="Swakkhar";
            public void implementMe() {
                System.out.println("Implement me inside Anonymous Class!");
                System.out.println("Accessing memebers:"+myVar);
            }
        };
        Obj.implementMe();
    }
}



