package baseTest;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.apache.log4j.xml.DOMConfigurator;
import utils.Log;

import io.restassured.RestAssured;
import utils.ExtentReportListner;

@Listeners(ExtentReportListner.class)
public class BaseTest extends ExtentReportListner{

	@BeforeSuite
	public void baseTest() {
		DOMConfigurator.configure("log4j.xml");


		Log.startTestCase("read base URl from config file ");

	try {
		RestAssured.baseURI = (String) new API_GetBaseURLTest().GetBaseUrl();
		Log.info("value is retrived successfully");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
