package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.AddToCartPage;
import utilities.ExtentFactory;

public class AddToCartTest extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void Parent() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Add To Cart</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void SelectBookDivScroll() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>To Select Div</b></p>");
		AddToCartPage SelectBookDivScroll = new AddToCartPage(childTest);
		SelectBookDivScroll.SelectBookDivScroll();
	}

	@Test(priority = 1)
	public void FirstBookHover() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Hover On First Book t</b></p>");
		AddToCartPage FirstBookHover = new AddToCartPage(childTest);
		FirstBookHover.FirstBookHover();
	}

	@Test(priority = 2)
	public void FirstBookInAddToCart() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>First Book To Cart</b></p>");
		AddToCartPage FirstBookInAddToCart = new AddToCartPage(childTest);
		FirstBookInAddToCart.FirstBookInAddToCart();
	}

	@Test(priority = 3)
	public void SecondBookHover() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Hover On Second Book </b></p>");
		AddToCartPage SecondBookHover = new AddToCartPage(childTest);
		SecondBookHover.SecondBookHover();
	}

	@Test(priority = 4)
	public void SecondBookInAddToCart() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Second Book To Cart</b></p>");
		AddToCartPage SecondBookInAddToCart = new AddToCartPage(childTest);
		SecondBookInAddToCart.SecondBookInAddToCart();
	}

	@Test(priority = 5)
	public void PublishersDivScroll() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Publishers Div Scrolling </b></p>");
		AddToCartPage PublishersDivScroll = new AddToCartPage(childTest);
		PublishersDivScroll.PublishersDivScroll();
	}

	@Test(priority = 6)
	public void ThirdBookHover() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Hover On Third Book </b></p>");
		AddToCartPage ThirdBookHover = new AddToCartPage(childTest);
		ThirdBookHover.ThirdBookHover();
	}

	@Test(priority = 7)
	public void ThirdBookViewDetails() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Third Book View Details Click</b></p>");
		AddToCartPage ThirdBookViewDetails = new AddToCartPage(childTest);
		ThirdBookViewDetails.ThirdBookViewDetails();
	}

	@Test(priority = 8)
	public void ThirdBookAddToCartClick() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Third Book Add To Cart</b></p>");
		AddToCartPage ThirdBookAddToCartClick = new AddToCartPage(childTest);
		ThirdBookAddToCartClick.ThirdBookAddToCartClick();
	}

	@Test(priority = 9)
	public void ClickOnCrossButton() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Cross Button</b></p>");
		AddToCartPage ClickOnCrossButton = new AddToCartPage(childTest);
		ClickOnCrossButton.ClickOnCrossButton();
	}

	@Test(priority = 10)
	public void ClickOnCartIcon() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Cart Icon</b></p>");
		AddToCartPage ClickOnCartIcon = new AddToCartPage(childTest);
		ClickOnCartIcon.ClickOnCartIcon();
	}

	@Test(priority = 11)
	public void RemoveFirstElement() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Remove First Element</b></p>");
		AddToCartPage RemoveFirstElement = new AddToCartPage(childTest);
		RemoveFirstElement.RemoveFirstElement();
	}

	@Test(priority = 12)
	public void ConfirmRemoveElementByYes() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Remove First Element By Yes</b></p>");
		AddToCartPage ConfirmRemoveElementByYes = new AddToCartPage(childTest);
		ConfirmRemoveElementByYes.ConfirmRemoveElementByYes();
	}

	@Test(priority = 13)
	public void ClickOnPaceOrderButton() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Place Order Button</b></p>");
		AddToCartPage ClickOnPaceOrderButton = new AddToCartPage(childTest);
		ClickOnPaceOrderButton.ClickOnPaceOrderButton();
	}

	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
