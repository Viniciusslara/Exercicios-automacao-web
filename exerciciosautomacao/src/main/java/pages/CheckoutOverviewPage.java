package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	
	private WebDriver driver;
	private String price;
	private String text;
	
	@FindBy(className = "summary_total_label")
	private WebElement priceProduct;
	
	@FindBy(className = "complete-header")
	private WebElement completeText;
	
	@FindBy(id = "finish")
	private WebElement finishButton;
	
	public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public String getPrice() {
		price = priceProduct.getText();
		return price;
		
	}
	
	public String getTextComplete() {
		text = completeText.getText();
		return text;
		
	}
	
	public void clickFinishButton() {
		finishButton.click();
	}

}
