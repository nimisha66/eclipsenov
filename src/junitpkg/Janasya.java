package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya {
         ChromeDriver driver;
         String baseurl="https://www.janasya.com";
         @Before
         public void setup()
         {
        	 driver=new ChromeDriver();
        	 
         }
         @Test
         public void janasya() throws InterruptedException
         {
        	 driver.get(baseurl);
     		Thread.sleep(1000);
   WebElement newarrivals =driver.findElement(By.xpath("//div[@id='HeaderNavigation']/nav/ul/li/a/span"));
   newarrivals.click();
   WebElement search =driver.findElement(By.xpath("//input[@id='Search-In-Modal']"));
   search.sendKeys("saree");
   search.submit();
   List<WebElement>linklist=driver.findElements(By.tagName("a"));
	System.out.println(linklist.size());
	 WebElement  catagories=driver.findElement(By.xpath("//div[@id='halo-sidebar']"));
	  catagories.click();
		 WebElement  newest=driver.findElement(By.xpath("//div[@id='halo-sidebar']/div[2]/div[1]/div[2]/div/ul/li[1]/a/span"));
		 newest.click();
		 WebElement  title=driver.findElement(By.xpath("//div[@id='shopify-section-sections--16282719912106__header-mobile']/sticky-header-mobile/div/div[1]/div[3]/div/a/img"));
         title.submit();
         }
      
       
}
