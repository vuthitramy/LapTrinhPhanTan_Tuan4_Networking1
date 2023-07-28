import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkingUseInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("www.example.com");

        String ipAddress = address.getHostAddress();
        System.out.println("IP Address:"  + ipAddress);

        String hosName = address.getHostName();
        System.out.println("HosName:" + hosName);

        boolean reachable = false;
        try {
            reachable = address.isReachable(5000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Reachable:" + reachable);
    }

}
