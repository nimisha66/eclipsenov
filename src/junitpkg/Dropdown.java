package junitpkg;

import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdown {
  ChromeDriver driver;
  String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
  @Before
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get(baseurl);
  }
  @Test 
  public void test()
  {
	   
  }
}

