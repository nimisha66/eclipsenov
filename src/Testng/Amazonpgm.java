package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonpgm {
	WebDriver driver;


@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	
}
@Test
public void amazontest()
{
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
      String home=driver.getWindowHandle();
	   WebElement search=driver.findElement(By.xpath(" //*[@id=\"twotabsearchtextbox\"]"));
	   search.sendKeys("mobiles");
	   search.submit();
	  	   String exptitle="Amazon.in:mobilephones";
	   String actualtitle=driver.getTitle();
	   
	   System.out.println("currenttitle="+actualtitle);

	   if (exptitle.equals(actualtitle))
			   {
		   System.out.println("correcttitle");
			   }
	   else
	   {
		   System.out.println("incorrecttitle");
	   }
	driver.findElement(By.xpath(" //*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();

	 Set<String>multiplewindow=driver.getWindowHandles();
	 for(String secondwindow:multiplewindow)
	 {
		 if(!secondwindow.equalsIgnoreCase(home))
		 {
			 driver.switchTo().window(secondwindow);
			 driver.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input ")).click();
	       
		 }
	 }
	 

	   

}
}