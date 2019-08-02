package Maven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Maven2 {
  @Test
  public void f() {
	  System.out.println("Hello world");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Hello world");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Hello world");
  }

}
