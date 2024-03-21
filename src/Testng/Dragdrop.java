package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdrop {
   ChromeDriver driver;
   String baseurl="https://demo.guru99.com/test/drag_drop.html";
   @BeforeTest
   public void setup()
   
   {
	  driver =new ChromeDriver(); 
	  driver.get(baseurl);
	  
   }
   @Test
   public void dragdrop()
   {
	   WebElement cash=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	   WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	   WebElement account=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	   WebElement amount=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	   Actions act=new Actions(driver);
	   act.dragAndDrop(cash, amount);
	   act.dragAndDrop(bank,account );
	   WebElement sale=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	   WebElement acc=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	   WebElement money=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	   WebElement am=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	   act.dragAndDrop(money, am);
	   act.dragAndDrop(sale,acc );
	   act.perform();

	   WebElement perfect=driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
	   	   if(perfect.isDisplayed())
	   	   {
	   		   System.out.println("perfect is displayed");
	   	   }
	   	   else
	   	   {
	   		   System.out.println("perfect is not displayed");
	   	   } 
	   	    
	   {
		   
	   }
	   

   }
   
}

