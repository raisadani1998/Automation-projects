package test;

import org.testng.annotations.Test;

import pomobject.DeductionPage;


public class DeductionTest extends JobTest {
	 @Test(priority=2)
	  public void deduction() throws InterruptedException {
		  DeductionPage ob=new  DeductionPage(driver);
		  ob.createDeduction();
	  }
	
}

