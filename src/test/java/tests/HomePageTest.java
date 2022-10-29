package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;
import utilities.ExtentFactory;

public class HomePageTest extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void Parent() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Sign Up Process</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void ClickOnSignIn() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On SignIn.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOnSignIn();
	}

	@Test(priority = 1)
	public void clickOnSignUP() throws IOException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On SignUP</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOnSignUP();
	}

	@Test(priority = 2)
	public void GmailClick() throws IOException, InterruptedException {
		childTest = parentTest.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Gmail Click</b></p>");
		HomePage Gmail = new HomePage(childTest);
		Gmail.ClickOnGmailButton();
	}

	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
