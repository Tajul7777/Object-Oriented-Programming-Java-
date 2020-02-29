/**
 * Created by swakkhar on 8/16/16.
 */
public class HelloLambda {
    public static void main(String[] args) {

        Implementable imp = new Implementable() {
            @Override
            public void callMe() {
                System.out.println("Hello World!");
            }
        };

        imp.callMe();
        Implementable imp2 = () -> System.out.println("Hello Lambda");
        imp2.callMe();
    }
}

interface Implementable
{
    public void callMe();
}
