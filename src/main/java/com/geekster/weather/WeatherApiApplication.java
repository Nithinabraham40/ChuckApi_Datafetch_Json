package com.geekster.weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.util.JSONPObject;


public class WeatherApiApplication {

	public static void main(String[] args)throws Exception {
	
			// TODO Auto-generated method stub 
			
			URL getURL=new URL("https://api.chucknorris.io/jokes/random");
			HttpURLConnection connection=(HttpURLConnection)getURL.openConnection();
			connection.setRequestMethod("GET");
			int responseCode=connection.getResponseCode();
			
			if(responseCode==200) {
				
				BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
				StringBuilder jsonResponseData=new StringBuilder();
				String readLine=null;
				while((readLine=in.readLine())!=null) {
					
					jsonResponseData.append(readLine);
				}
				in.close();
				JSONObject masterData=new JSONObject(jsonResponseData.toString());
				System.out.println(masterData.toString());
				
			}else {
				System.out.println(responseCode);
			}
	}

}
