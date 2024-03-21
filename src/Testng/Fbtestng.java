package Testng;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Fbtestng {
     ChromeDriver driver;
     String baseurl="https://www.facebook.com/login/";
     @BeforeTest
     public void setup()
     {
    	 driver=new ChromeDriver();
    	 driver.get(baseurl);
    	 
     }
     @Parameters({"username","password"})
     @Test
     public void fblogin(String username,String password)
     {
    	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
    	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
     }
}
