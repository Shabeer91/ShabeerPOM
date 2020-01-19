package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClassCreation {
	
	public static WebDriver driver;
	
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Shabeer Works\\SHABEER\\ShabeerSelenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public void loadUrl (String url) {
		driver.get(url);
	}
	
	public void windowMax() {
		driver.manage().window().maximize();
	}
	
	public void setText (WebElement element, String value) {
		element.sendKeys(value);
	}
	

	
	public void btn (WebElement element) {
		element.click();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void getText(WebElement e) {
		e.getText();
	}
	public void getTitle() {
		driver.getTitle();
	}
	
	public void getCurrentUrlMethod() {
		driver.getCurrentUrl();
	}
	
	public void dragAndDropMethod (WebElement source, WebElement destination) {
		Actions a = new Actions (driver);
		a.dragAndDrop(source, destination).perform();
	}
	
	public void mouseHoverMethod (WebElement mousehover) {
		Actions a = new Actions (driver);
		a.moveToElement(mousehover).perform();
	}
	
	public void doubleClickMethod (WebElement doubleClick) {
		Actions a = new Actions (driver);
		a.doubleClick(doubleClick).perform();
	}
	
	public void contextClickMethod (WebElement rightClick) {
		Actions a = new Actions (driver);
		a.contextClick(rightClick).perform();
	}
	
	public void selectByVisibleTextMethod (WebElement element, String value) {
		Select s = new Select (element);
		s.selectByVisibleText(value);
	}
	
	public void selectByIndex (WebElement element, int value) {
		Select s = new Select (element);
		s.selectByIndex(value);
	}
	
	public void selectByValue (WebElement element, String value) {
		Select s = new Select (element);
		s.selectByValue(value);
	}
	
	public void deSelectByVisibleMethod (WebElement element, String value) {
		Select s = new Select (element);
		s.deselectByVisibleText(value);
	}
	
	public void deSelectValueMethod (WebElement element, String value) {
		Select s = new Select (element);
		s.deselectByValue(value);
	}
	
	public void deSelectIndexMethod (WebElement element, int value) {
		Select s = new Select (element);
		s.deselectByIndex(value);
	}
	
	
	public void switchFramename (String name) {
		driver.switchTo().frame(name);
	}
	
	public void switchFrameid (String id) {
		driver.switchTo().frame(id);
	}
	
	public void switchFramenum (int number) {
		driver.switchTo().frame(number);
	}
	
	public void switchFrameElement (WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void switchToParent () {
		driver.switchTo().defaultContent();
	}
	
	public void windowHandUrl (String url) {
		driver.switchTo().window(url);
	}
	
	public void windowHandTitle (String title) {
		driver.switchTo().window(title);
	}
	
	public void windowHandId (String id) {
		driver.switchTo().window(id);
	}

	public void navigateTo (String value) {
		driver.navigate().to(value);
	}
	
	public void navigateBack () {
		driver.navigate().back();
	}
	
	public void navigateForward () {
		driver.navigate().forward();
	}
	
	public void navigateRefresh () {
		driver.navigate().refresh();
	}

	
}

