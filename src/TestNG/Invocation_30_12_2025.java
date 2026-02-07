package TestNG;

import org.testng.annotations.Test;

public class Invocation_30_12_2025 {
	@Test(priority = 0, invocationCount = 2)
	public void smoke() {
		System.out.println("Smoke executed");
	}
	
	@Test(priority = 2, invocationCount = 4)
	public void regression() {
		System.out.println("Regression executed");
	}
	
	@Test(priority = 1, invocationCount = 3)
	public void functional() {
		System.out.println("Functional executed");
	}
	
	
}
