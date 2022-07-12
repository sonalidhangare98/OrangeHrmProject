package orangehrmliveTestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class PojoClass {
	
	public String baseUrl="https://opensource-demo.orangehrmlive.com/index.php/auth/login";
	public static WebDriver driver;
	
	@BeforeClass
	public void openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\DriversFolder\\chromedriver.exe");
		
		driver=new ChromeDriver();
	}

}
