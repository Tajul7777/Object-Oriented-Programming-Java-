import java.net.InetAddress;
import java.net.UnknownHostException;

public class Resolver
{
    public static void main(String args[] ) {
        try {
            InetAddress ipAddress = InetAddress.getByName("www.uiu.ac.bd");
            System.out.println(ipAddress);
            System.out.println(ipAddress.getHostAddress());
            System.out.println(ipAddress.getHostName());

            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
            System.out.println(localHost.getHostAddress());
            System.out.println(localHost.getHostName());

            byte address[] = new byte[] {(byte)172,(byte)217,(byte)24,(byte)228};
            InetAddress whois = InetAddress.getByAddress(address);
            System.out.println(whois);
            System.out.println(whois.getHostAddress());
            System.out.println(whois.getHostName());

        }
        catch ( UnknownHostException ex ) {
            System.out.println(ex);
        }
    }
} 