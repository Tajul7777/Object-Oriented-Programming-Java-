import java.io.*;

/**
 * Created by swakkhar on 8/16/16.
 */
public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        P p = new P("Hello Serialized!");
        Q q= new Q("Hello Not Serialized!");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("P.obj"));
        out.writeObject(p);
        out.close();

        p.name="Hello World!";

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("P.obj"));
        p=(P)in.readObject();
        in.close();
        System.out.println(p.name);

        R r= new R("Serial","Child");
        out = new ObjectOutputStream(new FileOutputStream("R.obj"));
        out.writeObject(r);
        out.close();

        in = new ObjectInputStream(new FileInputStream("R.obj"));
        r=(R)in.readObject();
        in.close();
        System.out.println(r);

        out = new ObjectOutputStream(new FileOutputStream("Q.obj"));
        out.writeObject(q);
        out.close();
    }
}
class R extends P{
    public String name;

    public R(String name1,String name2) {
        super(name1);
        this.name = name2;
    }
    public String toString()
    {
        return super.name + " "+this.name;
    }
}

class P implements Serializable
{
    public String name;
    //Q q=new Q(); you can not write if q is here
    public P(String name) {
        this.name = name;
    }
}

class Q
{
    public String name;
    public Q(String name) {
        this.name = name;
    }
}
