package hcm.tests;

import static util.ReportLogger.log;
import static util.ReportLogger.logFailure;

import java.util.ArrayList;
import java.util.List;
import static common.ExcelUtilities.getCellType;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.testng.annotations.Test;

import common.BaseTest;
import hcm.pageobjects.FuseWelcomePage;
import hcm.pageobjects.LoginPage;
import hcm.pageobjects.TaskListManagerTopPage;
import hcm.pageobjects.WorkforceStructureTasksPage;

import static util.ReportLogger.log;
import static util.ReportLogger.logFailure;

public class ManageDepartmentsTest extends BaseTest{
	@Test
	public void a_test() throws Exception  {
		testReportFormat();
	
	try{
		createDepartment();
	  
	  	}
	
        catch (AssertionError ae)
        {
            //takeScreenshot();
            logFailure(ae.getMessage());

            throw ae;
        }
        catch (Exception e)
        {
            //takeScreenshot();
            logFailure(e.getMessage());

            throw e;
        }
    }

	public void createDepartment() throws Exception{
			
		LoginPage login = new LoginPage(driver);
		takeScreenshot();
		login.enterUserID(5);
		login.enterPassword(6);
		login.clickSignInButton();
		
		FuseWelcomePage welcome = new FuseWelcomePage(driver);
		takeScreenshot();
		welcome.clickNavigator("More...");
		clickNavigationLink("Workforce Structures");
			
		WorkforceStructureTasksPage task = new WorkforceStructureTasksPage(driver);
		takeScreenshot();
		
		task.waitForElementToBeClickable(60, "//li/a[text()='Manage Departments']");
		task.clickTask("Manage Departments");
		Thread.sleep(5000);
		//takeScreenshot();
		
		int inputs = 8;
		boolean isScrollingDown = true;
		
		//Thread.sleep(3000);
		//task.clickSaveandCloseButton();
		//Thread.sleep(10000);
		
		//Verifying if the department has been added.....
		task.clickTask("Manage Departments");
		Thread.sleep(10000);
		//task.enterSearchData("Name", getExcelData(inputs, 10, "text"));
		String searchData = getExcelData(inputs, 10, "text");
		searchData = task.filterDataLocator(searchData);
		String dataSearchPath = task.retryingSearchInput("Name");
		task.jsFindThenClick(dataSearchPath);
		driver.findElement(By.xpath(dataSearchPath)).clear();
		task.enterTextByXpath(dataSearchPath, searchData);
		
		Thread.sleep(3000);
		while(!task.jsGetInputValue(dataSearchPath).contentEquals(searchData)){}
		
		//Test Case Verification process...
		task.clickSearchButton();
		Thread.sleep(2000);
		task.clickSearchButton();
		Thread.sleep(10000);
		takeScreenshot();
		
		task.jsFindThenClick("//a[text()='"+searchData+"']");
		Thread.sleep(7500);
		takeScreenshot();
		
		task.jsScrollIntoView("//h2[contains(text(),'Organization Information EFF: Department Details')]");
		Thread.sleep(2500);
		takeScreenshot();
		
		isScrollingDown = task.jsScrollDown(isScrollingDown);
		takeScreenshot();
		
		//Thread.sleep(3000);
		//task.clickSaveandCloseButton();
		//Thread.sleep(10000);
		
		//Ending message::
				Thread.sleep(5000);
				//takeScreenshot();
				
				System.out.println("Department Creation Completed\n***************\n");
				log("Department Creation Completed");
				
				Thread.sleep(1500);
				//takeScreenshot();
	}
}