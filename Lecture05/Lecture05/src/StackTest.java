/**
 * Created by swakkhar on 5/23/16.
 */
public class StackTest {
    public static void main(String args[])
    {
        Stack myStack = new Stack(100);

        for(int i=0;i<10;i++)
            myStack.push(i);

        while(!myStack.isEmpty())
        {
            System.out.println(myStack.pop());
        }
    }
}


