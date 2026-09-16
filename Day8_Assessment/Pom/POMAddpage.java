package PomAssessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddPagePom {

    WebDriver driver;
    WebDriverWait wait;

    public AddPagePom(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


 

    @FindBy(xpath="//input[@name='firstName']")
    private WebElement Fname;



    @FindBy(xpath="//input[@name='middleName']")
    private WebElement Mname;


    @FindBy(xpath="//input[@name='lastName']")
    private WebElement Lname;



    @FindBy(xpath="//label[normalize-space()='Vacancy']/parent::div/following-sibling::div//div[contains(@class,'oxd-select-text')]")
    private WebElement vacy;




    @FindBy(xpath="//label[normalize-space()='Email']/parent::div/following-sibling::div//input")
    private WebElement email;




    @FindBy(xpath="//label[normalize-space()='Contact Number']/parent::div/following-sibling::div//input")
    private WebElement Cno;


    @FindBy(xpath="//input[@type='file']")
    private WebElement Resume1;



    @FindBy(xpath="//label[normalize-space()='Date of Application']/parent::div/following-sibling::div//input")
    private WebElement Date;


    @FindBy(xpath="//button[@type='submit']")
    private WebElement Save;



    public void getFname(String value) {

        wait.until(
                ExpectedConditions.visibilityOf(Fname)
        );

        Fname.clear();
        Fname.sendKeys(value);
    }


    public void getMname(String value) {

        wait.until(
                ExpectedConditions.visibilityOf(Mname)
        );

        Mname.clear();
        Mname.sendKeys(value);
    }


    public void getLname(String value) {

        wait.until(
                ExpectedConditions.visibilityOf(Lname)
        );

        Lname.clear();
        Lname.sendKeys(value);
    }


    public void getVacy(String vacancyName) {

        wait.until(
                ExpectedConditions.elementToBeClickable(vacy)
        ).click();

        WebElement vacancy = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath(
                                "//div[@role='option']//span[normalize-space()='"
                                + vacancyName
                                + "']"
                        )
                )
        );

        vacancy.click();
    }


    public void getEmail(String value) {

        wait.until(
                ExpectedConditions.visibilityOf(email)
        );

        email.clear();
        email.sendKeys(value);
    }



    public void getCno(String value) {

        wait.until(
                ExpectedConditions.visibilityOf(Cno)
        );

        Cno.clear();
        Cno.sendKeys(value);
    }


    public void getResume1(String value) {

        wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//input[@type='file']")
                )
        );

        Resume1.sendKeys(value);
    }



    public void getDate(String value) {

        wait.until(
                ExpectedConditions.visibilityOf(Date)
        );

        Date.click();

        Date.sendKeys(Keys.CONTROL, "a");

        Date.sendKeys(value);

        Date.sendKeys(Keys.TAB);
    }



    public void getSave() {

        wait.until(
                ExpectedConditions.elementToBeClickable(Save)
        ).click();
    }
}
