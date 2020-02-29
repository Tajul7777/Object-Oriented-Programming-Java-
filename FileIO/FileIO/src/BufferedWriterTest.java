import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

class BufferedWriterTest {
    public static void main(String args[]) throws Exception
    {
        FileReader fr = new FileReader("input.java");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw = new FileWriter("output.java");
        BufferedWriter bw=new BufferedWriter(fw);
        while(true)
        {
            String s=br.readLine();
            if(s==null) break;
            s=s+"\n";
            bw.write(s);
        }
        bw.close();
        fw.close();
        br.close();
        fr.close();

    }
}