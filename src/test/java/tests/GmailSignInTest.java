package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.GmailSignInPage;
import utilities.ExtentFactory;

public class GmailSignInTest extends BaseDriver {

	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;

	@BeforeClass
	public void Parent() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Gmail LogIn</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().manage().window().maximize();
	}

	@Test(priority = 0)
	public void GmailUserName() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Gmail UserName Provide</b></p>");
		GmailSignInPage GmailUserName = new GmailSignInPage(childTest);
		GmailUserName.GmailUserName();
	}

	@Test(priority = 1)
	public void ClickOnUserNameNextButton() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Next Button</b></p>");
		GmailSignInPage ClickOnUserNameNextButton = new GmailSignInPage(childTest);
		ClickOnUserNameNextButton.ClickOnUserNameNextButton();
	}

	@Test(priority = 2)
	public void GmailPassword() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Gmail Password Provide</b></p>");
		GmailSignInPage GmailPassword = new GmailSignInPage(childTest);
		GmailPassword.GmailPassword();
	}

	@Test(priority = 3)
	public void ClickOnPasswordNextButton() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On Next Button</b></p>");
		GmailSignInPage ClickOnPasswordNextButton = new GmailSignInPage(childTest);
		ClickOnPasswordNextButton.ClickOnPasswordNextButton();
	}

	@AfterClass
	public void afterClass() {
		report.flush();
	}
}
