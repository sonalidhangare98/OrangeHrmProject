package orangehrmlivePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangehrmAdminModule {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/index.php/admin/viewAdminModule']")
	private WebElement Admin;
	
	@FindBy(xpath="//input[@id='btnAdd']")
	private WebElement Addbtn;
	
	@FindBy(xpath="//select[@id='systemUser_userType']")
	private WebElement Userrole;
	
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	private WebElement EmpName;
	
	
	public OrangehrmAdminModule(WebDriver d2)
	{
		driver=d2;
		
		PageFactory.initElements(d2,this);
	}
	
	public void clickAdmin()
	{
		Admin.click();
	}
	
	public void Addbtn()
	{
		Addbtn.click();
	}
	
	public void setUserrole()
	{
	  Select s=new Select(Userrole);
	  
	  s.selectByIndex(1);
	}
	
	public void setEmpName()
	{
		EmpName.sendKeys("Sonali Gopal");
	}
	

}
