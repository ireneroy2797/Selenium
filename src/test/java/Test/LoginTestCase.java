package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pages.Login;
import Pages.loginpageusingpagefactory;
import Pages.register;
import Utility.BrowserFactory;

public class LoginTestCase {

 WebDriver driver;
 
 @Test
 
 public void test()
 {
	driver=BrowserFactory.startbrowser("Chrome");
	driver.get("http://demoaut.com");
	
	driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//     Login log= new Login(driver);
// log.loginuser("tutorial","tutorial");
 
// loginpageusingpagefactory logg= PageFactory.initElements(driver, loginpageusingpagefactory.class);
// logg.login("tutorial","tutorial");
	
	register reg= PageFactory.initElements(driver, register.class);
	reg.registerup("tutorial","tutorial");
 
 }

}
