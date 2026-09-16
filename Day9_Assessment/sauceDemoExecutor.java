package KeywordDrive;

public class sauceDemoExecutor {
	seucoDemoImplemation s=new seucoDemoImplemation();
	public void executor(String keyword) {
		if (keyword.equals("LAUNCH_BROWSER")) {
            s.launchBrowser();
        }

        else if (keyword.equals("OPEN_URL")) {
            s.openurl();
        }
        else if (keyword.equals("USER_TF")) {
            s.usertf();
        }
        else if (keyword.equals("PASS_TF")) {
            s.passtf();
        }
        else if (keyword.equals("LOGIN_BUTTON")) {
            s.loginButton();
        }
        else if (keyword.equals("CLOSE_BROWSER")) {
            s.closeBrowser();
		
		
		
        }
	}

}
