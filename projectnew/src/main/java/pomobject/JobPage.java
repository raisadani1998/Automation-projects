package pomobject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class JobPage {
	public WebDriver driver;

	@FindBy(xpath = "//i[@class='fa fa-calendar']")
	WebElement calender;

	@FindBy(xpath = "//a[@href='/erp/attendances']")
	WebElement attendance;

	@FindBy(xpath = "//input[@id='attendanceform-date']")
	WebElement datepicker;

	@FindBy(xpath = "//span[@title='Select date']")
	WebElement date;

	@FindBy(xpath = "//th[@class='datepicker-switch']")
	WebElement year;

	@FindBy(xpath = "//span[@class='month']")
	List<WebElement> month;

	@FindBy(xpath = "//td[@class='day']")
	List<WebElement> day;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement start;

	@FindBy(xpath = "//input[@class='file-caption-name']")
	WebElement upload;

	@FindBy(xpath = "//input[@name='WoAtSearch[worker.first_name]']")
	WebElement name;

	@FindBy(xpath = "//input[@name='WoAtSearch[emp_code]']")
	WebElement code;

	public void attendance() throws InterruptedException {
		calender.click();
		Thread.sleep(5000);

		attendance.click();
		Thread.sleep(5000);

		date.click();
		Thread.sleep(5000);

		year.click();
		Thread.sleep(5000);

		month.get(3).click();
		Thread.sleep(5000);

		day.get(5).click();
		Thread.sleep(5000);

		start.click();
		Thread.sleep(5000);

		upload.sendKeys("E:\\Book1.xlsx");
		Thread.sleep(5000);

		name.sendKeys("sagar");
		Thread.sleep(5000);

		code.sendKeys("TECH00102");
	}

	@FindBy(xpath = "//a[text()='Job']")
	WebElement job;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement createjob;
	
	@FindBy(xpath = "//input[@name='Job[title]']")
	WebElement jobTitle;

	
	@FindBy(xpath = "//span[@id='select2-job-client_id-container']")
	WebElement client;
	
	@FindBy(xpath="//li[@class='select2-results__option']")
	WebElement cl;


	@FindBy(xpath = "//input[@id='job-po']")
	WebElement po;

	
	@FindBy(xpath = "//select[@id='job-type']")
	WebElement jobtype;

	
	@FindBy(xpath = "//textarea[@id='job-description']")
	WebElement description;



	//@FindBy(xpath = "//button[@class='btn btn-success']")
	//WebElement save;

	public void createJob() throws InterruptedException {
		calender.click();
		Thread.sleep(500);

		job.click();
		Thread.sleep(1000);

		createjob.click();
		Thread.sleep(1000);

		jobTitle.click();
		Thread.sleep(1000);

		jobTitle.sendKeys("Accountant");
		Thread.sleep(1000);

		client.click();
		Thread.sleep(1000);
		
		cl.click();
		Thread.sleep(1000);
		 
		po.click();
		po.sendKeys("abc");
		Thread.sleep(1000);

		Select type1 = new Select(jobtype);
		type1.selectByVisibleText("Normal");
		Thread.sleep(2000);
		
		description.click();
		description.sendKeys("maintain and update database");
		Thread.sleep(1000);

		//save.click();
		//Thread.sleep(1000);
	}

	public JobPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
