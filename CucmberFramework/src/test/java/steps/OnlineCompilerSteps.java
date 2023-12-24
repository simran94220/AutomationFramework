package steps;




import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.OnlineCompilerPageActions;


import utils.SeleniumDriver;
public class OnlineCompilerSteps {

	OnlineCompilerPageActions onlineComplierPageActions = new OnlineCompilerPageActions();
	
	@Given("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
			
		SeleniumDriver.openPage("https://www.jdoodle.com/online-java-compiler");
	}

	@When("^page loaded with default basic JDE$")
	public void page_loaded_with_default_basic_JDE() throws Throwable{
		
		onlineComplierPageActions.confirmHomePage();
		
	}
	

	@Then("^verify default code is displayed$")
	public void verify_default_code_is_displayed() throws Throwable{
	
		onlineComplierPageActions.verifyDefaultCode();
	}

	
	 @When("^user enters (.*)")
	 public void user_enters(String code) throws Throwable{
		 
		 onlineComplierPageActions.userEntersCode(code);
	 }
	   @And("^user clicks on execute button$")
	     public void user_clicks_on_execute_button() throws InterruptedException {
		
		   onlineComplierPageActions.clickOnExecuteButton();
		   Thread.sleep(6000);
	   }
	    @Then("^verify (.*) is displayed rightly$")
	    public void verify_output_is_displayed_rightly(String output) throws InterruptedException {
	    	
	    	onlineComplierPageActions.verifyOutput(output);
	    }
	    @When("^user clicks on Advanced Java IDE$")
	    public void user_clicks_on_Advanced_Java_IDE() throws InterruptedException {
	    	
	    	onlineComplierPageActions.clickonAdvancedJDE();
	    }
	
	  
	    @Then("^confirm all options in top bar$")
	    public void confirm_all_options_in_top_bar() {
	    	onlineComplierPageActions.verifyOptionsInTopBar();
	    
	    	
	    	
	    }
	    
	    @And("^four tabs below Execute button is displayed$")
	    public void four_tabs_below_Execute_button_is_displayed() {
	    	
	    	onlineComplierPageActions.verifyFourTabs();
	    	
	    }
	    
	    @Then("^verify each tab$")
	    public void verify_each_tab() throws InterruptedException {
	    	
	    	onlineComplierPageActions.verifyEachTab();
	    }
	  

}
