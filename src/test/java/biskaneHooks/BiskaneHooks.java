package biskaneHooks;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.biskane.utils.TestBase;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BiskaneHooks extends TestBase{
	@SuppressWarnings("static-access")
	@Before
	public void setUp() {
		
		TestBase tb = new TestBase();
		tb.initialization();

	
	}
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@AfterStep
	public void AddScreenShot(Scenario scenario) throws IOException
	{
		
		if(scenario.isFailed())
		{
			File sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] filecontent = FileUtils.readFileToByteArray(sourcePath);	
		scenario.attach(filecontent, "image/png", "image");
		}
	}
}
