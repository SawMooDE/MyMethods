import java.net.*;
import java.util.Scanner;

public class IPAddressFinder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String domainName = sc.nextLine();
			getIPAddress(domainName);
			sc.close();
		}
	
	public static void getIPAddress(String domainName) {
        try {
            InetAddress address = InetAddress.getByName(domainName);
             String ip = address.getHostAddress();
             System.out.println("The IP address of " + domainName + " is " + ip);       
        } 
        catch (UnknownHostException ex) {
            System.err.println("Unknown host: " + domainName);
        }
    }	
	
}
