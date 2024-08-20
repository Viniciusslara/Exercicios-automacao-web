package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CheckoutInformationPage;
import utils.Logger;
import utils.WebDriverManager;

public class CheckoutInformationSteps {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private CheckoutInformationPage checkform;
	private Logger logger;
	
	public CheckoutInformationSteps() {
		checkform = new CheckoutInformationPage(driver);
		logger =  new Logger();
	}
	
	@When("preencher o formulário de checkout")
	public void preencher_o_formulario_de_checkout() throws InterruptedException {
		checkform.enterFistName("Teste");
		checkform.enterLastName("Automatizado");
		checkform.enterPostalCode("00000000");
		Thread.sleep(1000);
		logger.takeScreenshot("FormularioCheckout");
		
	}
	
	@And("clicar no botão \"Continue\"")
	public void clicar_no_botao_continue() {
		checkform.clickContinueButton();
		logger.takeScreenshot("ClicandoBotaoContinue");
	}

}
