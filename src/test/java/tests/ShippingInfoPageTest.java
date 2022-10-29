package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.ShippingInfoPage;
import utilities.ExtentFactory;

public class ShippingInfoPageTest extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void Parent() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Shipping Information</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void NameGiven() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Name Giving </b></p>");
		ShippingInfoPage NameGiven = new ShippingInfoPage(childTest);
		NameGiven.NameGiven();
	}

	@Test(priority = 1)
	public void PhoneNumberGiven() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Phone Number Giving </b></p>");
		ShippingInfoPage PhoneNumberGiven = new ShippingInfoPage(childTest);
		PhoneNumberGiven.PhoneNumberGiven();
	}

	@Test(priority = 2)
	public void AlterNativePhoneNum() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Alternative Phone Number Giving </b></p>");
		ShippingInfoPage AlterNativePhoneNum = new ShippingInfoPage(childTest);
		AlterNativePhoneNum.AlterNativePhoneNum();
	}

	@Test(priority = 3)
	public void CountryAndAreaDropDown() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Country And Area DropDown Giving </b></p>");
		ShippingInfoPage CountryAndAreaDropDown = new ShippingInfoPage(childTest);
		CountryAndAreaDropDown.CountryAndAreaDropDown();
	}

	@Test(priority = 4)
	public void ZoneDropDown() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Zone DropDown Giving </b></p>");
		ShippingInfoPage ZoneDropDown = new ShippingInfoPage(childTest);
		ZoneDropDown.ZoneDropDown();
	}

	@Test(priority = 5)
	public void AddressInputField() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Address Is Giving </b></p>");
		ShippingInfoPage AddressInputField = new ShippingInfoPage(childTest);
		AddressInputField.AddressInputField();
	}

	@Test(priority = 6)
	public void NagadCheckBox() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Nagad CheckBox  </b></p>");
		ShippingInfoPage NagadCheckBox = new ShippingInfoPage(childTest);
		NagadCheckBox.NagadCheckBox();
	}

	@Test(priority = 7)
	public void ConfirmOrderButton() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Place Order Button  </b></p>");
		ShippingInfoPage ConfirmOrderButton = new ShippingInfoPage(childTest);
		ConfirmOrderButton.ConfirmOrderButton();
	}

	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
