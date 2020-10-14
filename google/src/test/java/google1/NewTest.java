package google1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\bharathkumar.rasale\\chrome\\chromedriver.exe\\");
	  
	  driver= new ChromeDriver();
	  
	  
	  
	  driver.get("https://www.google.com");
	  
	  driver.close();
	  
  }
}
