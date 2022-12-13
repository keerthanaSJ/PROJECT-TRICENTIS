package dws_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_003_Search {

		@Test
		public void search() {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("small-searchterms")).sendKeys("COMPUTER");
			driver.findElement(By.xpath("//input[@value='Search']")).click();
			driver.close();
		}
	}

	


