package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
  ChromeDriver driver;
  String baseurl="https://www.facebook.com";
  @Before
  public void setup()
  {
	  driver =new ChromeDriver();
	  driver.get(baseurl);
  }
  @Test
  public void titleverification()
  {
	  String exp="Facebook";
	  String actualtitle=driver.getTitle();
	  if(exp.equals(actualtitle))
	  {
		  System.out.println("pass");
	  }
	  else
	  {
		  System.out.println("fail");
	  }
  }
	 @Test
	 public void pagesource()
	 {
		 String baseurl="https://www.facebook.com";
		 driver.get(baseurl);
		 String s=driver.getPageSource();
		 if(s.contains("Gmail"))
		 {
			 System.out.println("text is present");
			 
		 }
		 else
		 {
			 System.out.println("text is not present");
		 }
	 }
		 @After
		 public void teardown()
		 {
			 driver.quit();
		 }
	 
	 
		
	 
	  
	  
		  
		  
		  
	  
  }

