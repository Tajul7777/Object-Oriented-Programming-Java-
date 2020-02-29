/**
 * Created by swakkhar on 5/23/16.
 */
public class WrongAbstractStack
{
    private int [] elements;
    private int size=0;

    public WrongAbstractStack(int size) {
        elements=new int[size];
    }
    public int[] getElements() {
        return elements;
    }
    public void setElements(int[] elements) {
        this.elements = elements;
    }
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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


