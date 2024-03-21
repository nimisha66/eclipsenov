package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void fetchlinks()
	{
  	  List<WebElement>linklist=driver.findElements(By.tagName("a"));
      
	for (WebElement link : linklist) 
    	  
	{
		System.out.println("linktext="+link.getText());
		System.out.println("linktext="+link.getAttribute("href"));
	}
	}
	

}
