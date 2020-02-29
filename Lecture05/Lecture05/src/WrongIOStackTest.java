/**
 * Created by swakkhar on 5/23/16.
 */
public class WrongIOStackTest {
    public static void main(String [] args)
    {
        WrongIOStack myStack=new WrongIOStack(100);
        for(int i=0;i<10;i++)
            myStack.push();
        while(!myStack.isEmpty())
            myStack.pop();
    }
}


