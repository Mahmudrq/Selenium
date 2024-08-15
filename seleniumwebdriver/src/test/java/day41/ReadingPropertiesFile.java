package day41;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {

		// Location of file
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\config.properties");

		// Loading Properties file
		Properties propertiesobj = new Properties();

		propertiesobj.load(file);

		// Reading the File
		String url = propertiesobj.getProperty("appurl");
		String email = propertiesobj.getProperty("email");
		String password = propertiesobj.getProperty("password");
		String orid = propertiesobj.getProperty("orderid");
		String cusid = propertiesobj.getProperty("customerid");
		System.out.println(url + " " + email + " " + password + " " + orid + " " + cusid);

		// Reading all the keys from file

		// Set<String>keys=propertiesobj.stringPropertyNames();
		// System.out.println(keys);

		Set<Object> keys = propertiesobj.keySet();
		System.out.println(keys);

		// Reading all the values from file

		Collection<Object> values = propertiesobj.values();
		System.out.println(values);
		file.close();

	}

}
