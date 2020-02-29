/**
 * Created by swakkhar on 6/16/16.
 */
class OuterClass {
    private int outerField=12;
    public void printMe() {
        //System.out.println(innerField);
        System.out.println("Outer Class:"+outerField);
        InnerClass innerClass = new InnerClass();
        innerClass.printMe();
    }
    class InnerClass{
        private int innerField=13;
        public void printMe(){
            System.out.println("Inner Class: "+outerField + " " +
                    innerField);
        }
    }
}
public class InnerClassTest {
    public static void main(String []args){
        OuterClass out=new OuterClass();
        OuterClass.InnerClass innerClass =
                out.new InnerClass();
        out.printMe();
        innerClass.printMe();
    }
}



