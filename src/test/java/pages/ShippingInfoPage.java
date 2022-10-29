package pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class ShippingInfoPage extends CommonMethods {

	ExtentTest test;

	public ShippingInfoPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBy(xpath = "//div[@class=\"shipping-form-container\"]//input[@name=\"name\"]")
	public WebElement Name;

	@FindBy(xpath = "//input[@name=\"phone\"]")
	public WebElement PhoneNumber;

	@FindBy(xpath = "//input[@class=\"js--alternative-phone\"]")
	public WebElement AlternativePhoneNum;

	@FindBy(xpath = "//select[@id='js--country']")
	public WebElement CountryDropDown;

	@FindBy(xpath = "//select[@id='js--city']")
	public WebElement CityDropDown;

	@FindBy(xpath = "//select[@id='js--area']")
	public WebElement AreaDropDown;

	@FindBy(xpath = "//select[@id='js--zone']")
	public WebElement ZoneDropDown;

	@FindBy(xpath = "//fieldset//textarea[@name=\"address\"]")
	public WebElement Address;

	@FindBy(xpath = "//input[@id='nagad']")
	public WebElement ClickOnNagadCheckBox;

	@FindBy(xpath = "//button[@id='js--confirm-order']")
	public WebElement ConFirmOrderButton;

	public void NameGiven() throws IOException {
		test.info("Giving Name");
		try {
			if (Name.isDisplayed()) {
				Name.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
				sendText(Name, "Md. Afjal Sharif");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Name Giving</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NameGivingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NameGivingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> Name Input not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NameGivingFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NameGivingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Name.isDisplayed());
		}
		timeOut(5000);
	}

	public void PhoneNumberGiven() throws IOException {
		test.info("Giving Phone Number");
		try {
			if (PhoneNumber.isDisplayed()) {
				PhoneNumber.click();
				SendText(PhoneNumber, "01870866386");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Phone Number Giving</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PhoneNumberGivingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PhoneNumberGivingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Phone Number Input not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PhoneNumberGivingFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PhoneNumberGivingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(PhoneNumber.isDisplayed());
		}
		timeOut(5000);
	}

	public void AlterNativePhoneNum() throws IOException {
		test.info("Giving Alternative Phone Number");
		try {
			if (AlternativePhoneNum.isDisplayed()) {
				AlternativePhoneNum.click();
				SendText(AlternativePhoneNum, "01918899529");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Alternative Phone Number Giving</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"AlternativePhoneNumberGivingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\"
						+ "AlternativePhoneNumberGivingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Alternative Phone Number not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"AlternativePhoneNumberGivingFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AlternativePhoneNumberGivingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(AlternativePhoneNum.isDisplayed());
		}
		timeOut(5000);
	}

	public void CountryAndAreaDropDown() throws IOException {
		test.info("Giving Country and Area Drop Down Value");
		try {
			if (CountryDropDown.isDisplayed() && AreaDropDown.isDisplayed()) {
				CountryDropDown.click();
				timeOut(4000);
				selectItemByIndex(CityDropDown, 2);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Country DropDown Value Giving</b></p>");
				timeOut(4000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CountryDropDownPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CountryDropDownPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());

				timeOut(4000);
				AreaDropDown.click();
				timeOut(4000);
				selectItemByIndex(AreaDropDown, 2);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Area DropDown Value Giving</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AreaDropDownPass");
				String Dest = System.getProperty("user.dir") + "\\screenshots\\" + "AreaDropDownPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Country DropDown Value not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "CountryDropDownFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "CountryDropDownFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(CountryDropDown.isDisplayed());

			timeOut(4000);
			test.fail("<p style=\"color:red; font-size:13px\"><b>Area DropDown Value not locateable.</b></p>");
			Throwable t1 = new InterruptedException("Exception");
			test.fail(t1);
			@SuppressWarnings("unused")
			String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AreaDropDownFail");
			String Dest = System.getProperty("user.dir") + "\\screenshots\\" + "AreaDropDownFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(Dest).build());
			Assert.assertTrue(AreaDropDown.isDisplayed());
		}
		timeOut(5000);
	}

	public void ZoneDropDown() throws IOException {
		test.info("Giving Zone Drop Down Value");
		try {
			if (ZoneDropDown.isDisplayed()) {
				ZoneDropDown.click();
				timeOut(4000);
				selectItemByIndex(ZoneDropDown, 2);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Zone DropDown Value Giving</b></p>");
				timeOut(4000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ZoneDropDownPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ZoneDropDownPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Country DropDown Value not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ZoneDropDownFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ZoneDropDownFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ZoneDropDown.isDisplayed());
		}
		timeOut(5000);
	}

	public void AddressInputField() throws IOException {
		test.info("Giving Address");
		try {
			if (Address.isDisplayed()) {
				Address.click();
				SendText(Address, "Road No 12/1, Housing No 12A#, ECB Chottor, Dhaka Cantonment, Dhaka");
				test.pass("<p style=\"color:green; font-size:13px\"><b>Address is Giving</b></p>");
				timeOut(4000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AddressGivingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AddressGivingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> Address not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);

			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "AddressGivingFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "AddressGivingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Address.isDisplayed());
		}
		timeOut(5000);
	}

	public void NagadCheckBox() throws IOException {
		test.info("Giving Click On Nagad CheckBox");
		try {
			if (ClickOnNagadCheckBox.isDisplayed()) {
				ClickOnNagadCheckBox.click();
				timeOut(2000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Nagad CheckBox Clicking Pass</b></p>");
				timeOut(4000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"ClickOnNagadCheckBoxPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnNagadCheckBoxPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> Nagad CheckBox not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnNagadCheckBoxFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnNagadCheckBoxFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ClickOnNagadCheckBox.isDisplayed());
		}
		timeOut(5000);
	}

	public void ConfirmOrderButton() throws IOException {
		test.info("Click On Confirm Order Button");
		try {
			if (ConFirmOrderButton.isDisplayed()) {
				ConFirmOrderButton.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Place Order Button Clicking Pass</b></p>");
				timeOut(4000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ConFirmOrderButtonPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConFirmOrderButtonPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> Place Order Button not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ConFirmOrderButtonFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConFirmOrderButtonFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ConFirmOrderButton.isDisplayed());
		}
		timeOut(5000);
	}

}