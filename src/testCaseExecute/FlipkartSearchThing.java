package testCaseExecute;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// fetch first 5 search results text on flipkart  [ //a[contains(@class,'atJtCj')] ]

public class FlipkartSearchThing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many result you want to see among 40 ? :- ");
		int n = sc.nextInt();
		
		
		
		if(n>0 && n<=40 ) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shirt");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
			
			List<WebElement> results = driver.findElements(By.xpath("//a[contains(@class,'atJtCj')]"));
			
			int i=0;
			for(WebElement result : results) {
				if(i<n) {
					System.out.println(i+1+" : "+result.getText());
				}
				i++;
				
			}
			
			driver.quit();
		}
		else {
			System.out.println("You want to see more than 40 results or less than 1, which is not correct");
		}
		
		
		
	}

}
