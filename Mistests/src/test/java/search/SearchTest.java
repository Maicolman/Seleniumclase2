package search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTest {	
	
	@Test
	public void SearchByTennis () throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Tennis");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(3000);
		String noResults = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/h1/span")).getText();
		Assert.assertEquals(noResults, "\"0 results have been found.\"");
		System.out.println(noResults);
		driver.close();
		driver.quit();
	}
}