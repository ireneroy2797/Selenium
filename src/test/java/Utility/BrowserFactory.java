package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	static WebDriver driver;
	public static WebDriver startbrowser(String browsername)
	{
		if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver_win32\\chromedriver.exe");
			 driver=new FirefoxDriver();
		}
		else if (browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
//		driver.manage().window().maximize();
//		driver.get(url);
		return driver;

	}

}
