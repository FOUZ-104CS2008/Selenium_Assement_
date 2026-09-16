package PomAssessment;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CandidatePom {

    WebDriver driver;
    WebDriverWait wait;

    public CandidatePom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // =========================================================
    // CANDIDATES LINK
    // =========================================================

    @FindBy(xpath="//a[normalize-space()='Candidates']")
    private WebElement candidatesButton;


    // =========================================================
    // JOB TITLE
    // =========================================================

    @FindBy(xpath="(//div[contains(@class,'oxd-select-text')])[1]")
    private WebElement jobTitleDropdown;


    // =========================================================
    // VACANCY
    // =========================================================

    @FindBy(xpath="(//div[contains(@class,'oxd-select-text')])[2]")
    private WebElement vacancyDropdown;


    // =========================================================
    // HIRING MANAGER
    // =========================================================

    @FindBy(xpath="(//div[contains(@class,'oxd-select-text')])[3]")
    private WebElement hiringManagerDropdown;


    // =========================================================
    // STATUS
    // =========================================================

    @FindBy(xpath="(//div[contains(@class,'oxd-select-text')])[4]")
    private WebElement statusDropdown;


    // =========================================================
    // CANDIDATE NAME
    // =========================================================

    @FindBy(xpath="//input[@placeholder='Type for hints...']")
    private WebElement candidateName;



    @FindBy(xpath="//input[@placeholder='Enter comma separated words...']")
    private WebElement keywords;


    @FindBy(xpath="//input[@placeholder='From']")
    private WebElement fromDate;



    @FindBy(xpath="//input[@placeholder='To']")
    private WebElement toDate;



    @FindBy(xpath="//button[normalize-space()='Search']")
    private WebElement searchButton;



    @FindBy(xpath="//button[normalize-space()='Reset']")
    private WebElement resetButton;



    @FindBy(xpath="//p[normalize-space()='No Records Found']")
    private WebElement noRecordsFound;



    @FindBy(xpath="//div[contains(@class,'oxd-table-body')]")
    private WebElement candidateTable;


  

    public WebDriver getDriver() {
        return driver;
    }



    public void clickCandidates() {

        wait.until(
            ExpectedConditions.elementToBeClickable(candidatesButton)
        ).click();
    }




    public void selectJobTitle(String jobTitle) {

        wait.until(
            ExpectedConditions.elementToBeClickable(jobTitleDropdown)
        ).click();

        WebElement option = wait.until(
            ExpectedConditions.elementToBeClickable(
                org.openqa.selenium.By.xpath(
                    "//div[@role='option']//span[normalize-space()='"
                    + jobTitle + "']"
                )
            )
        );

        option.click();
    }




    public void selectVacancy(String vacancy) {

        wait.until(
            ExpectedConditions.elementToBeClickable(vacancyDropdown)
        ).click();

        WebElement option = wait.until(
            ExpectedConditions.elementToBeClickable(
                org.openqa.selenium.By.xpath(
                    "//div[@role='option']//span[normalize-space()='"
                    + vacancy + "']"
                )
            )
        );

        option.click();
    }


    // =========================================================
    // HIRING MANAGER
    // =========================================================

    public void selectHiringManager(String manager)
            throws InterruptedException {

        wait.until(
            ExpectedConditions.elementToBeClickable(hiringManagerDropdown)
        ).click();

        Thread.sleep(500);

        WebElement option = wait.until(
            ExpectedConditions.elementToBeClickable(
                org.openqa.selenium.By.xpath(
                    "//div[@role='option']//span[normalize-space()='"
                    + manager + "']"
                )
            )
        );

        option.click();
    }


    

    public void selectStatus(String status) {

        wait.until(
            ExpectedConditions.elementToBeClickable(statusDropdown)
        ).click();

        WebElement option = wait.until(
            ExpectedConditions.elementToBeClickable(
                org.openqa.selenium.By.xpath(
                    "//div[@role='option']//span[normalize-space()='"
                    + status + "']"
                )
            )
        );

        option.click();
    }


  
    public void enterCandidateName(String name)
            throws InterruptedException {

        wait.until(
            ExpectedConditions.visibilityOf(candidateName)
        );

        candidateName.click();

        candidateName.sendKeys(Keys.CONTROL, "a");
        candidateName.sendKeys(name);

        Thread.sleep(1500);

        candidateName.sendKeys(Keys.ARROW_DOWN);
        candidateName.sendKeys(Keys.ENTER);
    }


  
    public void enterKeywords(String value) {

        wait.until(
            ExpectedConditions.visibilityOf(keywords)
        );

        keywords.sendKeys(value);
    }



    public void enterFromDate(String date) {

        wait.until(
            ExpectedConditions.visibilityOf(fromDate)
        );

        fromDate.click();

        fromDate.sendKeys(Keys.CONTROL, "a");
        fromDate.sendKeys(date);

        fromDate.sendKeys(Keys.ENTER);
    }



    public void enterToDate(String date) {

        wait.until(
            ExpectedConditions.visibilityOf(toDate)
        );

        toDate.click();

        toDate.sendKeys(Keys.CONTROL, "a");
        toDate.sendKeys(date);

        toDate.sendKeys(Keys.ENTER);
    }


    // =========================================================
    // SEARCH
    // =========================================================

    public void clickSearch() {

        wait.until(
            ExpectedConditions.elementToBeClickable(searchButton)
        ).click();
    }


    

    public void clickReset() {

        wait.until(
            ExpectedConditions.elementToBeClickable(resetButton)
        ).click();
    }


    public boolean isNoRecordsDisplayed() {

        try {

            return wait.until(
                ExpectedConditions.visibilityOf(noRecordsFound)
            ).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }



    public boolean isCandidateTableDisplayed() {

        try {

            return wait.until(
                ExpectedConditions.visibilityOf(candidateTable)
            ).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }


    public boolean isCandidateDisplayed(String name) {

        try {

            WebElement candidate = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                    org.openqa.selenium.By.xpath(
                        "//div[contains(@class,'oxd-table-body')]"
                        + "//div[contains(@class,'oxd-table-cell')]"
                        + "//div[normalize-space()='"
                        + name + "']"
                    )
                )
            );

            return candidate.isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }



    public String getNoRecordText() {

        try {

            return noRecordsFound.getText();

        } catch (Exception e) {

            return "";
        }
    }
}
