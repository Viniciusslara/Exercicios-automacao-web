package steps;

import org.openqa.selenium.WebDriver;

import utils.Logger;
import io.cucumber.java.en.Given;
import pages.LoginPage;
import utils.WebDriverManager;

public class LoginSteps {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private Logger logger; 
	private LoginPage login;
	
	public LoginSteps() {
        login = new LoginPage(driver);
        logger = new Logger();
       
	}
	
	
	@Given("que o usuário realize o login na aplicaçao saucedemo com o perfil \"standard_user\"")
	public void que_o_usuário_realize_o_login_na_aplicaçao_saucedemo_com_o_perfil_standard_user() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		logger.takeScreenshot("TelaDeLogin");
		Thread.sleep(1000);
		login.clickLoginButton();
	}
	

}
