package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.InicialPage;
import utils.Logger;
import utils.WebDriverManager;

public class InicialSteps {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private Logger logger; 
	private InicialPage inicio;
	
	public InicialSteps() {
		inicio = new InicialPage(driver);
		logger = new Logger();
	}
	
	@And("selecione um dos produtos pelo botão \"Add to cart\"")
	public void selecione_um_dos_produtos_pelo_botao_add_to_cart() {
		inicio.selectBackpack();
		logger.takeScreenshot("SelecionandoProduto");
	}
    
	@When("clicar no icone carrinho de compra")
	public void clicar_no_icone_carrinho_de_compra(){
		inicio.clickCartButton();
		logger.takeScreenshot("ClicandoNoCarrinho");
		
	}
	
	@And("realizar logout")
	public void realizar_logout() throws InterruptedException {
		inicio.clickBurgerMenu();
		Thread.sleep(1000);
		logger.takeScreenshot("Logout");
		inicio.clickLogoutButton();
		logger.takeScreenshot("Login");
		WebDriverManager.quitDriver();
	}

}
