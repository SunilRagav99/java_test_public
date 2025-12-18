package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.utility.BaseClass;

public class ExploreHotelPage extends BaseClass {

	public ExploreHotelPage() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement loginMsg;
	
	public WebElement getLoginMsg() {
		return loginMsg;
	}
	
	public String loginMsg() {
      String textLoginMsg = getElementText(getLoginMsg());
	  return textLoginMsg;
      
	}
	
}