package testpackage;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Runner {
	
	
	public static void main(String[] args)
	{
		
		
		TestNG tn = new TestNG();
		
		List<String> ls = new ArrayList<String>();
		
		ls.add("C:\\Users\\shissari\\eclipse-workspace\\t-Listener\\test-output\\Default suite\\testng-failed.xml");
		
		tn.setTestSuites(ls);
		tn.run();
		
	}

}
