package test;

import org.testng.annotations.Test;

import pomobject.ProfilePage2;

public class ProfileTest2 extends SupplierTest{
	 @Test(priority=4)
	  public void profile() throws InterruptedException {
		  ProfilePage2 ob=new ProfilePage2(driver);
		  ob.ProfileDetails();
	  }
	}


