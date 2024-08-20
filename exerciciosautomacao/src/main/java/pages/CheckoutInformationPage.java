package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInformationPage {
	
private WebDriver driver;
	
	@FindBy(id = "first-name")
	private WebElement firstNameField;

	@FindBy(id = "last-name")
	private WebElement lastNameField;
	
	@FindBy(id = "postal-code")
	private WebElement postalCodeField;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	public CheckoutInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public void enterFistName(String fistname) {
        firstNameField.sendKeys(fistname);
	}
	
	public void enterLastName(String lastname) {
        lastNameField.sendKeys(lastname);
	}
	
	public void enterPostalCode(String postalcode) {
        postalCodeField.sendKeys(postalcode);
	}
	
	public void clickContinueButton() {
		continueButton.click();
	}
    
}
