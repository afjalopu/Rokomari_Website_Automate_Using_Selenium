package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class WriterAndBookFilterPage extends CommonMethods {

	ExtentTest test;

	public WriterAndBookFilterPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBy(xpath = "//a[@id=\"js--authors\"]")
	public WebElement Writer;

	@FindBy(xpath = "//a[@href=\"/book/author/1247?ref=mm_p13\"]")
	public WebElement WriterChoice;

	@FindBy(xpath = "//label[contains(text(),'Best Seller')]")
	public WebElement BestSellerCheckBox;

	@FindBy(xpath = "//label[contains(text(),'বাংলা কবিতা')]")
	public WebElement FilterCheckBox_1;

	@FindBy(xpath = "//div[@class=\"filter\"]")
	public WebElement Catagories_Ids;

	@FindBy(xpath = "//ul[@id='categoryIds']")
	public WebElement Inner_Catagories_Ids;

	@FindBy(xpath = "//label[contains(text(),'রচনা সংকলন ও সমগ্র')]")
	public WebElement FilterCheckBox_2;

	@FindBy(xpath = "//label[contains(text(),'শিশু ও কিশোর কালেকশন')]")
	public WebElement FilterCheckBox_3;

	@FindBy(xpath = "//label[contains(text(),'আগামী প্রকাশনী')]")
	public WebElement PublishersCheckBox_2;

	@FindBy(xpath = "//label[contains(text(),'নজরুল ইন্সটিটিউট')]")
	public WebElement PublishersCheckBox_1;

	@FindBy(xpath = "//label[contains(text(),'মাওলা ব্রাদার্স')]")
	public WebElement PublishersCheckBox_3;

	@FindBy(xpath = "//div[@class=\"filter-ebook\"]")
	public WebElement PublishersDiv;

	@FindBy(xpath = "//label[@for=\"languageIds_1\"]")
	public WebElement BanglaLanguage;

	@FindBy(xpath = "//h2[contains(text(),'Price')]")
	public WebElement BanglaLanguageDiv;

	@FindBy(xpath = "//label[@for=\"rating_5\"]")
	public WebElement FiveStarRating;

	public void Writer() throws IOException {
		test.info("Writer List Hover");
		try {
			if (Writer.isDisplayed()) {
				hover(Writer);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Writer List Showing</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterListShowPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterListShowPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Writer List not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterListShowFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterListShowFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Writer.isDisplayed());
		}
		timeOut(5000);
	}

	public void WriterSelected() throws IOException {
		test.info("Writer Select");
		try {
			if (WriterChoice.isDisplayed()) {
				WriterChoice.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Writer Selected</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterSelectionPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "WriterSelectionPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Writer Selection not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "WriterSelectionFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "WriterSelectionFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(WriterChoice.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void BestSellerFilterClick() throws IOException {
		test.info("Best Seller Filtering");
		try {
			if (BestSellerCheckBox.isDisplayed()) {
				BestSellerCheckBox.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Best Seller Clicked</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"BestSellerCheckBoxClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BestSellerCheckBoxClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Best Seller not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "BestSellerCheckBoxClickFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "BestSellerCheckBoxClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(BestSellerCheckBox.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void Book_CatagoriesDivScroll() throws IOException {
		test.info("Scrolling");
		try {
			if (Catagories_Ids.isDisplayed()) {
				scrollToElement(Catagories_Ids);
				test.pass("<p style=\"color:green; font-size:13px\"><b>scrolling Success</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ScrollingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ScrollingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Bangla Kobita not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ScrollingFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "ScrollingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(Catagories_Ids.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void BanglaKobitaCheckBoxClick() throws IOException {
		test.info("Bangla Kobita CheckBox Filtering");
		try {
			if (FilterCheckBox_1.isDisplayed()) {
				FilterCheckBox_1.click();
				scrollToElement(Catagories_Ids);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Bangla Kobita CheckBox Filtering Pass</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"BanglaKobitaCheckBoxClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BanglaKobitaCheckBoxClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Bangla Kobita CheckBox Not Locatable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"BanglaKobitaCheckBoxClickFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "BanglaKobitaCheckBoxClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(FilterCheckBox_1.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnRochonaSongkolon() throws IOException {
		test.info("Click On Rochona Songkolon CheckBox");
		try {
			if (FilterCheckBox_2.isDisplayed()) {
				FilterCheckBox_2.click();
				scrollToElement(Catagories_Ids);
				timeOut(4000);

				test.pass(
						"<p style=\"color:green; font-size:13px\"><b>Click On Rochona Songkolon Checkbox CheckBox Pass</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"RochonaSongkolonCheckBoxClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\"
						+ "RochonaSongkolonCheckBoxClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Rochona Songkolon CheckBox Not Locatable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"RochonaSongkolonCheckBoxClickFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "RochonaSongkolonCheckBoxClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(FilterCheckBox_2.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void PublishersDivScroll() throws IOException {
		test.info("To Publisher Div Scrolling");
		try {
			if (PublishersDiv.isDisplayed()) {
				scrollToElement(PublishersDiv);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Publishers Div scrolling Success</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"PublishersDivScrollingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "PublishersDivScrollingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Publishers Div not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "PublishersDivScrollingFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "PublishersDivScrollingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(PublishersDiv.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnNazrulCheckBox() throws IOException {
		test.info("Click On Nazrul CheckBox");
		try {
			if (PublishersCheckBox_1.isDisplayed()) {
				PublishersCheckBox_1.click();
				scrollToElement(PublishersDiv);

				test.pass("<p style=\"color:green; font-size:13px\"><b>Click On Nazrul CheckBox Pass</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NazrulCheckBoxClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "NazrulCheckBoxClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Nazrul CheckBox Not Locatable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "NazrulCheckBoxClickFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "NazrulCheckBoxClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(PublishersCheckBox_1.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnAgamiProkashoniCheckBox() throws IOException {
		test.info("Click On Bangla Academy CheckBox");
		try {
			if (PublishersCheckBox_2.isDisplayed()) {
				PublishersCheckBox_2.click();
				scrollToElement(PublishersDiv);

				test.pass(
						"<p style=\"color:green; font-size:13px\"><b>Click On Agami Prokashoni CheckBox Pass</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"AgamiProkashoniCheckBoxClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\"
						+ "AgamiProkashoniCheckBoxClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Agami Prokashoni CheckBox Not Locatable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"AgamiProkashoniCheckBoxClickFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "AgamiProkashoniCheckBoxClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(PublishersCheckBox_2.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnMawlanaBrothersCheckBox() throws IOException {
		test.info("Click On Mawlana Brothers CheckBox");
		try {
			if (PublishersCheckBox_3.isDisplayed()) {
				PublishersCheckBox_3.click();
				scrollToElement(PublishersDiv);

				test.pass(
						"<p style=\"color:green; font-size:13px\"><b>Click On Mawlana Brothers CheckBox Pass</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"MawlanaBrothersCheckBoxClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\"
						+ "MawlanaBrothersCheckBoxClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Mawlana Brothers CheckBox Not Locatable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"MawlanaBrothersCheckBoxClickFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "MawlanaBrothersCheckBoxClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(PublishersCheckBox_3.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void BanglaLanguageDivScroll() throws IOException {
		test.info("To Language Div Scrolling");
		try {
			if (BanglaLanguageDiv.isDisplayed()) {
				scrollToElement(BanglaLanguageDiv);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Language Div scrolling Success</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"LanguageDivScrollingPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "LanguageDivScrollingPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Language Div not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "LanguageDivScrollingFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "LanguageDivScrollingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(BanglaLanguageDiv.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnBanglaCheckBox() throws IOException {
		test.info("Click On Bangla Language CheckBox");
		try {
			if (BanglaLanguage.isDisplayed()) {
				BanglaLanguage.click();
				scrollToElement(BanglaLanguageDiv);

				test.pass("<p style=\"color:green; font-size:13px\"><b>Click On Bangla CheckBox Pass</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"BanglaLanguageCheckBoxClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\"
						+ "BanglaLanguageCheckBoxClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Mawlana Brothers CheckBox Not Locatable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"BanglaLanguageCheckBoxClickFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "BanglaLanguageCheckBoxClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(BanglaLanguage.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnFiveStarRating() throws IOException {
		test.info("Click On Five Star Rating CheckBox");
		try {
			if (FiveStarRating.isDisplayed()) {
				FiveStarRating.click();
				scrollToElement(BanglaLanguageDiv);

				test.pass(
						"<p style=\"color:green; font-size:13px\"><b>Click On Five Star Rating CheckBox Pass</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"FiveStarRatingCheckBoxClickPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\"
						+ "FiveStarRatingCheckBoxClickPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Five Star Rating CheckBox Not Locatable</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"FiveStarRatingCheckBoxClickFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "FiveStarRatingCheckBoxClickFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(FiveStarRating.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

}
