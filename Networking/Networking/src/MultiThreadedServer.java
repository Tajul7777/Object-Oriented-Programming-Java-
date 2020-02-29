import java.io.IOException;
import java.net.ServerSocket;

/**
 * Created by swakkhar on 7/31/16.
 */
public class MultiThreadedServer{
    private int port=9999;
    ServerSocket server;
    public MultiThreadedServer(int port) {
        this.port = port;
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            System.out.println("Can not listen to port:"+port);
            System.exit(-1);
        }
        while (true)
        {
            ClientWorker w;

            try {
                System.out.println("Waiting for a client to connect!");
                w=new ClientWorker(server.accept());
                Thread t= new Thread(w);
                t.start();
            } catch (IOException e) {
                System.out.println("Accept failed at port:"+port);
                System.exit(-1);
            }
        }

    }

    public static void main(String ...args)
    {
        new MultiThreadedServer(9999);
    }
}
