/**
 * Created by swakkhar on 6/3/16.
 */
class Monkey
{
    void print()
    {
        System.out.println("I am a monkey!");
    }
}
class Human extends Monkey
{
    void print()
    {
        System.out.println("I am a human!");
    }
}
public class OverRideExample {
    public static void main(String []args)
    {
        Human me = new Human();
        me.print();
        Monkey myAncestor = me;
        myAncestor.print();
        Monkey you=new Monkey();
        you.print();
    }
}


