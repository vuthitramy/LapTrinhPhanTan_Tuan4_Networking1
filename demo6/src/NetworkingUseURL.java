import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkingUseURL {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://trello.com/b/7ccKw8aE/ibsk1d1-vutramy-banglapkehoachblock1-ki3");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        bufferedReader.close();


    }
}
