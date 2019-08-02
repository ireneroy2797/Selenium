package demo;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {
@Test
public static void main() {
	
	Robot robot= new Robot();
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C://Selenium 3.0//book.html");
	driver.findElement(By.xpath("/html/body/input")).click();
	robot.setAutoDelay(1000);
	String path= "C:\\Selenium 3.0\\test.csv";
	StringSelection sel= new StringSelection(path);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
	robot.setAutoDelay(1000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.setAutoDelay(1000);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
}
	
	
	
	
	
	
	
}
