package Testng_padutham;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"sanity"})
	public void main1()
	{
		System.out.println("main1");
	}
	@Test(groups= {"smoke","sanity"})
	public void main2()
	{
		System.out.println("main2");
	}
	@Test(groups= {"regression"})
	public void main3()
	{
		System.out.println("main3");
	}
	@Test(groups= {"sanity,regression"})
	public void main4()
	{
		System.out.println("main4");
	}
	@Test(groups= {"regression"})
	public void main5()
	{
		System.out.println("main5");
	}

}
