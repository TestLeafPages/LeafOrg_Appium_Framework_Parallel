package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mobileWrapper.AppSpecificMethods;
import pages.LoginPage;


public class TC001_Login_Real_Device extends AppSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_Login";
		testDescription = "Login in LeafOrg app";
		testNodes = "TC001";
		authors = "Gopinath Jayakumar";
		category = "Smoke";
		
		dataSheetName = "TC001";
	}
	
	
	@Test(dataProvider = "fetchData")
	public void login(String email, String pwd) {
		new LoginPage(driver, test)
		.enterEmailAddress(email)
		.enterPassword(pwd)
		.clickLogin()
		.fetchParName();
	}
	

}
