package com.ecommerce.stepdefinition;

import com.ecommerce.resources.CommonActions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonActions{
	@Before
	public void test1(){
		launch("https://www.flipkart.com/");
	}
	@After 
	public void testEnd(){
		System.out.println("$$$$");
	}
}
