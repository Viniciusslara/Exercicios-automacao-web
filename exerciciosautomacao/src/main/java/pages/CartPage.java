package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	private WebDriver driver;
	private String price;
	
	@FindBy(className = "inventory_item_price")
	private WebElement priceProduct;
	
	@FindBy(id = "checkout")
	private WebElement checkoutButton;
	
	public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
	
	public String getPrice() {
		price = priceProduct.getText();
		return price;
		
	}
	
	public void ClickCheckoutButton() {
		checkoutButton.click();
	}

}
