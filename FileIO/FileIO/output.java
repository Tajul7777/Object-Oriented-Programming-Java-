interface ILambdaOne
{
    public void callMe(int n); // parameterized
}

interface  ILambdaTwo
{
    public int callMe(int x); // return type
}

public class LambdaTester {
    public static void main(String[] args) {

        ILambdaOne one = (n)->{
            System.out.println("This is a block functional call");
            System.out.println("Lamda parameter:"+n);
        };
        one.callMe(6);

        ILambdaTwo two = (p) -> 234;
        System.out.println("This functional interface returns:"+two.callMe(4));

        ILambdaTwo three =(p) -> {
            return (int)(Math.random()*p);
        };
        System.out.println("This functional interface returns:"+three.callMe(10));

        callMe((n)-> System.out.print(n+" "),new int[]{34,34,23});

    }

    public static void callMe(ILambdaOne imp, int[] array)
    {
        for (Integer i:array) {
            imp.callMe(i);
        }
    }
}


