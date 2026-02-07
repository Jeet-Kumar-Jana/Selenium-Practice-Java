package dropdown;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/DropDown.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.name("Food Menu"));
		Select s = new Select(ele);
		
		// Checking that whether the dropdown is Single / Multi Select DropDown
		if(!s.isMultiple()) {
			System.out.println("It is single select dropdown");
			driver.quit();
			return;
		}
		
		// To get the index, which are user want to select
		ArrayList<Integer>  indexes = new ArrayList<Integer>();
		char ch;
		int index;
		
		indexes.add(0);
		indexes.add(2);
		indexes.add(4);
		
//		do {
//			System.out.println("Enter index:- ");
//			index = sc.nextInt();
//			indexes.add(index);
//			System.out.println("Do you want to add more index ? Y/N");
//			ch = sc.next().charAt(0);
//			
//		}while(ch == 'Y' || ch == 'y');
		
		// To select Those taken indexes 
		for(int i : indexes) {
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		Thread.sleep(3000);
		
		
//		for(int i : indexes) {
//			s.deselectByIndex(i);
//			Thread.sleep(1000);
//		}
//		
		s.deSelectByContainsVisibleText("Bir");
		

		// To print those selected options
		List<WebElement> options = s.getAllSelectedOptions();
		for(WebElement i : options) {
			System.out.println(i.getText());
		}
//		Thread.sleep(50000);
//		driver.quit();
	}

}
