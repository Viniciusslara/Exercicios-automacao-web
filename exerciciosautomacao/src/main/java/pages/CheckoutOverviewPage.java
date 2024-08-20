package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPage {
	
	private WebDriver driver;
	private String price;
	
	@FindBy(className = "summary_total_label")
	private WebElement priceProduct;
	
	public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public String getPrice() {
		price = priceProduct.getText();
		return price;
		
	}

}
