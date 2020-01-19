package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BaseClassCreation {
	
	ConfirmationPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement ordernum;

	public WebElement getOrdernum() {
		return ordernum;
	}
	
}
