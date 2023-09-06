package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingPage extends BaseClass {

	public BookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "inputName")
	private WebElement txtName;
	@FindBy(id = "address")
	private WebElement txtAddress;
	@FindBy(id = "city")
	private WebElement txtCity;
	@FindBy(id = "state")
	private WebElement txtState;
	@FindBy(id = "zipCode")
	private WebElement txtZipCode;
	@FindBy(id = "cardType")
	private WebElement txtCardType;
	@FindBy(id = "creditCardNumber")
	private WebElement txtccNo;
	@FindBy(id = "creditCardMonth")
	private WebElement txtccMonth;
	@FindBy(id = "creditCardYear")
	private WebElement txtccYear;
	@FindBy(id = "nameOnCard")
	private WebElement txtCardName;
	@FindBy(id = "rememberMe")
	private WebElement rdoRemeber;
	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement btnBook;
	@FindBy(xpath = "//h1[contains(text(),'Thank you')]")
	private WebElement txtBookingSuccess;

	public WebElement getTxtName() {
		return txtName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public WebElement getTxtState() {
		return txtState;
	}

	public WebElement getTxtZipCode() {
		return txtZipCode;
	}

	public WebElement getTxtCardType() {
		return txtCardType;
	}

	public WebElement getTxtccNo() {
		return txtccNo;
	}

	public WebElement getTxtccMonth() {
		return txtccMonth;
	}

	public WebElement getTxtccYear() {
		return txtccYear;
	}

	public WebElement getTxtCardName() {
		return txtCardName;
	}

	public WebElement getRdoRemeber() {
		return rdoRemeber;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}

	public WebElement getTxtBookingSuccess() {
		return txtBookingSuccess;
	}

	public void BookFlight() throws IOException {

		String name = readCellData("Data", 1, 0);
		sendKeys(txtName, name);
		String address = readCellData("Data", 1, 1);
		sendKeys(txtAddress, address);
		String city = readCellData("Data", 1, 2);
		sendKeys(txtCity, city);
		String state = readCellData("Data", 1, 3);
		sendKeys(txtState, state);
		String zipCode = readCellData("Data", 1, 4);
		sendKeys(txtZipCode, zipCode);
		String cardType = readCellData("Data", 1, 5);
		selectByVisibleText(txtCardType, cardType);
		txtCardName.clear();
		String number = readCellData("Data", 1, 6);
		sendKeys(txtCardName, number);
		txtccMonth.clear();
		String month = readCellData("Data", 1, 7);
		sendKeys(txtccMonth, month);
		txtccYear.clear();
		String year = readCellData("Data", 1, 8);
		sendKeys(txtccYear, year);
		txtCardName.clear();
		String cardName = readCellData("Data", 1, 9);
		sendKeys(txtCardName, cardName);
		click(rdoRemeber);
		click(btnBook);

	}

}
