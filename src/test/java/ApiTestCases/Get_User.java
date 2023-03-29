package ApiTestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.Log;

public class Get_User extends BaseTest {

	private static Response response;

	@Test(priority = 1)
	public static void get_User() {

		test.log(LogStatus.INFO, "My test is starting......");
	
		String userid = null;
		userid = Post_AddUserTest.getUser_ID();
		String GetRequest = APIPath.apiPath.Get_GetUser + userid;
		System.out.println(GetRequest);
		response = RestAssured.given().get(GetRequest);
		System.out.println(response.getBody().asString());

	}

	@Test(priority = 2)
	public void Validate_Response_Code_200_Test() {
		Log.info("Assert on the status code equal 200");
		APIVerification.responseCodeValiddation(response, 200);
	}

	@Test(priority = 3)
	public void Validate_Retrived_FristName_Test() {
		Log.info("validate  firstName value  is equal to the created name.");
		APIVerification.responseKeyValidationFromJsonObject(response, "firstName");
		test.log(LogStatus.INFO, "My test is ended......");

	}

}
