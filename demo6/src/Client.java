import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        String severIP = "192.168.1.71";
        int severPort = 8080;

        Socket socket = new Socket(severIP, severPort);


        BufferedWriter outputStream = null;
        BufferedReader inputStream = null;

        try {
            outputStream = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            inputStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in);
        while (true){
            String msg = sc.nextLine();
            outputStream.write(msg);
            outputStream.newLine();
            outputStream.flush();
//            outputStream.write(msg.getBytes());
//            outputStream.write(10);
//            outputStream.write(13);
//            outputStream.flush();
            msg = inputStream.readLine();
            System.out.println(msg);
        }
//        String message = " Hello, bạn!";
//        outputStream.write(message.getBytes());

//        socket.close();
    }
}