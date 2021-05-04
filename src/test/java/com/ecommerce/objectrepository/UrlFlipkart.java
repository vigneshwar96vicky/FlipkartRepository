package com.ecommerce.objectrepository;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecommerce.resources.CommonActions;

public class UrlFlipkart extends CommonActions {
	
	public UrlFlipkart(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement clLog;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement seacrhBar;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchClk;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	private WebElement mobileD;
	
	
	@FindAll(@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']"))
	private WebElement priceP;
	
	@FindBy(xpath="//div[text()='Redmi 8A Dual (Sky White, 32 GB)']")
	private WebElement lowMobile;
	
	public WebElement getLowMobile() {
		return lowMobile;
	}

	public WebElement getPriceP() {
		return priceP;
	}

	public WebElement getMobileD() {
		return mobileD;
	}

	public WebElement getClLog() {
		return clLog;
	}

	public WebElement getSeacrhBar() {
		return seacrhBar;
	}

	public WebElement getSearchClk() {
		return searchClk;
	}
	
}
