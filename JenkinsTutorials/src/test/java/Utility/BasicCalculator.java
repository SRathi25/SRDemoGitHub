package Utility;

import org.testng.annotations.Test;

public class BasicCalculator {
	
	@Test
	public void sum()
	{
		int a=5;
		int b=10;
		int sum=a+b;
		System.out.println("a = " + a + "\nb = " + b);
		System.out.println("Sum = " + sum);	
	}		
}
