package Cucumber.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * Hello world!
 *
 */
public class App

{
	public static void main(String[] args) {
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("firstname")).click();
		driver.findElement(By.name("firstname")).sendKeys("hi");

	}
}
