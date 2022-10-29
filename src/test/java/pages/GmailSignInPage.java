package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class GmailSignInPage extends CommonMethods {

	ExtentTest test;

	public GmailSignInPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindAll({ @FindBy(xpath = "//input[@id=\"identifierId\"]") })
	WebElement UserName;

	@FindAll({ @FindBy(xpath = "//div[@class=\"zQJV3\"]//div[@class=\"FliLIb DL0QTb\"]") })
	WebElement NextButton;

	@FindAll({
			@FindBy(xpath = "//div[@class=\"Txuhic\"]//div[@class=\"aXBtI Wic03c\"]//div[@class=\"Xb9hP\"]//input") })
	WebElement Password;

	@FindAll({ @FindBy(xpath = "//div[@class=\"FliLIb DL0QTb\"]") })
	WebElement ClickAfterPasswordButton;

	public void GmailUserName() throws IOException {
		test.info("Provide Your Email Address");
		try {
			if (UserName.isDisplayed()) {
				SendText(UserName, "afjalsharifautomation@gmail.com");
				test.pass("<p style=\"color:green; font-size:13px\"><b>User Enter</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserNamePass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UserNamePass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Email Address not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "UserNameFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "UserNameFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(UserName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnUserNameNextButton() throws IOException {
		test.info("Click On UserName Next Button");
		try {
			if (NextButton.isDisplayed()) {
				NextButton.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>UserName Next Button</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"ClickOnUserNameNextButtonPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnUserNameNextButtonPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>UserName Next Button not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"ClickOnUserNameNextButtonPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnUserNameNextButtonPass.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(NextButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void GmailPassword() throws IOException {
		test.info("Provide Gmail Password");
		try {
			if (Password.isDisplayed()) {
				Password.click();
				SendText(Password, "AFJALSHARIF");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Password Enter</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PasswordPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PasswordPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Password not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PasswordFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PasswordFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Password.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(2000);
	}

	public void ClickOnPasswordNextButton() throws IOException {
		test.info("Click On UserName Next Button");
		try {
			if (ClickAfterPasswordButton.isDisplayed()) {
				ClickAfterPasswordButton.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Next Button</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"ClickOnPasswordNextButtonPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPasswordNextButtonPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Next Button not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"ClickOnPasswordNextButtonPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPasswordNextButtonPass.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ClickAfterPasswordButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}
}
