package Networking;

import java.net.InetAddress;

public class ToFindIpAddress {

	public static void main(String[] args) {
		
		try
		{
			InetAddress check1=InetAddress.getLocalHost();
			System.out.println(check1);
			System.out.println(check1.getHostName());
			System.out.println(check1.getHostAddress());
			System.out.println(check1.getByName("www.facebook.com"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
