package steps;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pages.CheckoutOverviewPage;
import utils.WebDriverManager;

public class CheckoutOverviewSteps {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private CheckoutOverviewPage checkoverview;
	
	public CheckoutOverviewSteps() {
		checkoverview = new CheckoutOverviewPage(driver);
	}
	
	
	@Then("o valor total da compra deve consistir na soma do\\(s) produto\\(s) com a taxa")
	public void o_valor_total_da_compra_deve_consistir_na_soma_do_produto_com_a_taxa() {
		String backpackPrice = checkoverview.getPrice();
		String expected = "Total: $32.39";
		assertEquals(expected, backpackPrice);
	}
	

}
