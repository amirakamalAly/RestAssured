package apiBuilders;

import java.util.HashMap;
import java.util.Map;

public class PostAPIBuilder {
	
	
	
	public Map<String,String> postLoginRequestBody(String MobileNumber){
		Map<String,String> bodyLogin = new HashMap<String,String>();
		bodyLogin.put("MobileNumber", MobileNumber);
		
			
		return bodyLogin;
		
	}
}
