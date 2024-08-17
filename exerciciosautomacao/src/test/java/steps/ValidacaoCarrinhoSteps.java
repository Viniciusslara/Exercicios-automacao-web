package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.InicialPage;
import pages.LoginPage;

public class ValidacaoCarrinhoSteps {
	
	private WebDriver driver;
	private LoginPage login;
	private InicialPage inicio;
	private CartPage cart;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:/tools/chromedriver-win64/chromedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
        inicio = new InicialPage(driver);
        cart = new CartPage(driver);
		
	}
	
	@After
	public void close() {
		driver.close();
	}
	
	@Given("que o usuário realize o login na aplicaçao saucedemo com o perfil \"standard_user\"")
	public void que_o_usuário_realize_o_login_na_aplicaçao_saucedemo_com_o_perfil_standard_user() {
		login.enterUsername("standard_user");
		login.enterPassword("secret_sauce");
		login.clickLoginButton();
	}
	
	@And("selecione um dos produtos pelo botão \"Add to cart\"")
	public void selecione_um_dos_produtos_pelo_botao_add_to_cart() {
		inicio.selectBackpack();
	}
    
	@When("clicar no icone carrinho de compra")
	public void clicar_no_icone_carrinho_de_compra(){
		inicio.clickCartButton();
		
	}
	
	@Then("o valor do produto no carrinho deverá ser igual ao valor da tela inicial")
	public void o_valor_do_produto_no_carrinho_deverá_ser_igual_ao_valor_da_tela_inicial() {
		String backpackPrice = cart.getPrice();
		String expected = "$29.99";
		assertEquals(expected, backpackPrice);
	}
	
	@And("realizar logout")
	public void realizar_logout() throws InterruptedException {
		inicio.logout();
	}

}
