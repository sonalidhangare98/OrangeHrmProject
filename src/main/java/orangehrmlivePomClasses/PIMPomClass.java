package orangehrmlivePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PIMPomClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/index.php/pim/viewPimModule']")
	private WebElement Pim;
	
	@FindBy(xpath="//a[@href='/index.php/pim/addEmployee']")
	private WebElement addEmp;
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement Firstname;
	
	@FindBy(xpath="//input[@id='middleName']")
	private WebElement Middlename;
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement Lastname;
	
	@FindBy(xpath="//input[@id='employeeId']")
	private WebElement EmpId;
	
	@FindBy(xpath="//input[@id='chkLogin']")
	private WebElement Credentials;
	
	@FindBy(xpath="//input[@id='user_name']")
	private WebElement setUser;
	
	@FindBy(xpath="//input[@id='user_password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@name='re_password']")
	private WebElement rePassword;
	
	@FindBy(xpath="//select[@id='status']")
	private WebElement Status;
	
	@FindBy(xpath="//input[@id='btnSave']")
	private WebElement Save;
	
	public PIMPomClass(WebDriver d3)
	{
		driver=d3;
		PageFactory.initElements(d3,this);
	}
	
	public void setPim()
	{
		Pim.click();
	}
	
	public void clickaddEmp()
	{
		addEmp.click();
	}
	public void setFirstname()
	{
		Firstname.sendKeys("Sonali");
	}
	
	public void Middlename()
	{
		Middlename.sendKeys("Vishal");
	}
	
	public void Lastname()
	{
		Lastname.sendKeys("Gopal");
	}
	
	public void setEmpId()
	{
		EmpId.sendKeys("0399");
	}
	
	public void setCredentials()
	{
		Credentials.click();
	}
	
	public void setUser()
	{
		setUser.sendKeys("dhangaresonali");
	}
	
	public void setPassword()
	{
		Password.sendKeys("sonali123");
	}
	
	public void setrePassword()
	{
		rePassword.sendKeys("sonali123");
	}
	
	public void setStatus()
	{
		Select s=new Select(Status);
		s.selectByIndex(0);
		
	}
	
	public void clickSavebtn()
	{
		Save.click();
	}
	
	
	
}
