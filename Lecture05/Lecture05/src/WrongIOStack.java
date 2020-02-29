import java.util.Scanner;

/**
 * Created by swakkhar on 5/23/16.
 */
public class WrongIOStack {
    private int [] elements;
    private int size=0;
    Scanner ss=new Scanner(System.in);

    public WrongIOStack(int size) {
        elements=new int[size];
    }

    public void push()
    {
        System.out.print("Enter an integer to push:");
        elements[size++]= ss.nextInt();
    }

    public void pop()
    {
        System.out.println("Item popped:"+elements[--size]);
    }

    public boolean isFull()
    {
        return size==elements.length;
    }
    public boolean isEmpty()
    {
        return size==0;
    }
}


