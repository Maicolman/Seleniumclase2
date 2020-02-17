package ejemplosearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchdresstest {
	
	@Test
	public void SearchByDress () {
		System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		String textTypeOfResult = driver.findElement(By.className("lighter")).getText();
		System.out.println(textTypeOfResult);
		Assert.assertEquals(textTypeOfResult, "\"DRESS\"");
		driver.close();
		driver.quit();		
	}
}
