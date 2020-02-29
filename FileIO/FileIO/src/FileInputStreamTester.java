import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by swakkhar on 8/16/16.
 */
public class FileInputStreamTester {
    public static void main(String[] args) throws IOException {

        String fileName = "input.java";
        File myFile = new File(fileName);
        InputStream in = new FileInputStream(myFile);
        int size = in.available();
        int chunk = size/32;
        System.out.println("Size of the file:"+size);
        for(int i=0;i<chunk;i++)
            System.out.print((char)in.read());

        System.out.println("\nStill Available:"+String.valueOf(in.available()));
        byte b[]=new byte[chunk];
        System.out.printf("%s read %d bytes\n",in.read(b)==chunk?"Successfully":"Could not",chunk);
        System.out.println(new String(b));
        System.out.printf("Still Available: %d",size = in.available());
        in.skip(size/2);
        System.out.printf("\nStill Available: %d",size = in.available());
        in.close();
    }
}
