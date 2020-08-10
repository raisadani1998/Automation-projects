package test;

import org.testng.annotations.Test;

import pomobject.SupplierPage;

public class SupplierTest extends LoginTest{
 
	  @Test(priority=5)
	  public void supply() throws InterruptedException {
		  SupplierPage ob=new  SupplierPage(driver);
		  ob.SupplierDetails();
	  }
	
}
