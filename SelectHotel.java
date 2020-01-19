package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClassCreation {
	
	SelectHotel(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement SelectBtn;
	
	@FindBy(id="continue")
	private WebElement continueBtn;

	public WebElement getSelectBtn() {
		return SelectBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	
	
	

}
