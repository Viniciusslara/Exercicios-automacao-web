package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InicialPage {
	
	private WebDriver driver;
	
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement productBackpack;
	
	@FindBy(id = "shopping_cart_container")
	private WebElement cartButton;
	
	@FindBy(id = "react-burger-menu-btn")
	private WebElement burgerMenu;
	
	@FindBy(linkText = "Logout")
	private WebElement logoutButton;
	
    public InicialPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickCartButton () {
        cartButton.click();
    }

    public void selectBackpack () {
        productBackpack.click();
    }
    
    
    public void clickLogoutButton() throws InterruptedException {
		logoutButton.click();
	}
    
    public void clickBurgerMenu() throws InterruptedException {
		burgerMenu.click();
	}

}
