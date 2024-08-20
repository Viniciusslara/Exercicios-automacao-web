package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.InicialPage;
import utils.WebDriverManager;

public class InicialSteps {
	
	private WebDriver driver = WebDriverManager.getDriver();
	private InicialPage inicio;
	
	public InicialSteps() {
		inicio = new InicialPage(driver);
	}
	
	@And("selecione um dos produtos pelo botão \"Add to cart\"")
	public void selecione_um_dos_produtos_pelo_botao_add_to_cart() {
		inicio.selectBackpack();
	}
    
	@When("clicar no icone carrinho de compra")
	public void clicar_no_icone_carrinho_de_compra(){
		inicio.clickCartButton();
		
	}
	
	@And("realizar logout")
	public void realizar_logout() throws InterruptedException {
		inicio.logout();
		WebDriverManager.quitDriver();
	}

}
