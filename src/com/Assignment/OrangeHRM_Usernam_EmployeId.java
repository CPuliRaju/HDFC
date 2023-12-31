package com.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHRM_Usernam_EmployeId {

	public static void main(String[] args) throws InterruptedException {
	
		// Navigate to OrangeHRM Application //
		WebDriver driver;
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PULI RAJU\\eclipse-workspace\\eclipse-workspace\\OrangeHRMApplication\\puli\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get(applicationUrlAddress);
		driver.manage().window().maximize();
		
		String expected_TitleofOrangeHRMApplicationLoginPage="OrangeHRM";
		System.out.println("The expected Title of the OrangeHRM Application LogiPage is:-"+expected_TitleofOrangeHRMApplicationLoginPage);
		
		String actual_TitleofOrangeHRMApplicationLoginPage = "driver.getTitle";
		System.out.println("The actual Title of the OrangeHRM Application LogiPage is:-"+actual_TitleofOrangeHRMApplicationLoginPage);
		
		if(actual_TitleofOrangeHRMApplicationLoginPage.equals(expected_TitleofOrangeHRMApplicationLoginPage))
		{
		System.out.println("Its a Login page of OrangeHRM Application - PASS");
		}
		else
		{
		System.out.println("Its Not Login page of OrangeHRM Application - FAIL");
		}
		String expected_CurrentUrlAddressOfOrangeHRMApplicationLoginPage ="Orange HRM-4.2.0.1";
		System.out.println("The expected URl Address of OrangeHRM Applicatoin LoginPage is:-"+expected_CurrentUrlAddressOfOrangeHRMApplicationLoginPage);
		
		String actual_CurrentUrlAddressOfOrangeHRMApplicationLoginPage = driver.getCurrentUrl();
		System.out.println("The actual URl Address of OrangeHRM Applicatoin LoginPage is:-"+actual_CurrentUrlAddressOfOrangeHRMApplicationLoginPage);
		
		if(actual_CurrentUrlAddressOfOrangeHRMApplicationLoginPage.contains(expected_CurrentUrlAddressOfOrangeHRMApplicationLoginPage))
		{
		System.out.println("Its a LoginPage of OrangeHRM Application Url Address Matched PASS");
		}
		else
		{
		System.out.println("Its a LoginPage of OrangeHRM Application Url Address Not Matched FAIL");
		}
		
		driver.findElement(By.id("txtUsername")).sendKeys("PULIRAJU");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Puli996632@");
		
		driver.findElement(By.className("button")).click();
		
		By PimLocator=By.id("menu_pim_viewPimModule");
		WebElement Pim=driver.findElement(PimLocator);
		
		//Thread.sleep(10000);
		
		Actions Action=new Actions(driver);
		Action.moveToElement(Pim).build().perform();
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		By addEmployeeLocator=By.linkText("Add Employee");
		WebElement AddEmployee=driver.findElement(addEmployeeLocator);
		
		AddEmployee.click();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		By firstNameLocator=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameLocator);
		firstName.sendKeys("Chakali");
		String entered_FirstName=firstName.getAttribute("value");
		System.out.println("entered employee id :"+entered_FirstName);
		
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		By middleNameLocator=By.id("middleName");
		WebElement MiddleName=driver.findElement(middleNameLocator);
		MiddleName.sendKeys("Puli");
		String entered_middleName=MiddleName.getAttribute("value");
		System.out.println("entered employee id :"+entered_middleName);
		
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		By LastLocator=By.id("lastName");
		WebElement LastName=driver.findElement(LastLocator);
		LastName.sendKeys("Raju");
		String entered_LastName=LastName.getAttribute("value");
		System.out.println("entered employee id :"+entered_LastName);
		
		//Employee Id
		//<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
		By EmployeeIdlocator=By.id("employeeId");
	    WebElement EmployeeId=driver.findElement(EmployeeIdlocator);
		String Entered_EmployeeId=EmployeeId.getAttribute("value");
		System.out.println("entered emplyee id:"+Entered_EmployeeId);
		
		//Save button
		//<select class="formInputText valid" name="status" id="status">
		//<input type="button" class="" id="btnSave" value="Save">
		By SaveLocator=By.id("btnSave");
		WebElement saveButton = driver.findElement(SaveLocator);		
		saveButton.click();
		
		System.out.println("  ");
        
		//personal Detailse
		//<input value="ijhijhiu" type="text" name="personal[txtEmpFirstName]" 
		//class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled"> 
		By FirstName_persnonalDetailsL=By.id("personal_txtEmpFirstName");
		WebElement FirstNamepersnaldetails=driver.findElement(FirstName_persnonalDetailsL);
		String SavedFirstName=FirstNamepersnaldetails.getAttribute("value");
		System.out.println("saved first name :"+SavedFirstName);
		
		//<input value="" type="text" name="personal[txtEmpMiddleName]" 
		//class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
		By MiddleName_persnonalDetailsL=By.id("personal_txtEmpMiddleName");
		WebElement MiddleNamepersnaldetails=driver.findElement(MiddleName_persnonalDetailsL);
		String SavedMiddleName=MiddleNamepersnaldetails.getAttribute("value");
		System.out.println("saved middle name :"+SavedMiddleName);
		
		//<input value="bhbb" type="text" name="personal[txtEmpLastName]" 
		//class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
		By LastName_persnonalDetailsL=By.id("personal_txtEmpLastName");
		WebElement LastNamepersnaldetails=driver.findElement(LastName_persnonalDetailsL);
		String SavedLastName=LastNamepersnaldetails.getAttribute("value");
		System.out.println("saved last name :"+SavedLastName);
		
		//<input value="0002" type="text" name="personal[txtEmployeeId]" 
		//maxlength="10" class="editable" id="personal_txtEmployeeId" disabled="disabled">
		By Name_persnonalEmpolyeeIdL=By.id("personal_txtEmployeeId");
		WebElement NamepersnalId=driver.findElement(Name_persnonalEmpolyeeIdL);
		String SavedId=NamepersnalId.getAttribute("value");
		System.out.println("saved employee id :"+SavedId);
		
		if(entered_FirstName.equals(SavedFirstName)) {
			System.out.println("Entered first name is equals to saved first name - PASS");
		}
		else {
			System.out.println("Entered first name is NOT equals to saved first name - FAIL");
		}
		
		if(entered_middleName.equals(SavedMiddleName)) {
			System.out.println("Entered middle name is equals to saved middle name - PASS");
		}
		else {
			System.out.println("Entered middle name is NOT equals to saved middle name - FAIL");
		}
		
		if(entered_LastName.equals(SavedLastName)) {
			System.out.println("Entered last name is equals to saved last name - PASS");
		}
		else {
			System.out.println("Entered last name is NOT equals to saved last name - FAIL");
		}
		
		if(Entered_EmployeeId.equals(SavedId)) {
			System.out.println("Entered employee id is equals to saved employee id - PASS");
		}
		else {
			System.out.println("Entered employee id is NOT equals to saved employee id - FAIL");
		}
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		By welcomeL=By.id("welcome");
		WebElement welcome=driver.findElement(welcomeL);
		welcome.click();
		
		Thread.sleep(2000);
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		By LogoutL=By.linkText("Logout");
		WebElement logout=driver.findElement(LogoutL);
		logout.click();		
				
					
	   driver.quit();
	}

}
