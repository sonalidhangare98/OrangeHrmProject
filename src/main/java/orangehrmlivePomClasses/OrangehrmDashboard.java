package orangehrmlivePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangehrmDashboard {
	
	WebDriver driver;
	
	@FindBy(xpath="(//a[@href='/index.php/leave/assignLeave'])[2]")
    private WebElement AssignLeave;
	
	@FindBy(xpath="//input[@id='assignleave_txtEmployee_empName']")
	private WebElement AssignleavePage;
	
	@FindBy(xpath="//select[@id='assignleave_txtLeaveType']")
	private WebElement SelectOption;
	
	@FindBy(xpath="//input[@class=' ui-datepicker-week-end ui-state-fullday']")
	private WebElement SelectDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement SelectMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement SelectYear;
	
	@FindBy(xpath="(//td[@data-handler='selectDay'])[10]")
	private WebElement SelectDay;
	
	public OrangehrmDashboard(WebDriver d1)
	{
		driver=d1;
		
		PageFactory.initElements(d1,this);
	}
	
	public void clickAssignLeave()
	{
		AssignLeave.click();
	}
	
	public void openAssignleavePage()
	{
		AssignleavePage.sendKeys("Sonali vishal gopal");
		
	}
	
	public void SelectOption()
	{
		Select s=new Select(SelectOption);
		
		s.selectByIndex(10);
	}
	public void selectDate()
	{
		SelectDate.click();	
		
	}
	public void SelectMonth()
	{
		Select s=new Select(SelectMonth);
		s.selectByVisibleText("aug");

	}
	
	public void SelectYear()
	{
		Select s=new Select(SelectYear);
		s.selectByValue("1996");
	}
	
	public void SelectDay()
	{
		Select s=new Select(SelectDay);
		s.selectByValue("5");
	}
	
}
