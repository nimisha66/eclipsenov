package Testng;





import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/pdf_to_word";

@BeforeTest
public void setup()

{
driver=new ChromeDriver();
driver.get(baseurl);

}
@Test
public void fileuploadpgm() throws Exception
{
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	fileupload("\"C:\\Users\\DELL\\Documents\\CV nimisha.pdf\"");
}
private void fileupload(String p) throws AWTException {
	StringSelection strselection=new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
	Robot robot=new Robot();
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_V);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.delay(2000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
}

	
}
