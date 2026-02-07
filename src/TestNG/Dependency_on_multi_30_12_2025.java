package TestNG;

import org.testng.annotations.Test;

public class Dependency_on_multi_30_12_2025 {
	@Test (priority = 0)
	public void smoke() {
		//fail();
		System.out.println("Smoke Test Case Executed");
	}
	
	@Test(priority = 1, dependsOnMethods = "smoke")
	public void functional() {
		System.out.println("Functional Test Case Executed");
	}
	
	@Test(priority=2, dependsOnMethods= {"functional","smoke"})
	public void regression() {
		System.out.println("Regression Test Case Executed");
	}
}
