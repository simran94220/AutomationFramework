package utils;




import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

import utils.Constants;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    //initialize webdriver
    private static WebDriver driver;
  //  private static ChromeOptions options = new ChromeOptions();
    //initialize timeouts
  //  private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;


    private  SeleniumDriver(){

       
    
	System.setProperty("webdriver.chrome.driver",driverPath);
		
		ChromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		System.out.println("inside selenium driver constructor");
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
		String window=driver.getWindowHandle();
		System.out.println("Window ->"+window);
	
       
    }

    public static void openPage(String url) {
    	System.out.println(url);
    	System.out.println(driver);
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
       if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver();
      
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }
    public static void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
