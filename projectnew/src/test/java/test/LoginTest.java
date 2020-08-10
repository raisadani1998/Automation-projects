package test;

import org.testng.annotations.Test;

import pomobject.LoginPage;
import utilities.Base;

public class LoginTest extends Base {
	  @Test(priority=0)
	  public void login() throws InterruptedException {
		  LoginPage ob=new LoginPage(driver);
		  ob.LoginDetails();
	  }
	}
 
