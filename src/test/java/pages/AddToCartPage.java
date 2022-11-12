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

public class AddToCartPage extends CommonMethods {

	ExtentTest test;

	public AddToCartPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}

	@FindBy(xpath = "//h1[contains(text(),'কাজী নজরুল ইসলাম এর বই সমূহ')]")
	public WebElement SelectBookDiv;

	@FindBy(xpath = "//button[@product-id=\"17775\"]")
	public WebElement FirstBookToCart;

	@FindBy(xpath = "//div[@title=\"অগ্নিবীণা কাজী নজরুল ইসলাম\"]")
	public WebElement FirstBookHover;

	@FindBy(xpath = "//button[@product-id=\"17790\"]")
	public WebElement SecondBookToCart;

	@FindBy(xpath = "//div[@title=\"মরু-ভাস্কর কাজী নজরুল ইসলাম\"]")
	public WebElement SecondBookHover;

	@FindBy(xpath = "//div[@class=\"filter-ebook\"]")
	public WebElement PublishersDiv;

	@FindBy(xpath = "//div[@title=\"জিঞ্জীর কাজী নজরুল ইসলাম\"]//a[contains(text(),'View Details')]")
	public WebElement ThirdBookViewDetails;

	@FindBy(xpath = "(//div[@class=\"col-4 col-xl-3\"])[13]")
	public WebElement ThirdBookDivScroll;

	@FindBy(xpath = "//div[@title=\"জিঞ্জীর কাজী নজরুল ইসলাম\"]")
	public WebElement ThirdBookHover;

	@FindBy(xpath = "//div[@class=\"details-btn\"]//a[@product-id=\"18067\"]")
	public WebElement ThirdBookAddToCart;

	@FindBy(xpath = "//button[@class=\"close js--btn-close-feature-popup\"]//span[contains(text(),'×')]")
	public WebElement ClickOnCrossButton;

	@FindBy(xpath = "//a[@id='js-cart-menu']")
	public WebElement ClickOnCartIcon;

	@FindBy(xpath = "//a[@productid=\"18067\"]//img[@src=\"/static/200/images/icon_trash.png\"]")
	public WebElement RemoveFirstElement;

	@FindBy(xpath = "//button[contains(text(),'হ্যাঁ')]")
	public WebElement ConfirmRemoveElementByYes;

	@FindBy(xpath = "//span[contains(text(),'Place Order')]")
	public WebElement ClickOnPaceOrderButton;

	public void SelectBookDivScroll() throws IOException {
		test.info("To BookList Div Scrolling");
		try {
			scrollToElement(SelectBookDiv);
			test.pass("<p style=\"color:green; font-size:13px\"><b>BookList scrolling Success</b></p>");
			timeOut(2000);

			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "BookListDivScrollingPass");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "BookListDivScrollingPass.png";
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>BookList Div not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "BookListDivScrollingFail");
			String desti = System.getProperty("user.dir") + "\\screenshots\\" + "BookListDivScrollingFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(desti).build());
			Assert.assertTrue(SelectBookDiv.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void FirstBookHover() throws IOException {
		test.info("First Book Hover");
		try {
			if (FirstBookHover.isDisplayed()) {
				hover(FirstBookHover);
				timeOut(2000);
				scrollToElement(SelectBookDiv);

				test.pass("<p style=\"color:green; font-size:13px\"><b>First Book Hovering</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookHoverPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookHoverPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>First Book Hovering not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookHoverFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookHoverFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(FirstBookHover.isDisplayed());
		}
		timeOut(5000);
	}

	public void FirstBookInAddToCart() throws IOException {
		test.info("Ordering First Book");
		try {
			if (FirstBookToCart.isDisplayed()) {
				FirstBookToCart.click();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Order First Book Success</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookOrderPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookOrderPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>First Book not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "FirstBookOrderFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "FirstBookOrderFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(FirstBookToCart.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void SecondBookHover() throws IOException {
		test.info("Second Book Hover");
		try {
			if (SecondBookHover.isDisplayed()) {
				hover(SecondBookHover);
				timeOut(2000);
				scrollToElement(SelectBookDiv);

				test.pass("<p style=\"color:green; font-size:13px\"><b>Second Book Hovering</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SeondBookHoverPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookHoverPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Second Book Hovering not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookHoverFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookHoverFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(SecondBookHover.isDisplayed());
		}
		timeOut(5000);
	}

	public void SecondBookInAddToCart() throws IOException {
		test.info("Second Book To Cart");
		try {
			if (SecondBookToCart.isDisplayed()) {
				SecondBookToCart.click();
				scrollToElement(SelectBookDiv);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Order First Book Success</b></p>");
				timeOut(2000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookOrderPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookOrderPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>First Book not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "SecondBookOrderFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "SecondBookOrderFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(SecondBookToCart.isDisplayed());
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

	public void ThirdBookHover() throws IOException {
		test.info("Third Book Hover");
		try {
			if (ThirdBookHover.isDisplayed()) {
				scrollToElement(PublishersDiv);
				timeOut(2000);
				hover(ThirdBookHover);
				timeOut(2000);
				// scrollToElement(PublishersDiv);

				test.pass("<p style=\"color:green; font-size:13px\"><b>Third Book Hovering</b></p>");
				timeOut(2000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ThirdBookHoverPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ThirdBookHoverPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Third Book Hovering not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ThirdBookHoverFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ThirdBookHoverFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ThirdBookHover.isDisplayed());
		}
		timeOut(5000);
	}

	public void ThirdBookViewDetails() throws IOException {
		test.info("Third Book View Details");
		try {
			if (ThirdBookViewDetails.isDisplayed()) {
				scrollToElement(ThirdBookDivScroll);
				timeOut(2000);

				hover(ThirdBookHover);
				timeOut(2000);

				ThirdBookViewDetails.click();
				timeOut(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Order Third View Details Success</b></p>");
				timeOut(10000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"ThirdBookViewDetailsPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ThirdBookViewDetailsPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Th Book not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ThirdBookViewDetailsFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ThirdBookViewDetailsFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ThirdBookViewDetails.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ThirdBookAddToCartClick() throws IOException {
		test.info("Third Book Add To Cart Click");
		try {
			if (ThirdBookAddToCart.isDisplayed()) {
				ThirdBookAddToCart.click();
				timeOut(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Order of Third Book Success</b></p>");
				timeOut(10000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ThirdBookOrderPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ThirdBookOrderPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Third Book not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ThirdBookOrderFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ThirdBookOrderFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ThirdBookAddToCart.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnCrossButton() throws IOException {
		test.info("Click on Cross Button");
		try {
			if (ClickOnCrossButton.isDisplayed()) {
				ClickOnCrossButton.click();
				timeOut(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Click On Cross Button Success</b></p>");
				timeOut(10000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnCrossButtonPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnCrossButtonPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Cross Button not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnCrossButtonFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnCrossButtonFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ClickOnCrossButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnCartIcon() throws IOException {
		test.info("Click on Cart Icon");
		try {
			if (ClickOnCartIcon.isDisplayed()) {
				ClickOnCartIcon.click();
				timeOut(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Click Cart Icon Success</b></p>");
				timeOut(10000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnCartIconPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnCartIconPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Cart Icon not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnCartIconFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnCartIconFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ClickOnCartIcon.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void RemoveFirstElement() throws IOException {
		test.info("Remove on First Product");
		try {
			if (RemoveFirstElement.isDisplayed()) {
				RemoveFirstElement.click();
				timeOut(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Remove First Element Success</b></p>");
				timeOut(5000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "RemoveFirstElementPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RemoveFirstElementPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>First Product Remove not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"ClickFirstProductGivenQuantityFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "RemoveFirstElementFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(RemoveFirstElement.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ConfirmRemoveElementByYes() throws IOException {
		test.info("Confirm By Yes");
		try {
			if (ConfirmRemoveElementByYes.isDisplayed()) {
				ConfirmRemoveElementByYes.click();
				timeOut(5000);
				scrollPageDown();
				test.pass("<p style=\"color:green; font-size:13px\"><b>Confirm Remove Element Success</b></p>");
				timeOut(5000);

				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"ConfirmRemoveElementByYesPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConfirmRemoveElementByYesPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Confirm Remove Element not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
					"ConfirmRemoveElementByYesFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ConfirmRemoveElementByYesFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ConfirmRemoveElementByYes.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

	public void ClickOnPaceOrderButton() throws IOException {
		test.info("Click on Place Order Button And Switch Shipping Window");
		try {
			if (ClickOnPaceOrderButton.isDisplayed()) {
				ClickOnPaceOrderButton.click();
				timeOut(5000);
				test.pass("<p style=\"color:green; font-size:13px\"><b>Click On Place Order Success</b></p>");
				timeOut(5000);
				@SuppressWarnings("unused")
				String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(),
						"ClickOnPaceOrderButtonPass");
				String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPaceOrderButtonPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());

				windowHandling();
				PageDriver.getCurrentDriver().switchTo().window(windowHandling().get(1));
				test.pass("<p style=\"color:green; font-size:13px\"><b>Shipping Page Switch Success</b></p>");
				timeOut(5000);
				@SuppressWarnings("unused")
				String ScreenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ShippingPageSwitchPass");
				String Dest = System.getProperty("user.dir") + "\\screenshots\\" + "ShippingPageSwitchPass.png";
				test.pass(MediaEntityBuilder.createScreenCaptureFromPath(Dest).build());
			}

		} catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Cart Icon not locateable.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnPaceOrderButtonFail");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnPaceOrderButtonFail.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ClickOnPaceOrderButton.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		timeOut(5000);
	}

}
