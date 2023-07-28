import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client1 {
    public static void main(String[] args) {
        String serverIp = "137.0.0.1";
        int serverPort = 8080;
        try {
            Socket socket = new Socket(serverIp,serverPort);

            OutputStream outputStream = socket.getOutputStream();







            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
