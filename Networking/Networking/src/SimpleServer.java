import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by swakkhar on 7/31/16.
 */
public class SimpleServer {
    int port = 9999;
    public static void main(String ...args)
    {
        try {
            ServerSocket socket=new ServerSocket(9999);
            System.out.println("Waiting for a client to connect!");
            Socket clientSocket = socket.accept();
            System.out.println(clientSocket.getInetAddress());

            OutputStream out = clientSocket.getOutputStream();
            out.write("HELLO\n".getBytes());
            out.write("CLOSING NOW...\n".getBytes());
            out.flush();
            System.out.println("End of Server!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
