package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks extends BaseTest {
	
	@Before
	public void beforeScenario() {
		setUp();		
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			byte[] ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(ss , "./ss/img.png" , "ss");
		}		
		tearDown();		
	}
}
