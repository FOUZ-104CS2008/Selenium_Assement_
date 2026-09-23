package Day1Assigment.FinalCapgeminiAssesment1.Assesment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class POMBuzz {

	WebDriver driver;
	POMBuzz(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//a[@href='/web/index.php/buzz/viewBuzz']")
	private WebElement click;
	
	
	public void getClick() {
		click.click();
	}
	
	
}
