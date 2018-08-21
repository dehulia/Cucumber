package utility;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import com.jacob.com.LibraryLoader;
import atu.alm.wrapper.ALMServiceWrapper;
import atu.alm.wrapper.enums.StatusAs;
import atu.alm.wrapper.exceptions.ALMServiceException;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	private static WebDriver driver;
	
	@Before("@web")
	public void setUp()
	{
		String current = null;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
			System.out.println("Current dir:"+current);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.setProperty("jacob.dll.path", current + "\\drivers\\jacob-1.19\\jacob-1.19-x86.dll");

		LibraryLoader.loadJacobLibrary();
		
		ALMServiceWrapper wrapper = new ALMServiceWrapper(    "http://srv00230/qcbin");
		try {
			wrapper.connect("invde", "EvaEva2@", "PROJECTS_BHS", "P73977_Noi_Bai_R012");
		} catch (ALMServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
			wrapper.updateResult("TEST", "TestSet1", 15921, "CAT_OPS_CheckIn",
                    StatusAs.FAILED);
			
			/*wrapper.updateResult("Resources\\SampleTestSetFolder", "TestSet1", 92, "Logout",
			                        StatusAs.FAILED);*/
		} catch (ALMServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			wrapper.updateResult("Resources\\SampleTestSetFolder",
			                        "TestSet1", 61, "Logout", StatusAs.PASSED);
		} catch (ALMServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			wrapper.updateResult("SampleTestSetFolder\\SubTestSetFolder1",
			                        "TestSet3", 62, "Login", StatusAs.BLOCKED);
		} catch (ALMServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wrapper.close();
		
		
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
