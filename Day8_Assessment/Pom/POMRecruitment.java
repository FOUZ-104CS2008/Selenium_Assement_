package PomAssessment;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecruitmentPom {

	WebDriver driver;
	public RecruitmentPom(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@href='/web/index.php/recruitment/viewRecruitmentModule']")
	private WebElement Rbutton;
	
	@FindBy(xpath="(//button[@type='button'])[5]")
	private WebElement add;
	public WebDriver getDriver() {
		return driver;
	}

	public void getRbutton() {
		Rbutton.click();
	}

	public void getAdd() {
		add.click();}}
