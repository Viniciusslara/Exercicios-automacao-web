package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginSteps {
	
	private WebDriver driver;
	private LoginPage login;
	
	@Before
	public void iniciar() {
		
		System.setProperty("webdriver.chrome.driver", "C:/tools/chromedriver-win64/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        
        login = new LoginPage(driver);
		
	}
	
	@Given("que o usuário realize o login na aplicaçao saucedemo com o perfil \"standard_user\"")
	public void que_o_usuário_realize_o_login_na_aplicaçao_saucedemo_com_o_perfil_standard_user() {
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLoginButton();
	}

}
