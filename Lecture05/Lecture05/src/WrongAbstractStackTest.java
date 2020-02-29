/**
 * Created by swakkhar on 5/23/16.
 */
public class WrongAbstractStackTest {
    public static void main(String [] args)
    {
        WrongAbstractStack myStack= new WrongAbstractStack(100);
        for(int i=0;i<10;i++)
            myStack.push(i);

        while(!myStack.isEmpty())
        {
            System.out.println(myStack.pop());
        }

        myStack.setSize(25);// is this ok?
        int[] elements=myStack.getElements();
        elements[24]=45; // is this ok?
        System.out.println(myStack.pop());

    }
}

