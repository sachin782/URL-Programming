package urlprograms;
import java.net.URL;
public class JavaURL {
    public static void main(String args[])throws Exception
    {
        URL url = new URL("https://www.google.com/search?sxsrf=ACYBGNR3pyYDId47CMNZcB4qz07seHrBaQ%3A1580276474097&ei=-hoxXqLTBaCUk74Plv2U-AY&q=hello&oq=hello&gs_l=psy-ab.3..35i39l3j0i67l2j0l5.41464.46355..46543...4.2..3.599.4299.1j4-2j6......0....1..gws-wiz.....10..0i71j35i362i39j0i131i67j0i131j0i273.BEG8qbBF_pk&ved=0ahUKEwiiuIrPjKjnAhUgysQBHZY-BW8Q4dUDCAs&uact=5");
        System.out.println("Protocol: "+url.getProtocol());    
        System.out.println("Host Name: "+url.getHost());    
        System.out.println("Port Number: "+url.getPort());    
        System.out.println("Default Port Number: "+url.getDefaultPort());    
        System.out.println("Query String: "+url.getQuery());    
        System.out.println("Path: "+url.getPath());    
        System.out.println("File: "+url.getFile());    
    }  
}
