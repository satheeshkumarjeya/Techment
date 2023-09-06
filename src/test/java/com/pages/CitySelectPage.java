package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CitySelectPage extends BaseClass {
	
	public CitySelectPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h1[contains(text(),'Welcome to the')]")
	private WebElement txtWelcome;
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement FromCity;
	@FindBy(xpath= "//select[@name='toPort']")
	private WebElement ToCity;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement btnFind;
	@FindBy(xpath="//h3[contains(text(),'Flights from')]")
	private WebElement txtSelectFlight;
	@FindBy(xpath="(//input[@value='Choose This Flight'])[3]")
	private WebElement btnFlight;
	@FindBy(xpath="//h2[contains(text(),'Your flight from')]")
	private WebElement txtFlight;
	
	public WebElement getTxtWelcome() {
		return txtWelcome;
	}
	public WebElement getFromCity() {
		return FromCity;
	}
	public WebElement getToCity() {
		return ToCity;
	}
	public WebElement getBtnFind() {
		return btnFind;
	}
	public WebElement getTxtSelectFlight() {
		return txtSelectFlight;
	}
	
	
	public WebElement getBtnFlight() {
		return btnFlight;
	}
	public WebElement getTxtFlight() {
		return txtFlight;
	}
	public void selectCity(String from, String to) {
		
		selectByVisibleText(FromCity, from);
		selectByVisibleText(ToCity, to);
		click(btnFind);
	}
	
	
}
