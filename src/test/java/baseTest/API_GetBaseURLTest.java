package baseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class API_GetBaseURLTest  {

	private FileInputStream inputStream;
	private Properties prop;

	public String GetBaseUrl() throws IOException {

		File propFile = new File("configuration\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
		String URL = prop.getProperty("PathURL");
		return URL;
	}
	
}