import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by swakkhar on 8/16/16.
 */
public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        String toWrite ="Java is a general-purpose computer programming language " +
                "that is concurrent, class-based, object-oriented,[14] " +
                "and specifically designed to have as few implementation " +
                "dependencies as possible.";
        FileWriter wr = new FileWriter("java.txt");
        char array[] = new char[toWrite.length()];
        toWrite.getChars(0,toWrite.length(),array,0);
        wr.write(array);
        wr.close();
    }
}
