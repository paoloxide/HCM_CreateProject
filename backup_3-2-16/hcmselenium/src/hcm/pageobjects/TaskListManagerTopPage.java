package hcm.pageobjects;

import org.openqa.selenium.WebDriver;
import common.BasePage;
import static common.BaseTest.TestCaseRow;
import static common.ExcelUtilities.getCellData;
import static util.ReportLogger.log;

public class TaskListManagerTopPage extends BasePage{
	
	public TaskListManagerTopPage(WebDriver driver){
		super(driver);
	}
	
	@Override
    public String getPageId()
    {
        return "/setup/faces/TaskListManagerTop";
    }

	public void clickTask(String menu){
		
		clickByXpath("//li/a[contains(text(),'"+ menu +"')]");		
		log("Clicking " + menu +"...");
		System.out.println("Clicking " + menu +"...");

	}
	
	public void enterSearch(int colNum) throws Exception{
		String value = getCellData(TestCaseRow, colNum);
		enterText("pt1:USma:0:MAnt1:1:pt1:r1:0:resultAppPanel:q1:value00::content", value); //
		log("Entered in the Search box...");
		System.out.println("Entered in the Search box...");
	}
	
	public void clickSearchButton(){
		
		clickByXpath("//button[text()='Search']");		
		log("Clicking Search button...");
		System.out.println("Clicking Search button...");

	}
	
	public void clickNextButton(){
		
		clickByXpath("//button[text()='Ne']");		
		log("Clicking Search button...");
		System.out.println("Clicking Search button...");

	}
	
	public void clickExpandFolder(int colNum) throws Exception{
		
		String folder = getCellData(TestCaseRow, colNum);
		clickByXpath("//tbody/tr/td/div[contains(text(),'"+folder+"')]/span/a");
		Thread.sleep(3000);
		log("Clicking expand...");
		System.out.println("Clicking expand...");
	}
	
	public void clickTaskCheckbox(int colNum) throws Exception{
		
		String folder = getCellData(TestCaseRow, colNum);
		clickByXpath("//tbody/tr/td/div[contains(text(),'"+folder+"')]/../../td/span/span/span/input");
		log("Selecting "+folder+" task...");
		System.out.println("Selecting "+folder+" task...");
	}
	
	public void clickExpandWorkForceDevelopment(){
		
		click("pt1:USma:0:MAnt1:1:pt1:r1:1:topAppPanel:applicationsTable1:_ATTp:table1:2::di");
		log("Clicking expand...");
		System.out.println("Clicking expand...");
	}
	
	public void clickDoneButton() throws InterruptedException{
		
		clickByXpath("//button[text()='D']");
		log("Clicked Done button...");
		System.out.println("Clicked Done button...");
		Thread.sleep(2000);
	}
	
	public void clickSaveAndOpenProjectButton() throws InterruptedException{
		
		clickByXpath("//span[text()='Save and Open Project']");
		log("Clicked Save and Open Project button...");
		System.out.println("Clicked Save and Open Project button...");
		Thread.sleep(2000);
	}
	
	public void enterSearchName(int colNum) throws Exception{
		String value = getCellData(TestCaseRow, colNum);
		enterText("pt1:USma:0:MAnt1:0:AP2:r3:0:qryId1:value10::content", value); //
		log("Entered value in the Name...");
		System.out.println("Entered value in the Name...");
	}
	
	public void clickGoToTaskIcon(){
		
		clickByXpath("//td/a/img[contains(@src,'gototask')]");
		log("Clicked Go to Task icon...");
		System.out.println("Clicked Go to Task icon...");
		
	}
	
	public void clickCreateIcon(){
		
		clickByXpath("//div/a/img[contains(@src,'new_ena')]");
		log("Clicked Create icon...");
		System.out.println("Clicked Create icon...");
	}

	public void enterRole(int colNum) throws Exception{
		String value = getCellData(TestCaseRow, colNum);
		enterText("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:1:AP1:inputText1::content", value); //
		log("Entered value in the Role...");
		System.out.println("Entered value in the Role...");
	}
	
	public void enterDescription(int colNum) throws Exception{
		String value = getCellData(TestCaseRow, colNum);
		enterText("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:1:AP1:inputText2::content", value); //
		log("Entered value in the Description...");
		System.out.println("Entered value in the Description...");
	}
	
	public void enterFromDate(String date) throws Exception{
		enterText("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:1:AP1:inputDate1::content", date); //
		log("Entered value in the From Date...");
		System.out.println("Entered value in the From Date...");
	}
	
	public void enterToDate(String date) throws Exception{
		enterText("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:1:AP1:inputDate2::content", date); //
		log("Entered value in the To Date...");
		System.out.println("Entered value in the To Date...");
	}
	
	public void selectStatus(int colNum) throws Exception{
		String value = getCellData(TestCaseRow, colNum);
		selectDropdownByVisibleText("pt1:USma:0:MAnt2:1:r2:0:dynamicRegion1:1:AP1:soc2::content", value); //
		log("Selected value in Status...");
		System.out.println("Selected value in Status...");
	}

	public void clickSaveAndCloseButto() throws InterruptedException{
		
		clickByXpath("//button/span[text()='S']");
		Thread.sleep(5000);
		log("Clicked Save and Close button...");
		System.out.println("Clicked Save and Close button...");
		
	}
	
	public void clickOkButton() throws InterruptedException{
		
		clickByXpath("//button[text()='OK']");
		Thread.sleep(5000);
		log("Clicked OK button...");
		System.out.println("Clicked OK button...");
		
	}
	
	

}
