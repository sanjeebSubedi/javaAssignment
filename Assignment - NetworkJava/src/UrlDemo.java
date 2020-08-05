import java.net.MalformedURLException;
import java.net.URL;
public class UrlDemo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		URL url = new URL("https://www.google.com:8080/college?semester=7");
		
		System.out.println("Protocol: "+ url.getProtocol());
		System.out.println("Host Name: "+ url.getHost());
		System.out.println("Port Number: "+ url.getPort());
		System.out.println("File Name: "+ url.getFile());
		System.out.println("Query: "+ url.getQuery());

	}

}
