import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by swakkhar on 8/16/16.
 */
public class FileOutputStreamTester {
    public static void main(String[] args) throws IOException {

        String toInsert ="James Arthur Gosling, OC (born May 19, 1955)" +
                " is a Canadian computer scientist," +
                " best known as the father of the Java " +
                "programming language. (from WikiPedia)";
        byte buffer[]=toInsert.getBytes();
        OutputStream out = new FileOutputStream("gosling.txt");
        out.write(buffer);
        out.flush();
        out.close();

        OutputStream outTwo = new FileOutputStream("quarter.txt");
        outTwo.write(buffer, buffer.length/2,buffer.length/4);
        outTwo.flush();
        outTwo.close();


    }
}
