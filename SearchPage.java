package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BaseClassCreation{
	
	SearchPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement loc;
	
	@FindBy(id="hotels")
	private WebElement hotels;

	@FindBy(id="room_type")
	private WebElement roomtype;

	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	
	@FindBy(id="adult_room")
	private WebElement adultroom;
	
	@FindBy(id="child_room")
	private WebElement childroom;

	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}


	
	
}
