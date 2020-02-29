import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class ClientWorker implements Runnable {
    Socket clientSocket;
    public ClientWorker(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }
    public void run()
    {
        System.out.println("Start of Client Worker for "+
                clientSocket.getInetAddress());
        OutputStream out = null;
        try {
            out = clientSocket.getOutputStream();
            out.write("HELLO\n".getBytes());
            out.write("CLOSING NOW...\n".getBytes());
            out.flush();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("End of Client Worker for "+
                clientSocket.getInetAddress());
    }
}
