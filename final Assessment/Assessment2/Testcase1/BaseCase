package Day1Assigment.FinalCapgeminiAssesment1.Assesment2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Day1Assigment.Day8.Pom.POMLogin;

public class BaseClass {
    WebDriver driver = null;
    
    @BeforeSuite
	public void Bs() {
		System.out.println("open Database connectivity ");
	}
	@BeforeTest
	public void Bf() {
		System.out.println("Pre conditions");
	}
   @BeforeClass
   public void Bc() {
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
   }
   
   @BeforeMethod
	public void Bm() throws IOException {
	   
		FileInputStream fil = new FileInputStream("./src/test/java/Day1Assigment/Day12/Login.properties");
		Properties p = new Properties();
		p.load(fil);
		
		 String browser = p.getProperty("browser");
		 String url = p.getProperty("url");
		 String uname = p.getProperty("username");
		 String pass = p.getProperty("password");
		//Pom Login -----------------------------------
		 
		 driver.get(url);
		POMLogin p1 = new POMLogin(driver);
		p1.getUname(uname);
		p1.getPass(pass);
		p1.getLogin();
		
	}
   
   
	@AfterMethod
	public void Am() {
		System.out.println("Logout");
	}
	
   @AfterClass
   public void Ac() {
	   driver.quit();
	   System.out.println("Close the browser");
	   
   }
   
   @AfterTest
	public void At() {
		System.out.println("Post condition");
	}
	@AfterSuite
	public void As() {
		System.out.println("Close database connectivity");
	}
}
