package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Systemalert {
    ChromeDriver driver;
    String baseurl="file:///C:/Users/DELL/Desktop/javapgm/newweb.html";
    @Before
    public void setup()
    {
    	driver=new ChromeDriver();
    	driver.get(baseurl);
    }
 @Test
 public void titleverification()
 {
	 driver.findElement(By.xpath("//input[@type='button']")).click();
	 Alert a=driver.switchTo().alert();
	 String alerttext=a.getText();
	 System.out.println("alerttext="+alerttext);
	 a.accept();
	 //a.dismiss();//to cancel alert
	 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("nimisha");
	 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nandan"); 

	 
 }
}
