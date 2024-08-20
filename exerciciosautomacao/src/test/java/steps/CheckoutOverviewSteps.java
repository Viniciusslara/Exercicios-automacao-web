package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CheckoutOverviewPage;
import utils.Logger;
import utils.WebDriverManager;

public class CheckoutOverviewSteps {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private CheckoutOverviewPage checkoverview;
	private Logger logger;
	
	public CheckoutOverviewSteps() {
		checkoverview = new CheckoutOverviewPage(driver);
		logger = new Logger();
	}
	
	
	@Then("o valor total da compra deve consistir na soma do backpack com a taxa")
	public void o_valor_total_da_compra_deve_consistir_na_soma_do_backpack_com_a_taxa() {
		String backpackPrice = checkoverview.getPrice();
		String expected = "Total: $32.39";
		logger.takeScreenshot("ValidacaoValorTotalCliente1");
		assertEquals(expected, backpackPrice);
	}
	
	@Then("o valor total da compra deve consistir na soma do bike com a taxa")
	public void o_valor_total_da_compra_deve_consistir_na_soma_do_bike_com_a_taxa() {
		String backpackPrice = checkoverview.getPrice();
		String expected = "Total: $10.79";
		logger.takeScreenshot("ValidacaoValorTotalCliente2");
		assertEquals(expected, backpackPrice);
	}
	
	@And("clicar no botão \"Finish\"")
	public void clicar_no_botao_finish() throws InterruptedException {
		checkoverview.clickFinishButton();
		Thread.sleep(1000);
		logger.takeScreenshot("CheckoutComplete");
		String textComplete =  checkoverview.getTextComplete();
		String expected = "Thank you for your order!";
		assertEquals(expected, textComplete);
		
	}
	

}
