package test;

import org.testng.annotations.Test;

import pomobject.ProductPage;

public class ProductTest extends ProfileTest2 {
	 @Test(priority=3)
	  public void product() throws InterruptedException {
		  ProductPage ob=new ProductPage(driver);
		  ob.ProductDetails();
	  }
	}
