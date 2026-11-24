package Testng_padutham;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemopgm {
	@BeforeTest
	public void setup()
	{
		System.out.println("setup");
	}
	@BeforeMethod
	public void method()
	{
		System.out.println("url open");
	}
	@Test(priority=3,invocationCount=2)
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(priority=2,dependsOnMethods= {"test2"})
	public void test3()
	{
		System.out.println("Test3");
	}
	@AfterMethod
	public void after()
	{
		System.out.println("report");
	}
	@AfterTest
	public void close()
	{
		System.out.println("browser close");
	}
}
