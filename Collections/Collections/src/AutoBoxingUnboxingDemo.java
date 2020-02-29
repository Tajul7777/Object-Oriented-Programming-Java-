public class AutoBoxingUnboxingDemo {
    static int m(Integer v) {
        return v ;
    }
    public static void main(String args[]) {
        Integer a  = m(100);
        System.out.println(a);
        Integer iOb, iOb2;
        int i;
        iOb = 100;
        System.out.println("Original value of iOb: " + iOb);
        ++iOb;
        System.out.println("After ++iOb: " + iOb);
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after expression: " + iOb2);
        i = iOb + (iOb / 3);
        System.out.println("i after expression: " + i);
        Integer intOb = 100;
        Double doubleOb = 98.6;
        doubleOb = doubleOb + intOb;
        System.out.println("dOb after expression: " + doubleOb);
    }
}



