package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Urltest {
	ChromeDriver driver;
	String url="https://automationexercise.com/login";

@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get(url);
}
@Test
public void signup()

{
	WebElement name=driver.findElement(By.name("name"));
	name.sendKeys("nimisha");
	WebElement email=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
	email.sendKeys("nimisha@gmail.com");
	WebElement signup=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
	signup.click();
	String expectedurl="https://automationexercise.com/";
	String actualurl=driver.getCurrentUrl();
	System.out.println("currenturl="+actualurl);
	if(expectedurl.equals(actualurl))
	{
		System.out.println("currenturl");
	}
	else
	{
		System.out.println("incorrect url");
	}

	
} 
}