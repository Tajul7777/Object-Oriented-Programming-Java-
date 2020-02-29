/**
 * Created by swakkhar on 6/19/16.
 */
public class ArrayIndexExp {
    public static int getValueAt(int[] array,int index)
    {
        return array[index];
    }

    public static void main(String args[])
    {
        int array[] = {34,56,94,23,111};
        System.out.println(getValueAt(array,5));
    }
}


