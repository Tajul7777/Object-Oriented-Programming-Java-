/**
 * Created by swakkhar on 6/19/16.
 */
public class HandleArrayIndexExp {
    public static int getValueAt(int[] array,int index)
            throws Exception {
        if(index >= array.length)
            throw new Exception("getValueAt() called with " +
                    "index"+index);
        else
            return array[index];
    }
    public static void main(String args[]) {
        int array[] = {34,56,94,23,111};
        try {
            getValueAt(array,5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}



