package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageFactory {

	WebDriver driver;
	
	@FindBy(id="txtFirstName")
	WebElement pffirstName;
	
	@FindBy(id="txtLastName")
	WebElement pflastName;
	
	@FindBy(id="txtEmail")
	WebElement pfemail;
	
	@FindBy(id="txtPhone")
	WebElement pfphone;
	
	@FindBy(name="city")
	WebElement pfcity;
	
	@FindBy(name="state")
	WebElement pfstate;
	
	@FindBy(id="txtCardholderName")
	WebElement pfcardholderName;
	
	@FindBy(id="txtDebit")
	WebElement pfdebit;
	
	@FindBy(id="txtCvv")
	WebElement pfcvv;
	
	@FindBy(id="txtMonth")
	WebElement pfmonth;
	
	@FindBy(id="txtYear")
	WebElement pfyear;
	
	@FindBy(className="btn")
	WebElement pfconfirm;
	
	@FindBy(name="persons")
	WebElement pfpersons;

	public WebElement getPfconfirm() {
		return pfconfirm;
	}

	public void setPfconfirm() {
		pfconfirm.click();
	}

	public HotelBookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPffirstName() {
		return pffirstName;
	}

	public WebElement getPflastName() {
		return pflastName;
	}

	public WebElement getPfemail() {
		return pfemail;
	}

	public WebElement getPfphone() {
		return pfphone;
	}

	public WebElement getPfcity() {
		return pfcity;
	}

	public WebElement getPfstate() {
		return pfstate;
	}

	public WebElement getPfcardholderName() {
		return pfcardholderName;
	}

	public WebElement getPfdebit() {
		return pfdebit;
	}

	public WebElement getPfcvv() {
		return pfcvv;
	}

	public WebElement getPfmonth() {
		return pfmonth;
	}

	public WebElement getPfyear() {
		return pfyear;
	}

	public void setPffirstName(String fname) {
		pffirstName.sendKeys(fname);
	}

	public void setPflastName(String lname) {
		pflastName.sendKeys(lname);
	}

	public void setPfemail(String email) {
		pfemail.sendKeys(email);
	}

	public void setPfphone(String phone) {
		pfphone.sendKeys(phone);
	}

	public void setPfcity(String city) {
		Select sel = new Select(pfcity);
		sel.selectByValue(city);
	}

	public void setPfstate(String state) {
		Select sel = new Select(pfstate);
		sel.selectByValue(state);
	}

	public void setPfcardholderName(String cardholderName) {
		pfcardholderName.sendKeys(cardholderName);
	}

	public void setPfdebit(String debit) {
		pfdebit.sendKeys(debit);
	}

	public void setPfcvv(String cvv) {
		pfcvv.sendKeys(cvv);;
	}

	public void setPfmonth(String month) {
		pfmonth.sendKeys(month);
	}

	public void setPfyear(String year) {
		pfyear.sendKeys(year);
	}

	public WebElement getPfpersons() {
		return pfpersons;
	}

	public void setPfpersons(String person) {
		pfpersons.sendKeys(person);
	}
	
	
	
	
	
}
