package dws_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002_Login {

	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),\"Log\")]")).click();
		driver.findElement(By.xpath("((//input[contains(@name,'Email')])[2])/../input")).sendKeys("mathura123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("9896543210");
		driver.findElement(By.cssSelector("input[class='button-1 login-button']")).click();
		driver.close();
	}

}
