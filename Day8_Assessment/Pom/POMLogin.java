package PomAssessment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {

	WebDriver driver;
	public LoginPom(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement pass;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	public WebDriver getDriver() {
		return driver;
	}

	public void getUname(String value) {
		uname.sendKeys(value);
	}

	public void getPass(String value) {
		pass.sendKeys(value);
	}

	public void getLogin() {
		login.click();
    }
}
