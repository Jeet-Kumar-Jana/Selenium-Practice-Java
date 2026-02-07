package TestNG;

import org.testng.annotations.Test;

public class UseOf_before_after_TestCases_31_12_2025 extends UseOf_before_after_BaseClass_31_12_2025 {
	@Test (priority = 1)
	public void title() {
		System.out.println("Title:- "+driver.getTitle());
	}
	
	@Test (priority = 2)
	public void currentUrl() {
		System.out.println("Current URL:- "+driver.getCurrentUrl());
	}
	
	@Test (priority = 3 )
	public void pageSource() {
		System.out.println("Page Source:- "+driver.getPageSource());
	}
}
