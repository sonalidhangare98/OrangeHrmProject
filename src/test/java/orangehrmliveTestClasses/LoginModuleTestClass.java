package orangehrmliveTestClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import orangehrmlivePomClasses.OrangehrmAdminModule;
import orangehrmlivePomClasses.OrangehrmDashboard;
import orangehrmlivePomClasses.PIMPomClass;
import orangehrmlivePomClasses.orangehrmliveLoginModule;

public class LoginModuleTestClass extends PojoClass{
	
	
	@Test
	public void loginHrm() throws InterruptedException 
	{
	   driver.get(baseUrl);
		   
	   Thread.sleep(3000);
	   orangehrmliveLoginModule obj=new orangehrmliveLoginModule(driver);
	
		obj.setUsername();
		obj.setPassword();
		obj.clickLoginbtn();
		
		
		
		/*OrangehrmAdminModule oa=new OrangehrmAdminModule(driver);
		
		oa.clickAdmin();
		oa.Addbtn();
		oa.setUserrole();
		oa.setEmpName();*/
		
		/*PIMPomClass pp=new PIMPomClass(driver);
		
		pp.setPim();
		pp.clickaddEmp();
		pp.setFirstname();
		pp.Middlename();
		pp.Lastname();
		pp.setEmpId();
		pp.setCredentials();
		pp.setUser();
		pp.setPassword();
		pp.setrePassword();
		pp.setStatus();
		pp.clickSavebtn();*/
		
		OrangehrmDashboard od=new OrangehrmDashboard(driver);
		
		od.clickAssignLeave();
		od.openAssignleavePage();
		
		Thread.sleep(3000);
		od.SelectOption();
		
		Thread.sleep(3000);
		od.selectDate();
		
		Thread.sleep(3000);

		od.SelectMonth();
		
		Thread.sleep(3000);

		od.SelectYear();
		
	}
	
	

}
