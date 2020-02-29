import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatApplication extends JFrame implements Runnable{

    private String ipAddress;
    private int port;
    private boolean isServer;
    private Socket trySocket;
    private JTextField textChat = new JTextField("Press Enter to Send");
    private JTextArea jTextArea= new JTextArea();
    private JScrollPane jScrollPane = new JScrollPane(jTextArea);
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public ChatApplication(String ipAddress, int port) {
        this.ipAddress = ipAddress;
        this.port = port;

        try {
           trySocket = new Socket(ipAddress,9999);
            isServer=false;
        } catch (IOException e) {
            System.out.println("Failed As a client. Now initiating a Server!");
            try {
                ServerSocket serverSocket = new ServerSocket(port);
                trySocket = serverSocket.accept();
                isServer=true;
            } catch (IOException e1) {
                System.out.println("Failed Server");
                System.exit(-1);
            }
        }finally {
            System.out.println(trySocket.isConnected());
            // should start a GUI now
            setTitle("Chat Window"+(isServer==true?"Server":"client"));
            setSize(400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocation(isServer==true?100:600,100);
            setLayout(new BorderLayout());
            add(jScrollPane,BorderLayout.CENTER);
            add(textChat,BorderLayout.SOUTH);
            jTextArea.setEditable(false);
            try {
                out = new ObjectOutputStream(trySocket.getOutputStream());
                in = new ObjectInputStream(trySocket.getInputStream());
                out.flush();
                textChat.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jTextArea.append("Me:"+textChat.getText()+"\n");
                        try {
                            out.writeObject(textChat.getText());
                            out.flush();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                        textChat.setText("");
                    }
                });
                Thread receiver = new Thread(this);
                receiver.start();

            } catch (Exception e) {
                e.printStackTrace();
            }

            setVisible(true);
        }

    }
    public void run()
    {
        while(true)
        {
            try {
                jTextArea.append("You:"+(String)in.readObject()+"\n");
            } catch (Exception e) {
                break;
            }
        }
    }
    public static void main(String ...args)
    {
        new ChatApplication("127.0.1.1",9999);
    }
}



