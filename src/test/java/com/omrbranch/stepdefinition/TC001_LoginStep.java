package com.omrbranch.stepdefinition;

import org.junit.Assert;
import com.omrbranch.manager.PageObjectManager;
import com.omrbranch.utility.BaseClass;

import io.cucumber.java.en.*;

public class TC001_LoginStep extends BaseClass{

	private final PageObjectManager pom=new PageObjectManager();
	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() {
	}
	@When("User enters {string} and {string}")
	public void userEntersAnd(String userName, String password) {
		pom.getLoginPage().login(userName, password);
	}
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expMessage) {
		 String actLoginMsg = pom.getExploreHotelPage().loginMsg();
	  Assert.assertEquals("Verify after login",expMessage, actLoginMsg);
	}

	@When("User enters {string} and {string} with enter key")
	public void userEntersAndWithEnterKey(String userName, String password) {
	}
	
	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String message) {
	}



}