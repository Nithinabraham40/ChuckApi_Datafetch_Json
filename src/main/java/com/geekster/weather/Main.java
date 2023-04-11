package com.geekster.weather;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub 
		
		URL getURL=new URL("https://randomuser.me/api/");
		HttpURLConnection connection=(HttpURLConnection)getURL.openConnection();
		connection.setRequestMethod("GET");
		int responseCode=connection.getResponseCode();
		
		if(responseCode==200) {
			
			BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
		}
		
		

	}

	
	
}
