package pomobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	
public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Inventory']")
	WebElement inventory;
	
	@FindBy(xpath="//a[text()='Product']")
	WebElement product;
	
	@FindBy(xpath="//a[text()='Create Product']")
	WebElement create;
	
	@FindBy(xpath="//input[@id='product-name']")
	WebElement name;
	
	@FindBy(xpath="//input[@name='Product[stock]']")
	WebElement stock;
	
	@FindBy(xpath="//input[@id='product-code']")
	WebElement code;
	
	@FindBy(xpath="//select[@id='product-unit']")
	WebElement unit;
	
	@FindBy(xpath="//select[@name='Product[type]']")
	WebElement type;
	
	@FindBy(xpath="//input[@name='Product[yom]']")
	WebElement manufact;
	
	@FindBy(xpath="//input[@id='product-tax']")
	WebElement tax;
	
	@FindBy(xpath="//input[@id='product-price']")
	WebElement price;

	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public void ProductDetails() throws InterruptedException {		
		
		inventory.click();
		Thread.sleep(5000);
	       product.click();
			Thread.sleep(5000);
			create.click();
			Thread.sleep(5000);
			name.sendKeys("HUWAEI");
			Thread.sleep(5000);
			stock.sendKeys("400");
			Thread.sleep(5000);
			code.sendKeys("34");
			Select s=new Select(unit);
			s.selectByVisibleText("Meter");
			Select s1=new Select(type);
			s1.selectByVisibleText("Consumable");
			manufact.sendKeys("45");
			Thread.sleep(5000);
			tax.sendKeys("100000");
			Thread.sleep(5000);
			price.sendKeys("60000");
			
			submit.click();
			Thread.sleep(5000);
		
	}
public ProductPage(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver, this);
}
}
