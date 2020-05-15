package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import mobileWrapper.AppSpecificMethods;
import pages.LoginPage;

public class TC002_Login_Emulator extends AppSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName = "TC001_Login";
		testDescription = "Login in LeafOrg app";
		testNodes = "TC002";
		authors = "Gopinath Jayakumar";
		category = "Smoke";
		path = "C:\\Users\\dell\\Desktop\\chromedriver\\chromedriver.exe";
		dataSheetName = "TC002";
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
