package pages.actions;
import utils.Constants;
import pages.locators.OnlineCompilerPageobj;
import utils.SeleniumDriver;


import static org.junit.Assert.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;



public class OnlineCompilerPageActions extends Constants{

	
	OnlineCompilerPageobj onlineCompilerPageobj=null;
	
	//public static JavascriptExecutor jse=(JavascriptExecutor)SeleniumDriver.getDriver();
   // public static Actions actions =new Actions(SeleniumDriver.getDriver());
   
	public OnlineCompilerPageActions()
	{
		
		this.onlineCompilerPageobj=new OnlineCompilerPageobj();
		PageFactory.initElements(SeleniumDriver.getDriver(), onlineCompilerPageobj);
	}
	public void clickOnIdeCodeEditor()
	{
		//moveToCarsForSaleMenu();
		onlineCompilerPageobj.ideCodeEditor.click();
		
	}
	public void confirmHomePage()
	{
		
		if( onlineCompilerPageobj.ideCodeEditor.isDisplayed()) {
			System.out.println("Page is loaded with basic default JDE.");
		}
		else
		{
			System.out.println("Failed in step : when page loaded with default basic JDE");
		}
	
		
	}
	public void clickOnExecuteButton() throws InterruptedException
	{
		//scroll down to see visibility of element button();
		JavascriptExecutor jse=(JavascriptExecutor)SeleniumDriver.getDriver();
		 jse.executeScript("arguments[0].scrollIntoView();",onlineCompilerPageobj.ExecuteButton);
		 Thread.sleep(600);
		 onlineCompilerPageobj.ExecuteButton.click();
		 Thread.sleep(600);
		
	}

	public void verifyDefaultCode() throws InterruptedException
	{
		Thread.sleep(150);
		String codeDisplayed= onlineCompilerPageobj.ideCodeEditor.getText();
		assertEquals("Default code is not as expected", codeDisplayed,defaultCode);
		
	}
	public void verifyOutput(String output) throws InterruptedException
	{
		//verify output;
		
		String actual=onlineCompilerPageobj.output.getText();
    	
    	assertEquals("Default code is not as expected", output,actual);
		
	}
	public void userEntersCode(String code) {
		
		 
		 onlineCompilerPageobj.code.click();
		 Actions action =new Actions (SeleniumDriver.getDriver());
		 action.keyDown(Keys.CONTROL).sendKeys("a").perform();
		 action.sendKeys(Keys.BACK_SPACE).perform();
		 onlineCompilerPageobj.textArea.sendKeys("#CustomCode");
		 onlineCompilerPageobj.textArea.sendKeys(code);
		
	}
	public void verifyOptionsInTopBar() {
		onlineCompilerPageobj.Products.click();
		onlineCompilerPageobj.OnlineCoding.isDisplayed();
		onlineCompilerPageobj.IntegratedIDEs.isDisplayed();
		onlineCompilerPageobj.TeachAndAssessPlatform.isDisplayed();
		onlineCompilerPageobj.Solutions.click();
		onlineCompilerPageobj.ByIndustry.isDisplayed();
		onlineCompilerPageobj.Education.isDisplayed();
		onlineCompilerPageobj.EduTech.isDisplayed();
		onlineCompilerPageobj.LibraryProviders.isDisplayed();
		onlineCompilerPageobj.UseCases.isDisplayed();
		onlineCompilerPageobj.KansasUniversity.isDisplayed();
		onlineCompilerPageobj.Kodezi.isDisplayed();
		onlineCompilerPageobj.LinkEduGroup.isDisplayed();
		onlineCompilerPageobj.Outlier.isDisplayed();
		onlineCompilerPageobj.Resources.click();
		onlineCompilerPageobj.Learn.isDisplayed();
		onlineCompilerPageobj.Documentation.isDisplayed();
		onlineCompilerPageobj.Tutorials.isDisplayed();
		onlineCompilerPageobj.Blogs.isDisplayed();
		
		onlineCompilerPageobj.Company.isDisplayed();
		onlineCompilerPageobj.AboutJdoodle.isDisplayed();
		onlineCompilerPageobj.ContactUs.isDisplayed();
		onlineCompilerPageobj.Pricing.isDisplayed();
		
	}
	public void verifyFourTabs() {
		onlineCompilerPageobj.output.isDisplayed();
		onlineCompilerPageobj.InputTab.isDisplayed();
		onlineCompilerPageobj.UploadFiles.isDisplayed();
		onlineCompilerPageobj.ExternalLibrary.isDisplayed();
    	
	}
	public void verifyEachTab() throws InterruptedException {
	//	WebElement executeButton=driver.findElement(By.xpath("//button[contains(text(), ' Execute ')]"));
		JavascriptExecutor jse=(JavascriptExecutor)SeleniumDriver.getDriver()  ;
		jse.executeScript("arguments[0].scrollIntoView();",onlineCompilerPageobj.ExecuteButton);
		  Thread.sleep(600);
			onlineCompilerPageobj.InputTab.click();
			onlineCompilerPageobj.UploadFiles.click();
			onlineCompilerPageobj.ExternalLibrary.click();
  
	}
	public void clickonAdvancedJDE() throws InterruptedException {
		onlineCompilerPageobj.advancedJDElink.click();
    	Thread.sleep(200);
    	boolean flag=onlineCompilerPageobj.advancedJDE.isDisplayed();
    	assertEquals("Advanced JDE ideProjectTree is not displayed on clicking link!",true,flag);
   }
}

