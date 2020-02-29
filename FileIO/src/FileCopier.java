import java.io.*;

/**
 * Created by swakkhar on 8/16/16.
 */
public class FileCopier {
    public static void main(String[] args) throws IOException {
        String fileSource = "src/java.jpg";
        String fileDest = "src/coffee.jpg";
        InputStream in = new FileInputStream(fileSource);
        OutputStream out= new FileOutputStream(fileDest);
        while(in.available()>0)
        {
            out.write(in.read());
        }
        in.close();
        out.close();
    }
}
