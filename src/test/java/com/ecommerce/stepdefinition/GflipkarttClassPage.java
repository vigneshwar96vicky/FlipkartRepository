package com.ecommerce.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ecommerce.objectrepository.UrlFlipkart;
import com.ecommerce.resources.CommonActions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GflipkarttClassPage extends UrlFlipkart{
	UrlFlipkart q = new UrlFlipkart();
	CommonActions p = new CommonActions();
	List<String> model1 = new LinkedList<String>();
	List<String> model2 = new LinkedList<String>();
	String RedmiLowMod = "";
	@When("User gets Price from excel")
	public void user_gets_Price_from_excel() throws IOException {
	   excelRead(model1,model2);
	}

	@When("User evaluate for low price")
	public void user_evaluate_for_low_price() throws IOException {
		String lowPrice = lowestPrice(model2);
		RedmiLowMod = mobileModel(lowPrice);
		
	}

	@When("User click on low price mobile")
	public void user_click_on_low_price_mobile() throws InterruptedException {
	   insertText(q.getSeacrhBar(),RedmiLowMod);
	   buttonClick(q.getSearchClk());
	  Thread.sleep(4000);
	}

	@When("User handles window and takescreenshot")
	public void user_handles_window_and_takescreenshot() throws InterruptedException, IOException {
		Thread.sleep(3000);
		buttonClick(q.getLowMobile());
		String parentName = driver.getWindowHandle();
		Thread.sleep(3000);
		Thread.sleep(3000);
		Set<String> hd = driver.getWindowHandles();
		for (String wdh : hd) {
			if(!wdh.equals(parentName)){
				driver.switchTo().window(wdh);
				Thread.sleep(4000);
				takeShot();
				break;
			}
		}
	}

	@When("user close the window")
	public void user_close_the_window() throws InterruptedException {
		driver.close();
		Thread.sleep(5000);
	}

	@Then("User quits browser")
	public void user_quits_browser() {
	   shutDown();
	}

}
