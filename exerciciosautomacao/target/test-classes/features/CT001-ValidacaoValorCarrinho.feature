#Author: Vinicius Lara

Feature: ValidarValorCarrinho
	#@test
  Scenario:  validação dos valores no carinho (tela 04) de um produto qualquer no website: https://www.saucedemo.com/ ao final devemos fazer logout
    
    Given que o usuário realize o login na aplicaçao saucedemo com o perfil "standard_user"
    And selecione um dos produtos pelo botão "Add to cart"
    When clicar no icone carrinho de compra
    Then o valor do produto no carrinho deverá ser igual ao valor da tela inicial
    And realizar logout
