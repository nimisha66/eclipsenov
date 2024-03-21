package junitpkg;

import java.net.HttpURLConnection;
import java.net.URL;


import org.testng.annotations.Test;


@Test
public class Linkvalidation {
	String link="https://www.google.com";
	
	public void test()
	{
		try {
			
		
		URL u=new URL(link);
		HttpURLConnection con=(HttpURLConnection)u.openConnection();
		int code=con.getResponseCode();
		System.out.println(code);
		if (code==200)
		{
			System.out.println("response code is 200-successful");
		}
		else
		{
			System.out.println("not expected");
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
		
	}
		 
	     }
	}



