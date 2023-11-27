package Academy;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BrowserTest {

	
	@Test
	public void getData() throws InterruptedException
	{
		WebDriver driver= new FirefoxDriver();
		// TODO Auto-generated method stub
		driver.get("https://dotnetwebapp2.azurewebsites.net/");
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.xpath("//h1"));
		String Actual=text.getText();
		System.out.println(Actual);
		Thread.sleep(2000);
		String Expected="Welcome hari";
		Assert.assertEquals(Expected, Actual);
		System.out.println("Test Passed");
		Thread.sleep(1000);
		driver.close();
	
		
		
	}
}
