/**
 * Created by swakkhar on 5/23/16.
 */
public class Stack {
    private int elements[];
    private int size;

    public Stack(int size) {
        elements = new int[size];
    }

    public void push(int e)
    {
        elements[size++]=e;
    }

    public int pop()
    {
        return elements[--size];
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
