package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	//String Expectedresult="Find a Flight: Mercury Tours:";
  @Test
  public void login() {
	  /*driver.findElement(By.name("userName")).sendKeys("tutorial");
	  driver.findElement(By.name("password")).sendKeys("tutorial");
	  driver.findElement(By.name("login")).click();
	  //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  WebDriverWait wait= new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.titleIs("Find a Flight: Mercury Tours:"));
	  //Assert.assertEquals(Expectedresult, driver.getTitle());*/
	  System.out.println("se");
	  
  }
  @Test
  public void f3() {
	  System.out.println("search");
  }
  
  @BeforeTest
  public void beforetest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium 3.0\\Selium 3.0\\Selium 3.0\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");

		  WebElement resize= driver.findElement(By.xpath("//*[@id='resizable']/h3"));
		  Actions action= new Actions(driver);
				  action.dragAndDropBy(resize, 400, 200).build().perform();
 }
  @BeforeClass
  public void beforeclass() {
	  System.out.println("before class");
  }
  
  @AfterClass
  public void afterclass() {
	  driver.close();
  }
  @AfterTest
  public void aftertest() {
	  System.out.println("disconnect wid db");
  }
}
