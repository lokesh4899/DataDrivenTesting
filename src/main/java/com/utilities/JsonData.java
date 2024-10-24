package com.utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class JsonData {
	
	@DataProvider(name="CreateAccount")
	public Object[][] register() throws IOException, ParseException{
		
		FileReader  reader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\utilities\\data.json");
		JSONParser jsonparser=new JSONParser();
		Object obj=jsonparser.parse(reader);
		JSONObject userregisterJsonObj=(JSONObject)obj;
		JSONArray registerArray=(JSONArray)userregisterJsonObj.get("registerTestData");
		Object[][] data=new Object[registerArray.size()][6];
		
		for(int i=0;i<registerArray.size();i++) {
			JSONObject users=(JSONObject) registerArray.get(i);
			data[i][0]=users.get("scenario").toString();
			data[i][1]=users.get("firstname").toString();
			data[i][2]=users.get("lastname").toString();
			data[i][3]=users.get("email").toString();
			data[i][4]=users.get("password").toString();
			data[i][5]=users.get("confirm_password").toString();
		}
		return data;
	}
	
	
	@DataProvider(name="SignIn")
	public Object[][] signIn() throws IOException, ParseException{
		
		FileReader reader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\utilities\\data.json");
		JSONParser jsonparser=new JSONParser();
		Object obj=jsonparser.parse(reader);
		JSONObject userregisterJsonObj=(JSONObject)obj;
		JSONArray registerArray=(JSONArray)userregisterJsonObj.get("signInData");
		Object[][] data=new Object[registerArray.size()][3];
		
		for(int i=0;i<registerArray.size();i++) {
			
			JSONObject users=(JSONObject) registerArray.get(i);
			data[i][0]=users.get("scenario").toString();
			data[i][1]=users.get("email").toString();
			data[i][2]=users.get("password").toString();
		}
		return data;
	}
	
	@DataProvider(name="Address")
	public Object[][] Billing() throws IOException, ParseException{
		
		FileReader  reader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\utilities\\data.json");
		JSONParser jsonparser=new JSONParser();
		Object obj=jsonparser.parse(reader);
		JSONObject userregisterJsonObj=(JSONObject)obj;
		JSONArray registerArray=(JSONArray)userregisterJsonObj.get("BillingAddress");
		Object[][] data=new Object[registerArray.size()][7];
		
		for(int i=0;i<registerArray.size();i++) {
			JSONObject users=(JSONObject) registerArray.get(i);
			data[i][0]=users.get("address").toString();
			data[i][1]=users.get("city").toString();
			data[i][2]=users.get("country").toString();
			data[i][3]=users.get("state").toString();
			data[i][4]=users.get("zipcode").toString();
			data[i][5]=users.get("mobile").toString();
			data[i][6]=users.get("discountcode").toString();

		}
		return data;
	}

}
