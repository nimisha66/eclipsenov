package junitpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Alllinkvalidation {
    String baseurl="https://www.google.com";
    ChromeDriver driver;
    @BeforeMethod
	public void setup()
    {
    	driver=new ChromeDriver();
    	driver.get(baseurl);
    }
    public void linkvalidation()
    {
    	List<WebElement> li=driver.findElement(By.tagName("a"));
    	System.out.println("total link  count="+li.size());
    	for (WebElement ele:li);
    }
}
