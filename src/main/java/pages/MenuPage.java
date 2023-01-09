package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class MenuPage extends SeleniumWrappers {

	//public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		//this.driver = driver;
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	//public By myAccountLink = By.linkText("My account");
	@FindBy(linkText = "My account") public WebElement myAccountLink;
	

}
