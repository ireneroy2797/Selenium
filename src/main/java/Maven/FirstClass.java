package Maven;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class FirstClass {
	
	 WebDriver driver;
	 String message="Hi, Admin Signout";

	@org.testng.annotations.Test
	public  void Test () throws InterruptedException {
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.wait(30);
		driver.findElement(By.xpath("//a[@href='login.htm'}")).click();
		
		driver.findElement(By.name("userName")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("Password456");
		driver.findElement(By.name("login")).click();
		Assert.assertEquals(message, "Hi, Admin Signout");
		
	}
	@BeforeClass
	public  void BeforeTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public  void AfterTest()
	{
driver.close();
	}}
