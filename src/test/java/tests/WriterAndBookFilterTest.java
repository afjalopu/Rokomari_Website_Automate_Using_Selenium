package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.WriterAndBookFilterPage;
import utilities.ExtentFactory;

public class WriterAndBookFilterTest extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void Parent() {
		report = ExtentFactory.getInstance();
		parentTest = report
				.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Writer And Book Filtering</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void Writer() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Gmail UserName Provide</b></p>");
		WriterAndBookFilterPage Writer = new WriterAndBookFilterPage(childTest);
		Writer.Writer();
	}

	@Test(priority = 1)
	public void WriterSelected() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Gmail UserName Provide</b></p>");
		WriterAndBookFilterPage WriterSelected = new WriterAndBookFilterPage(childTest);
		WriterSelected.WriterSelected();
	}

	@Test(priority = 2)
	public void BestSellerFilterClick() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Best Seller CheckBox</b></p>");
		WriterAndBookFilterPage BestSellerFilterClick = new WriterAndBookFilterPage(childTest);
		BestSellerFilterClick.BestSellerFilterClick();
	}

	@Test(priority = 3)
	public void Book_CatagoriesDivScroll() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b> Scrolling </b></p>");
		WriterAndBookFilterPage Book_CatagoriesDivScroll = new WriterAndBookFilterPage(childTest);
		Book_CatagoriesDivScroll.Book_CatagoriesDivScroll();
	}

	@Test(priority = 4)
	public void BanglaKobitaCheckBoxClick() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b> Bangla Kobita Select </b></p>");
		WriterAndBookFilterPage BanglaKobitaCheckBoxClick = new WriterAndBookFilterPage(childTest);
		BanglaKobitaCheckBoxClick.BanglaKobitaCheckBoxClick();
	}

	@Test(priority = 5)
	public void RochonaSongkolonCheckBoxClick() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Rochona Songkolon Select </b></p>");
		WriterAndBookFilterPage ClickOnRochonaSongkolon = new WriterAndBookFilterPage(childTest);
		ClickOnRochonaSongkolon.ClickOnRochonaSongkolon();
	}

	@Test(priority = 6)
	public void PublishersDivScroll() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Publishers Div Scrolling </b></p>");
		WriterAndBookFilterPage PublishersDivScroll = new WriterAndBookFilterPage(childTest);
		PublishersDivScroll.PublishersDivScroll();
	}

	@Test(priority = 7)
	public void ClickOnNazrulCheckBox() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b> Bangla Kobita Select </b></p>");
		WriterAndBookFilterPage ClickOnNazrulCheckBox = new WriterAndBookFilterPage(childTest);
		ClickOnNazrulCheckBox.ClickOnNazrulCheckBox();
	}

	@Test(priority = 8)
	public void ClickOnAgamiProkashoniCheckBox() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b> Agami Prokashoni Select </b></p>");
		WriterAndBookFilterPage ClickOnAgamiProkashoniCheckBox = new WriterAndBookFilterPage(childTest);
		ClickOnAgamiProkashoniCheckBox.ClickOnAgamiProkashoniCheckBox();
	}

	@Test(priority = 9)
	public void ClickOnMawlanaBrothersCheckBox() throws IOException {
		childTest = parentTest.createNode(
				"<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Mawlana Brothers CheckBox </b></p>");
		WriterAndBookFilterPage ClickOnMawlanaBrothersCheckBox = new WriterAndBookFilterPage(childTest);
		ClickOnMawlanaBrothersCheckBox.ClickOnMawlanaBrothersCheckBox();
	}

	@Test(priority = 10)
	public void BanglaLanguageDivScroll() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Bangla Language Div </b></p>");
		WriterAndBookFilterPage BanglaLanguageDivScroll = new WriterAndBookFilterPage(childTest);
		BanglaLanguageDivScroll.BanglaLanguageDivScroll();
	}

	@Test(priority = 11)
	public void ClickOnBanglaCheckBox() throws IOException {
		childTest = parentTest.createNode(
				"<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Bangla Language CheckBox </b></p>");
		WriterAndBookFilterPage ClickOnBanglaCheckBox = new WriterAndBookFilterPage(childTest);
		ClickOnBanglaCheckBox.ClickOnBanglaCheckBox();
	}

	@Test(priority = 12)
	public void ClickOnFiveStarRating() throws IOException {
		childTest = parentTest.createNode(
				"<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Five Star Rating CheckBox </b></p>");
		WriterAndBookFilterPage ClickOnFiveStarRating = new WriterAndBookFilterPage(childTest);
		ClickOnFiveStarRating.ClickOnFiveStarRating();
	}

	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
