package SpicejetWebAutomation.SpicejetAutomation;

import org.testng.annotations.Test;

public class TestRun {
	
	@Test
	public void home() {
		HomePage home = new HomePage();
		home.openBrowser();
		home.OpenUrl("https://www.spicejet.com/");
		home.waitFor(20);
		home.clickOnElement("//*[@class='myspice_trip']");
		//home.browserHandler();
		home.waitFor(5);
		home.mouseOver("//*[@id='ctl00_HyperLinkLogin']");
		//home.closeBrowser();
		
		//home.typeOnElement("//*[@id=\"ctl00_mainContent_txtOriginStation1_MST]", "value");
		
	}

}
