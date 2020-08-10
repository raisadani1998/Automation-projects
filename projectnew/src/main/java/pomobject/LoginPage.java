package pomobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="//input[@id='loginform-username']")
	WebElement username;
	@FindBy(xpath="//input[@name='LoginForm[password]']")
    WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	
	public void LoginDetails() throws InterruptedException {
		username.sendKeys("vinod");
		Thread.sleep(1000);
		password.sendKeys("1q2w3e4r");
		Thread.sleep(1000);
		login.click();
		Thread.sleep(1000);
	}
	public LoginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
