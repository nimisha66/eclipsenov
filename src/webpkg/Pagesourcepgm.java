package webpkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesourcepgm {

	public static void main(String[] args) {
		
		String baseurl="https://www.google.com";
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		if (src.contains("Gmail"))
		{
			System.out.println("gmail text is present");
		}
		else
		{
			System.out.println("gmail text is not present");
		}
		driver.quit();
	}

}
