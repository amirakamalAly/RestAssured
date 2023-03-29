package apiConfigs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class HeaderConfigs {
	
	private static final String Token = null;





	public HeaderConfigs() {
		
	}
	
	public Map<String, String> defaultHeaders(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		defalutHeaders.put("Content-Type", "application/json");
		defalutHeaders.put("language", "en");
		return defalutHeaders;
		
	}
	
	
	
	
	
	public Map<String, String> headersWithToken(){
		Map<String, String> defalutHeaders = new HashMap<String, String>();
		
		defalutHeaders.put("Content-Type", "application/json");
		defalutHeaders.put("Authorization", "Bearer " + Token);
		defalutHeaders.put("language", "en");
		
		
		return defalutHeaders;
		
	}
	
	

	

	

}
