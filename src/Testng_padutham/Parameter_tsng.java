package Testng_padutham;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_tsng {
	@Parameters("a")
	@Test
	public void main(String v)
	{
		System.out.println(v);
	}

}
