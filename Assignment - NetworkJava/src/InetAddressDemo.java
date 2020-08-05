import java.net.*;
import java.io.*;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		InetAddress inetAddress = InetAddress.getByName("www.google.com");
		System.out.println("Host name: "+inetAddress.getHostName());
		System.out.println("Ip Address: "+inetAddress.getHostAddress());
	}

}
