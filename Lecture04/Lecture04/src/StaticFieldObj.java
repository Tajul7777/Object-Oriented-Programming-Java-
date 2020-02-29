/**
 * Created by swakkhar on 6/1/16.
 */
public class StaticFieldObj
{
    public static int count=0;

    public StaticFieldObj()
    {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String args[])
    {
        System.out.println("Count Called using class:"+StaticFieldObj.count);
        StaticFieldObj obj1=new StaticFieldObj();
        StaticFieldObj obj2=new StaticFieldObj();
        StaticFieldObj obj3=new StaticFieldObj();
        System.out.println("Count Called using class:"+StaticFieldObj.count);
        System.out.println("Count using object1:"+obj1.count);
        obj2.count=34;
        System.out.println("Count using object1:"+obj1.count);
        System.out.println("Static Method using class:"+StaticFieldObj.getCount());
        System.out.println("Static Method using object:"+obj3.getCount());
    }
}

