package urlprograms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
public class URLRead2 {
    public static void main(String[] args) throws MalformedURLException,IOException {

        URL url = new URL("https://www.javatpoint.com/java-bufferedinputstream-class");
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String s;
        while ((s = in.readLine()) != null)
            System.out.println(s);
        in.close();
    }
}
