package com.ecommerce.stepdefinition;


import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.ecommerce.objectrepository.UrlFlipkart;
import com.ecommerce.resources.CommonActions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class FlipkartClassPage extends UrlFlipkart {
	CommonActions p = new CommonActions();
	UrlFlipkart q = new UrlFlipkart();
	List<String> model = new LinkedList<String>();
	List<String> price = new LinkedList<String>();

	@When("User close the login popup")
	public void user_close_the_login_popup() {
		buttonClick(q.getClLog());
	}

	@When("User searches the product {string}")
	public void user_searches_the_product(String str) {
		buttonClick(q.getSeacrhBar());
		insertText(q.getSeacrhBar(), str);
	}

	@When("User click search")
	public void user_click_search() throws InterruptedException {
		buttonClick(q.getSearchClk());

	}

	@When("User gets mobile model and price")
	public void user_gets_mobile_model_and_price() throws InterruptedException {
		if(model.size()==price.size()){
		iteratePrice(model,price);
		}
	}

	@When("User stores the mobile model and price in excel")
	public void user_stores_the_mobile_model_and_price_in_excel() throws IOException {
		excelWrite(model,price);
	}

	@Then("User in redmi page")
	public void user_in_redmi_page() {
		shutDown();
	}
}
