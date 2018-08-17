package utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.jacob.com.LibraryLoader;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	private static WebDriver driver;
	
	@Before("@web")
	public void setUp()
	{
		/*System.setProperty("jacob.dll.path", "D:\\jacob-1.17-M2-x86.dll");

		LibraryLoader.loadJacobLibrary();
		
		
		ALMServiceWrapper wrapper = new ALMServiceWrapper(    "http://localhost:8081/qcbin");
		wrapper.connect("admin", "admin", "DEFAULT", "SampleProject");

		wrapper.updateResult("SampleTestSetFolder", "TestSet1", 92, "Logout",
		                        StatusAs.FAILED);

		wrapper.updateResult("SampleTestSetFolder\\SubTestSetFolder1",
		                        "TestSet1", 61, "Logout", StatusAs.PASSED);

		wrapper.updateResult("SampleTestSetFolder\\SubTestSetFolder1",
		                        "TestSet3", 62, "Login", StatusAs.BLOCKED);
		wrapper.close();*/
		
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		//driver= new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
}
