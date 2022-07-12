package orangehrmlivePomClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orangehrmliveLoginModule {
	
	WebDriver driver;
	
	By Username=By.id("txtUsername");
	
	By Password=By.id("txtPassword");

	@FindBy(xpath="//input[@id='btnLogin']")
	private WebElement Login;
	
	public orangehrmliveLoginModule(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d,this);
	}
	
	public void setUsername()
	{
		driver.findElement(Username).sendKeys("Admin");
	}
	
	public void setPassword()
	{
		driver.findElement(Password).sendKeys("admin123");
	}
	
	public void clickLoginbtn()
	{
		Login.click();
	}

}
