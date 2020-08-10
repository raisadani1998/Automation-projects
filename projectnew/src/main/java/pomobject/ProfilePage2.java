package pomobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProfilePage2 {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='fa fa-user']")
	WebElement s1;
	
	@FindBy(xpath="//a[@href='/erp/user/profile']")
	WebElement s2;
	
	
	@FindBy(xpath="//input[@id='profileform-phone']")
	WebElement phone;
	
	@FindBy(xpath="//input[@name='ProfileForm[username]']")
	WebElement name;
	
	@FindBy(xpath="//select[@name='ProfileForm[company_id]']")
	WebElement company;
	
   @FindBy(xpath="//input[@type='checkbox']")
   List<WebElement>branch;
	
    @FindBy(xpath="//button[@type='submit']")
	WebElement save;
	
	
	public void ProfileDetails() throws InterruptedException {	
		s1.click();
		Thread.sleep(5000);
	      s2.click();
	   	Thread.sleep(5000);
		phone.clear();

		phone.sendKeys("9947074521");
		Thread.sleep(5000);
		name.clear();
		name.sendKeys("vinod");
		Thread.sleep(5000);
		Select d=new Select (company);
		d.selectByIndex(0);
		Thread.sleep(5000);
		
		branch.clear();
		branch.get(10).click();
		Thread.sleep(5000);
		save.click();
		Thread.sleep(5000);
	}
	public ProfilePage2(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

		
		
		
		
		
		
		
		
		