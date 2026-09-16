package Day8_Assessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomAssessment.AddPagePom;
import PomAssessment.CandidatePom;
import PomAssessment.LoginPom;
import PomAssessment.RecruitmentPom;



public class TestCase1 {
      public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
    	//Read the data propertie file
    	FileInputStream fil = new FileInputStream("./src/test/resources/DDT/orgamPom.properties");
		Properties p = new Properties();
		p.load(fil);
		 String browser = p.getProperty("browser");
		 String url = p.getProperty("url");
		 String uname = p.getProperty("username");
		 String pass = p.getProperty("pass");
		 
		FileInputStream xl = new FileInputStream("src/test/resources/DDT/pom.xlsx");
		Workbook wb = WorkbookFactory.create(xl);
		String Fname = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String Mname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String Lname = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String email = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String res = wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
	
		
		
		String cname = wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		
	
		
		 WebDriver driver = null;
		 if(browser.equals("chrome")) {
			 driver =new ChromeDriver();
		 }
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get(url);
		 
		//PomLogin page
		 LoginPom p1 = new LoginPom(driver);
		 p1.getUname(uname);
		 p1.getPass(pass);
		 p1.getLogin();
		 
		//PomRecruitment
		 
		 RecruitmentPom p2 = new RecruitmentPom(driver);
		 p2.getRbutton();
		 p2.getAdd();
		 
		 //POMAddpage
		 
		 AddPagePom p3 = new AddPagePom(driver);
		 p3.getFname(Fname);
		 p3.getMname(Mname);
		 p3.getLname(Lname);
		 p3.getVacy("test");
		 p3.getEmail(email);
		 p3.getCno("9731988327");
		 p3.getResume1(res);		 
		// p3.getDate();
		 Thread.sleep(3000);
		 p3.getSave();
		 Thread.sleep(3000);
		 
		 CandidatePom cp = new CandidatePom(driver);
		    cp.clickCandidates();

	        // Enter candidate name
	        cp.enterCandidateName("Fouziya . B");

	        // Click Search
	        cp.clickSearch();


	        // Verify candidate
	        if (cp.isCandidateDisplayed("Fouziya . B")) {

	            System.out.println("Record Found");

	        } else {

	            System.out.println("Record Not Found");
	        }
	        driver.quit();
	        
	    } 
	}
