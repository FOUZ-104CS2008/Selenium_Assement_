package KeywordDrive;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seucoDemoImplemation {
	WebDriver driver;
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	public void openurl()
	{
		driver.get("https://www.saucedemo.com/?utm_source");
	}
	public void usertf()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}
	public void passtf()
	{
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	public void loginButton()
	{
		driver.findElement(By.id("login-button")).click();
	}
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

}
