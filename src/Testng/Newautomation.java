package Testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newautomation {
	
  ChromeDriver driver;
  String baseurl="https://automationexercise.com/login";
  @BeforeTest
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get(baseurl);
	  
  }
  @Test
  public void test()
  {
	  WebElement name=driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
	  name.sendKeys("nimisha");
	  WebElement email=driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
	  email.sendKeys(" nimi123@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
	  driver.findElement(By.xpath(" //*[@id=\"id_gender2\"]")).click();
	  driver.findElement(By.xpath(" //*[@id=\"password\"]")).sendKeys("nimi@123");
	  WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"] "));
	  Select daydetails=new Select (day);
	  daydetails.selectByValue("14");
	  WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"] "));
	  Select monthdetails=new Select(month);
      monthdetails.selectByValue("8");
	  WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"] "));
	  Select yeardetails=new Select(year);
	  yeardetails.selectByValue("2002");
	  driver.findElement(By.xpath(" //*[@id=\"first_name\"]")).sendKeys(" nimisha");
	  driver.findElement(By.xpath(" //*[@id=\"last_name\"]")).sendKeys("nandan");
	  driver.findElement(By.xpath("//*[@id=\"company\"] ")).sendKeys("raj.pvtlimited");
	  driver.findElement(By.xpath("//*[@id=\"address1\"] ")).sendKeys("  Gandhinagar 2nd street pallimukk,vadakara (po)");
      driver.findElement(By.xpath("//*[@id=\"address2\"] ")).sendKeys("Gandhinagar 2nd street pallimukk,vadakara ");
	  WebElement country=driver.findElement(By.xpath("//*[@id=\"country\"] "));
	  Select countrydetails=new Select(country);
	  countrydetails.selectByValue("India");
	  driver.findElement(By.xpath("//*[@id=\"state\"] ")).sendKeys(" kerala");
	  driver.findElement(By.xpath("//*[@id=\"city\"] ")).sendKeys(" palakkad");
	  driver.findElement(By.xpath("//*[@id=\"zipcode\"] ")).sendKeys(" 679306");
	  driver.findElement(By.xpath(" //*[@id=\"mobile_number\"]")).sendKeys(" 9876534291");
	  driver.findElement(By.xpath(" //*[@id=\"form\"]/div/div/div/div[1]/form/button")).submit();
  }
}
