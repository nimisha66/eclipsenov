package Testng;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Softassertion {

	  ChromeDriver driver;
		  String baseurl="https://www.facebook.com/";
		  @BeforeTest
		  public void setup()
		  {
			  driver=new ChromeDriver();
			  driver.get(baseurl);
		  }
	@Test
	public void titleverification()
	  {
		String exp="Facebook";
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(exp))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail"); 
		}
	  }

}
