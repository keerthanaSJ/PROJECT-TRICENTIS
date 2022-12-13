package dws_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_001_Register {
	@Test
	public void register() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("CHETHAN");
		driver.findElement(By.id("LastName")).sendKeys("KUMAR HM");
		driver.findElement(By.xpath("(//input[contains(@name,'Email')]/../input)[2]")).sendKeys("chethu5697@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("99023509666");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("99023509666");
		driver.findElement(By.cssSelector("input[id=register-button]")).click();
		driver.quit();
	}


}
