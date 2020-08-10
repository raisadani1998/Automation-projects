package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Base {
	public WebDriver driver;
 
  
  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "F:\\backup07-03-2020\\hp\\Downloads\\chromedrivernew\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://qabible.in/erp/");
		driver.manage().window().maximize();
		
	  
  }
@AfterTest
  public void afterTest() {
	  driver.close();
  }

}
