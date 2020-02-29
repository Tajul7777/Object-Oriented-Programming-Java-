import java.io.BufferedReader;
import java.io.FileReader;

class BufferedReaderTest {
    public static void main(String args[]) throws Exception
    {
        FileReader fr = new FileReader("input.java");
        BufferedReader br=new BufferedReader(fr);
        while(true)
        {
            String s=br.readLine();
            if(s==null) break;
            System.out.println (s);
        }
        br.close();
        fr.close();

    }
}