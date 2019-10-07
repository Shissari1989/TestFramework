package testpackage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry {
	
	
	@Test
	public void testOne()
	{
		String a="Sachin";
		
		String b ="S";
		
		Assert.assertTrue(false, "display the message");
Assert.assertEquals(a, b, "This should fail");
		
		System.out.println("Pass method");
	}

	@Test
	public void testing()
	{
		
		System.out.println("excluding");
	}
	
	@Test(retryAnalyzer=testpackage.testListener.class)
	public void testTwo()
	
	{System.out.println("Fail method");
		Assert.assertTrue(false);
		
		
	}
	@Test
public void testThree()
	
	{
		Assert.assertTrue(true);
		System.out.println("third method");
		
	}
	
}
