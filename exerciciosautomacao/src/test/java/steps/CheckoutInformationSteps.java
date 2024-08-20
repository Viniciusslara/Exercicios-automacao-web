package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CheckoutInformationPage;
import utils.WebDriverManager;

public class CheckoutInformationSteps {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private CheckoutInformationPage checkform;
	
	public CheckoutInformationSteps() {
		checkform = new CheckoutInformationPage(driver);
	}
	
	@When("preencher o formulário de checkout")
	public void preencher_o_formulario_de_checkout() {
		checkform.enterFistName("Teste");
		checkform.enterLastName("Automatizado");
		checkform.enterPostalCode("00000000");
	}
	
	@And("clicar no botão \"Continue\"")
	public void clicar_no_botao_continue() {
		checkform.clickContinueButton();
	}

}
