package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

	WebDriver driver;
	By username=By.name("userName");
	By password=By.name("password");
	By signin=By.name("login");
	
	public Login(WebDriver driver) {
		this.driver=driver;
		
	}
	public void loginuser(String usr,String pass)
	{
		driver.findElement(username).sendKeys(usr);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(signin).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
}
