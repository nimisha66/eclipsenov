package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandler {
	WebDriver driver;


@BeforeTest
public void beforetest()
{
	driver=new ChromeDriver();
}
@Test
public void test()
{
	driver.get("https://demo.guru99.com/popup.php");
	String parentwindow=driver.getWindowHandle();
	System.out.println("parent window title="+driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
	Set<String>allwindowhandles=driver.getWindowHandles();
	for (String handle:allwindowhandles)
	{
		if(!handle.equalsIgnoreCase(parentwindow)) {
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("appu@gmail.com");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
			driver.close();
		}
	}
  }
}