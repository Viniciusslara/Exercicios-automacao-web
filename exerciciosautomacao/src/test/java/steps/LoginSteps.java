package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import pages.LoginPage;
import utils.WebDriverManager;

public class LoginSteps {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private LoginPage login;
	
	public LoginSteps() {
        login = new LoginPage(driver);
	}
	
	
	@Given("que o usuário realize o login na aplicaçao saucedemo com o perfil \"standard_user\"")
	public void que_o_usuário_realize_o_login_na_aplicaçao_saucedemo_com_o_perfil_standard_user() {
		driver.get("https://www.saucedemo.com/");
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLoginButton();
	}
	

}
