package mobileWrapper;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.DataInputProvider;



public class AppSpecificMethods extends MobileWrapper{

	public String dataSheetName;

	@BeforeSuite
	public void bs() {
		startResult();
	}

	@BeforeClass
	public void bc() {
		startTestModule(testCaseName, testDescription);
	}

	@Parameters({"appPackage", "appActivity", "deviceName", "udid", "sys_port"})
	@BeforeMethod
	public void bm(String appPackage, String appActivity, String deviceName, 
			String udid, String sys_port) {
		startTestCase(testNodes);
		launchApp(appPackage, appActivity, deviceName, udid, sys_port);
		switchWebview();
	}

	@AfterMethod
	public void am() {
		closeApp();
	}

	@AfterSuite
	public void as() {
		endResult();
	}

	@DataProvider(name = "fetchData")
	public Object[][] getData() {
		return DataInputProvider.getSheet(dataSheetName);
	}

}
