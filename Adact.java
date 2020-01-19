package org.sample;

public class Adact extends BaseClassCreation {

	public static void main(String[] args) throws InterruptedException {

		BaseClassCreation b=new BaseClassCreation();
		b.getDriver();
		b.loadUrl("https://www.adactin.com/HotelApp/index.php");
		
		LoginPage l=new LoginPage();
		b.setText(l.getUser(), "mohamed123");
		b.setText(l.getPass(), "welcome@123");
		b.btn(l.getLogin());
		
		
		SearchPage sp=new SearchPage();
		
		b.selectByVisibleTextMethod(sp.getLoc(),"Sydney");
		b.selectByIndex(sp.getHotels(), 2);
		b.selectByIndex(sp.getRoomtype(), 4);
		b.selectByIndex(sp.getRoomnos(), 2);
		sp.getDatepickin().clear();
		b.setText(sp.getDatepickin(),"22/01/2020");
		sp.getDatepickout().clear();
	    b.setText(sp.getDatepickout(), "25/01/2020");
		b.selectByVisibleTextMethod(sp.getAdultroom(), "3 - Three");
		b.btn(sp.getSubmit());
		
		
		SelectHotel sh=new SelectHotel();
		sh.btn(sh.getSelectBtn());
		sh.btn(sh.getContinueBtn());
	
		
		
		BookHotel bh=new BookHotel();
		b.setText(bh.getFName(), "mohamed");
		b.setText(bh.getLName(), "sha");
		b.setText(bh.getAdd(), "chennai");
		b.setText(bh.getCc(), "1234567890123456");
		b.selectByValue(bh.getCctype(), "VISA");
		b.selectByVisibleTextMethod(bh.getCcexpmonth(), "March");
		b.selectByVisibleTextMethod(bh.getCcexpyear(), "2022");
		b.setText(bh.getCvv(),"263");
		b.btn(bh.getBtnbook());
		
		
		Thread.sleep(7000);
		
		ConfirmationPage cp=new ConfirmationPage();
		String attribute = cp.getOrdernum().getAttribute("value");
		System.out.println(attribute);
		driver.close();
		
		
	}

}
