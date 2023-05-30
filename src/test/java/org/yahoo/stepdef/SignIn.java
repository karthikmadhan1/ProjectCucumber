package org.yahoo.stepdef;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.yahoo.pages.LoginPage;
import org.yahoo.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn extends BaseClass{
	 LoginPage lp ;
	
	@Given("Open the Application")
	public void open_the_application() {
		lauchapp("https://www.facebook.com/");
		lp=new LoginPage(driver);
	}
	
	@When("enter the username and valid password")
	public void enter_the_username_and_valid_password(io.cucumber.datatable.DataTable dataTable) {	
	   List<List<String>> lists = dataTable.asLists();
		sendValue(lp.getUsername(), lists.get(0).get(0));
		sendValue(lp.getPassword(), lists.get(1).get(1));  	
	}
	
	@Then("TakeScreenshot {string}")
	public void take_screenshot(String string) {
		ScreenShot(string);
		System.out.println(10/0);
	}

}
