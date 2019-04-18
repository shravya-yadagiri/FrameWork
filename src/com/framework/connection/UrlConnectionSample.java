package com.framework.connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionSample {

	public StringBuffer queryHttps(String httpurl)
	{
		StringBuffer response=new StringBuffer();
		String url=httpurl;
		try {
		URL obj=new URL(url);
		
			HttpURLConnection connection=(HttpURLConnection) obj.openConnection();
			int responseCode=connection.getResponseCode();
			
			BufferedReader br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String inputLine;
			System.out.println("responseCode:::"+responseCode);
			inputLine=br.readLine();
			while(inputLine!=null)
			{
				response.append(inputLine);
				inputLine=br.readLine();
			}
			System.out.println("response:::"+response.toString());
		} catch (IOException e) {
			System.out.println("error occurred....");
			e.printStackTrace();
		}
		return response;
	}
}
