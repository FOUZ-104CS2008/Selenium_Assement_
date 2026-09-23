package Day1Assigment.FinalCapgeminiAssesment1.Assesment2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CapgrminiAssessment2 extends BaseClass {
	
	@Test
	public void HRM() {
		//click buzz button
		POMBuzz p2 = new POMBuzz(driver);
		p2.getClick();
		
		//send message
		POMBuzzPage p3 = new POMBuzzPage(driver);
		p3.getTextArea();
		p3.getPost();
		
		Assert.assertEquals(p3.getMsg(), "Hi Rohan");
		System.out.println("Yes Msg found😁😁");
	}

}
