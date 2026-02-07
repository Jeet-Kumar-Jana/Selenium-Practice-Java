package TestNG;

import org.testng.annotations.Test;

public class Enabled_keyword_30_12_2025 {
	
	@Test(priority = 0, enabled = false)
	public void smoke() {
		System.out.println("Smoke executed");
	}
	
	@Test(priority = 2)
	public void regression() {
		System.out.println("Regression executed");
	}
	
	@Test(priority = 1)
	public void functional() {
		System.out.println("Functional executed");
	}
}
