import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Created by swakkhar on 7/31/16.
 */
public class SimpleClient {
    public static void main(String ...args)
    {
        try {
            System.out.println("Trying to connect");
            Socket clientSocket = new Socket("127.0.1.1",9999);

            InputStream in = clientSocket.getInputStream();
            int c=0;
            while((c=in.read())!=-1)
            {
                System.out.print((char)c);
            }

            System.out.println("End of Client!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
