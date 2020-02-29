import java.io.File;
import java.io.FileReader;

class FileReaderTest {
    public static void main(String args[]) throws Exception
    {
        File f=new File("input.java");
        FileReader fr = new FileReader(f);
        char data[]=new char[(int)f.length()];
        fr.read(data);
        System.out.println(new String(data));
        fr.close();
    }
}