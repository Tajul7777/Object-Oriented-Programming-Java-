import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by swakkhar on 7/31/16.
 */
public class GoogleClient {
    public static void main(String ...args) throws IOException {
        Socket clientSocket = new Socket("www.google.com",80);
        InputStream in = clientSocket.getInputStream();
        OutputStream out = clientSocket.getOutputStream();
        out.write("GET\n".getBytes());
        out.flush();
        int c=0;
        while((c=in.read()) !=-1)
        {
            System.out.print((char)c);
        }
    }
}
