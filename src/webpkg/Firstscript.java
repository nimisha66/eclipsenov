package webpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
	//chromedriver
    //firefoxdriver
	//edgedriver
		ChromeDriver driver=new ChromeDriver();//to launch chrome browser
		driver.get("https://www.google.com");//to open url
		String exp="Google";
		
		String acutaltitle=driver.getTitle();//return title of the application
		if (exp.equals(acutaltitle))
		{
			System.out.println("pass");
			
		}
		else 
		{
			System.out.println("fail");
		}
			driver.quit();
		
	}

}
