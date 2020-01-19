package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClassCreation {
	
	BookHotel(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement FName;

	@FindBy(id="last_name")
	private WebElement LName;
	
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	

	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccexpmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccexpyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;

	@FindBy(id="book_now")
	private WebElement btnbook;

	public WebElement getFName() {
		return FName;
	}

	public WebElement getLName() {
		return LName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCc() {
		return cc;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcexpmonth() {
		return ccexpmonth;
	}

	public WebElement getCcexpyear() {
		return ccexpyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBtnbook() {
		return btnbook;
	}
	
	
	
	
	
	
	
	

}
