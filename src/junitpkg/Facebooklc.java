package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class Facebooklc {
	 ChromeDriver driver;
	 String baseurl="https://www.facebook.com";
	 
	 @Before
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl);
	 }
    @Test
    public void fblogin()
     {
    	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("nimisha@gmail.com");
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("nmh");
    	driver.findElement(By.xpath ("//button[@name='login']")).click();
     }
}

