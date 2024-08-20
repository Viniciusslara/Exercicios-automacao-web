package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;
import utils.Logger;
import utils.WebDriverManager;

public class CartSteps {
	
	private CartPage cart;
	private WebDriver driver = WebDriverManager.getDriver();
	private Logger logger; 
	
	public CartSteps() {
		cart = new CartPage(driver);
		logger = new Logger();
	}
	
	@Then("o valor do backpack no carrinho deverá ser igual ao valor da tela inicial")
	public void o_valor_do_backpack_no_carrinho_deverá_ser_igual_ao_valor_da_tela_inicial() {
		String backpackPrice = cart.getPrice();
		String expected = "$29.99";
		assertEquals(expected, backpackPrice);
		logger.takeScreenshot("ValidacaoValorCarrinhoBackpack");
	}
	
	@Then("o valor do bike no carrinho deverá ser igual ao valor da tela inicial")
	public void o_valor_do_produto_no_carrinho_deverá_ser_igual_ao_valor_da_tela_inicial() {
		String backpackPrice = cart.getPrice();
		String unexpected = "$8.99";
		assertNotEquals(unexpected, backpackPrice);
		logger.takeScreenshot("ValidacaoValorCarrinhoBike");
	}
	
	@And("clicar no botão \"Checkout\"")
	public void clicar_no_botao_checkout() {
		cart.ClickCheckoutButton();
		logger.takeScreenshot("ClicandoBotaoContinue");
	}

}
