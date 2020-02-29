/**
 * Created by swakkhar on 5/23/16.
 */
public class StructLikeStackTest {
    public static void push(StructLikeStack s,int e)
    {
        s.elements[s.size++]=e;
    }
    public static int pop(StructLikeStack s)
    {
        return s.elements[--s.size];
    }
    public static boolean isEmpty(StructLikeStack s)
    {
        return s.size==0;
    }
    public static boolean isFull(StructLikeStack s)
    {
        return s.size == s.elements.length;
    }
    public static void main(String [] args)
    {
        StructLikeStack s= new StructLikeStack();

        for(int i=0;i<10;i++)
            push(s,i);

        while(!isEmpty(s))
        {
            System.out.println(pop(s));
        }
    }
}


