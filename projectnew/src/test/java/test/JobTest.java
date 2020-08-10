package test;

import java.awt.AWTException;

import org.testng.annotations.Test;

import pomobject.JobPage;


public class JobTest extends ProductTest {
	@Test(priority=1)
	  public void job() throws InterruptedException {
		  JobPage ob=new JobPage(driver);
		  ob.attendance();
		  ob.createJob();
	  }
	}
