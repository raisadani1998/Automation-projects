package pomobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SupplierPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Inventory']")
	WebElement inventory;
	
	@FindBy(xpath="//a[@href='/erp/suppliers']")
	WebElement supplier;
	
	@FindBy(xpath = "//a[text()='Create Supplier']")
	WebElement create;
	@FindBy(xpath = "//input[@id='supplier-name']")
	WebElement name;
	@FindBy(xpath = "//input[@id='supplier-address1']")
	WebElement addr1;
	@FindBy(xpath = "//input[@id='supplier-address2']")
	WebElement addr2;
	@FindBy(xpath = "//input[@name='Supplier[phone]']")
	WebElement phone;
	@FindBy(xpath = "//input[@id='supplier-mobile']")
	WebElement mobile;
	@FindBy(xpath = "//input[@id='supplier-email']")
	WebElement email;
	@FindBy(xpath = "//input[@name='Supplier[gstno]']")
	WebElement gst;
	@FindBy(xpath = "//input[@id='supplier-city']")
	WebElement city;
	@FindBy(xpath = "//input[@name='Supplier[state]']")
	WebElement state;
	@FindBy(xpath = "//input[@name='Supplier[zip]']")
	WebElement zip;
	@FindBy(xpath = "//input[@id='supplier-account_name']")
	WebElement accname;
	@FindBy(xpath = "//input[@id='supplier-ac_no']")
	WebElement accno;
	@FindBy(xpath = "//input[@name='Supplier[re_ac_no]']")
	WebElement reaccno;
	@FindBy(xpath = "//input[@id='supplier-ifsc']")
	WebElement ifsc;
	@FindBy(xpath = "//input[@id='supplier-bank_name']")
	WebElement bankname;
	@FindBy(xpath = "//input[@id='supplier-bank_branch']")
	WebElement branch;
	@FindBy(xpath = "//input[@id='supplier-status']")
	
	WebElement checkbox;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submit;

	public void SupplierDetails() throws InterruptedException {		
		
	inventory.click();
       supplier.click();
		Thread.sleep(5000);
	
	    create.click();
		Thread.sleep(5000);

		name.sendKeys("HUWAEI");
		Thread.sleep(5000);
		addr1.sendKeys("Then");
		Thread.sleep(5000);
		addr2.sendKeys("tvm");
		phone.sendKeys("2333");
		Thread.sleep(5000);
		mobile.sendKeys("97865435678");
		Thread.sleep(5000);
		email.sendKeys("112@gmail.com");
		Thread.sleep(5000);
		gst.sendKeys("1234443");
		city.sendKeys("tvm");
		Thread.sleep(5000);
		state.sendKeys("Kerala");
		Thread.sleep(5000);
		zip.sendKeys("689692");
		Thread.sleep(5000);
		accname.sendKeys("say11");
		accno.sendKeys("677899923");
		reaccno.sendKeys("677899923");
		ifsc.sendKeys("SBIN0070262");
		Thread.sleep(5000);
		bankname.sendKeys("SBI");
		Thread.sleep(5000);
		branch.sendKeys("TVM");
		Thread.sleep(5000);

		if(!checkbox.isSelected())
		    checkbox.click();
		submit.click();
		Thread.sleep(5000);
	}

	public SupplierPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
