package pomobject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DeductionPage {
	public WebDriver driver;
	
	@FindBy(xpath="//i[@class='fa fa-users']")
	WebElement emp;
	@FindBy(xpath="//a[text()='Deduction']")
	WebElement deduction;
	@FindBy(xpath="//a[@class='btn btn-success']")
	WebElement create;
	@FindBy(xpath="//span[@class='select2-selection__placeholder']")
	WebElement employee;
	@FindBy(xpath="//ul[@id='select2-deduction-worker_id-results']")
	List<WebElement> empname;
	@FindBy(xpath="//input[@id='deduction-type']")
	WebElement type;
	@FindBy(xpath="//input[@id='deduction-amount']")
	WebElement amt;
	@FindBy(xpath="//input[@id='deduction-effective_from']")
	WebElement frm;
	@FindBy(xpath="//button[@type='submit']")
	WebElement save;
	public void createDeduction() throws InterruptedException
	{
		emp.click();
		Thread.sleep(1000);
		deduction.click();
		Thread.sleep(1000);
		create.click();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Thread.sleep(1000);
		employee.click();
		empname.get(0).click();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		type.click();
		type.sendKeys("travel");
		Thread.sleep(1000);
		amt.click();
		amt.sendKeys("1000");
		Thread.sleep(1000);
		frm.clear();
		frm.click();
		frm.sendKeys("31-05-2020");
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);
	}
public DeductionPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}

