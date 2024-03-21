package webpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Secondsite {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		String exp="Amazon.com";
		String actualtitle=driver.getTitle();
		if (exp.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		String baseurl="https://www.amazon.com";
		driver.get(baseurl);
		String str=driver.getPageSource();
		if(str.contains("lang"))
		{
			System.out.println("lang text is present");
			
		}
		else
		{
			System.out.println("lang text is not present");
		}
		driver.quit();  
	}

}
 