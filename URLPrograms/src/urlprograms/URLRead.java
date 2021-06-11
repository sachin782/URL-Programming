package urlprograms;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class URLRead{
    public static void main(String args[])throws IOException,MalformedURLException
    {
        URL url = new URL("https://www.javatpoint.com/java-bufferedinputstream-class");
        URLConnection uc = url.openConnection();
        uc.setDoOutput(true);
        String s1;
        DataInputStream dis = new DataInputStream(uc.getInputStream()); 
        while ((s1 = dis.readLine()) != null) 
            System.out.println(s1);
        dis.close();
     }
   }

