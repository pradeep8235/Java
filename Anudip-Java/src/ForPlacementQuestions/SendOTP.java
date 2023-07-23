package ForPlacementQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import javax.net.ssl.HttpsURLConnection;

public class SendOTP 
{
	public static void sendOTP(String message , String number , String apiKey)
	{
		try
		{
		String sendId="FSTSMS";
		String language="english";
		String route="p";
		message=URLEncoder.encode(message,"UTF-8");    //Important Step
		String myUrl="https://www.fast2sms.com/dev/bulkauthorization="+apiKey+"&sender_id="+sendId+"&message="+message+"&language="+language+"&route="+route+"&numbers="+number;
		URL url=new URL(myUrl);
		HttpsURLConnection con= (HttpsURLConnection)url.openConnection();
		
		con.setRequestMethod("GET");
		
		con.setRequestProperty("User-Agent","Mozilla/5.0");
		con.setRequestProperty("cache-control", "no-cache");
		
		int responseCode=  con.getResponseCode();
		
		StringBuffer response=new StringBuffer();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		while(true)
		{
			String line=br.readLine();
			
			if(line==null)
			{
				break;
			}
			
			response.append(line);
		}
		
		System.out.println(response);
		
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
	}

        public static void main(String[] args) 
	{
		   System.out.println("Program Started....");
		   
		   OTP otp=new OTP();
		   String otpmessage=otp.generateOTP(5);
		   System.out.println( "Generate OTP : "+otpmessage);
		   
		   String apiKey="HcJqPDpju53KeU6QkBAazZFLhGgt0dXTY8r7SoRM9IvNOW4b2yKryPHiLJ3IZECU15sgvbXTzxB42jWp";
		   String number="8072283647";
		   
		   sendOTP("Welcome TO DeepTech :"+otpmessage,number,apiKey);
		   
	}
	
}
