package pages.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//define locators on page https://www.jdoodle.com/code-online-compiler-ide  and methods on that page
public class OnlineCompilerPageobj {

	
	  @FindBy(how=How.XPATH,using=".//*[@id='ideCodeEditor']") 
	    public WebElement ideCodeEditor;

	  	  @FindBy(how=How.XPATH,using=".//*[@id='ideProjectTree']") 
	    public WebElement advancedJDE;
	  
	  	
	  	
	  	@FindBy(how=How.LINK_TEXT,using="Advanced Java IDE") 
	    public WebElement advancedJDElink;
	  	
	  @FindBy(how=How.XPATH,using=".//button[contains(text(), ' Execute ')]") 
	    public WebElement ExecuteButton;
	  
	  @FindBy(how=How.XPATH,using=".//*[@id='output']") 
	    public WebElement output;
	  
	  @FindBy(how=How.XPATH,using=".//*[@id='code']") 
	    public WebElement code;
	  
	  @FindBy(how=How.XPATH,using=".//div[@id='code']/textarea") 
	    public WebElement textArea;
	  
	  
	  @FindBy(how=How.XPATH,using="//button[text()=' Products ']") 
	    public WebElement Products;

	  @FindBy(how=How.XPATH,using=".//a[text()='Online Coding']") 
	    public WebElement OnlineCoding;
	  
	  @FindBy(how=How.XPATH,using=".//a[text()='Integrate IDEs']") 
	    public WebElement IntegratedIDEs;
	  
	  @FindBy(how=How.XPATH,using=".//h3[text()='Teach & Assess Platform']") 
	    public WebElement TeachAndAssessPlatform;
	  
	  @FindBy(how=How.XPATH,using=".//button[text()=' Solutions ']") 
	    public WebElement Solutions;
	  
	  @FindBy(how=How.XPATH,using=".//h3[text()='By Industry']']") 
	    public WebElement ByIndustry;

	  @FindBy(how=How.XPATH,using=".//a[text()='Education']") 
	    public WebElement Education;
	  
	  @FindBy(how=How.XPATH,using=".//a[text()='Edu Tech']") 
	    public WebElement EduTech;
	  
	  @FindBy(how=How.XPATH,using=".//a[text()='Library Providers']") 
	    public WebElement LibraryProviders;
	  
	  @FindBy(how=How.XPATH,using=".//h3[text()='Use Cases']") 
	    public WebElement UseCases;
	
	  
	  @FindBy(how=How.XPATH,using=".//a[text()='Kansas University']") 
	    public WebElement KansasUniversity;

	  @FindBy(how=How.XPATH,using=".//a[text()='iText']") 
	    public WebElement iText;
	  
	  @FindBy(how=How.XPATH,using=".//a[text()='Kodezi']") 
	    public WebElement Kodezi;
	  
	  @FindBy(how=How.XPATH,using=".//a[text()='Link Edu Group']") 
	    public WebElement LinkEduGroup;
	  
	  @FindBy(how=How.XPATH,using=".//a[text()='Outlier']") 
	    public WebElement Outlier;
	  
	
	  @FindBy(how=How.XPATH,using=".//button[text()=' Resources ']")
	  public WebElement Resources;
	  @FindBy(how=How.XPATH,using=".//h3[text()='Learn']")
	  public WebElement Learn;
	  @FindBy(how=How.XPATH,using=".//a[text()='Documentation']")
	  public WebElement Documentation;
	  @FindBy(how=How.XPATH,using=".//a[text()='Tutorials']")
	  public WebElement Tutorials;
	  @FindBy(how=How.XPATH,using=".//a[text()='Blogs']")
	  public WebElement Blogs;
    	
	  @FindBy(how=How.XPATH,using=".//h3[text()='Company']")
	  public WebElement Company;
	  @FindBy(how=How.XPATH,using=".//a[text()='About JDoodle']")
	  public WebElement AboutJdoodle;
	  @FindBy(how=How.XPATH,using=".//a[text()='Contact Us']")
	  public WebElement ContactUs;
    	
	  @FindBy(how=How.XPATH,using=".//a[text()='Pricing']")
	  public WebElement Pricing;
	  
	  @FindBy(how=How.XPATH,using=".//button[text()=' Input ']")
	  public WebElement InputTab;
	  @FindBy(how=How.XPATH,using=".//button[text()=' Upload Files ']")
	  public WebElement UploadFiles;
	  @FindBy(how=How.XPATH,using=".//button[text()=' External Libraries ']")
	  public WebElement ExternalLibrary;
	
	  
	  
	

}
