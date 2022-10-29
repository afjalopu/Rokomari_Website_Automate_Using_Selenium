package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class HomePage extends CommonMethods {

	ExtentTest test;

	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindAll({ @FindBy(xpath = "//a[contains(text(),'Sign in')]") })
	WebElement signIn;

	@FindAll({ @FindBy(xpath = "//p[contains(text(),'Sign up')]") })
	WebElement signUp;

	@FindAll({
			@FindBy(xpath = "//section//div[@class=\"login-registration__form\"]//div[@id=\"js--registration-form\"]//button[@class=\"btn btn-social-google\"]") })
	WebElement Gmail;

	public void clickOnSignIn() throws IOException {
		test.info("Click on sign-in Button");
		try {
			if (signIn.isDisplayed()) {
				signIn.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Sign-in Button Clicked.</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnSignInPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnSignInPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Sign-in location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnSignInFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnSignInFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(signIn.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void clickOnSignUP() throws IOException {
		test.info("Click on sign-UP Button");
		try {
			if (signUp.isDisplayed()) {
				signUp.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Sign-Up Button Clicked.</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnSignUpPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnSignUpPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Sign-Up location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnSignUpFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnSignUpFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(signUp.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}

	public void ClickOnGmailButton() throws IOException {
		test.info("Gmail Button Click");
		try {
			if (Gmail.isDisplayed()) {
				Gmail.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Gmail Button Clicked.</b></p>");
				timeOut();
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnGmailPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnGmailPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Gmail not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnGmailFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnGmailFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Gmail.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
}
