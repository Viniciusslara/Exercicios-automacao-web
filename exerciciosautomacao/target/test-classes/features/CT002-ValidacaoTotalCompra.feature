#Author: Vinicius Lara

Feature: ValidarTotalCompra
	
  Scenario Outline: validar o valor total da compra após o login até tela 07 checkout-complete e no final efetuar o logout
    
    Given que o usuário realize o login na aplicaçao saucedemo com o perfil "standard_user"
    And selecione o produto <produto> pelo botão "Add to cart"
    And clicar no icone carrinho de compra
    And clicar no botão "Checkout"
    When preencher o formulário de checkout cliente <cliente> 
    And clicar no botão "Continue"
    Then o valor total da compra deve consistir na soma do <produto> com a taxa
    And clicar no botão "Finish"
    And realizar logout
    
    Examples:
    | produto  | cliente |
    | backpack | teste1  |
    | bike     | teste2  |
    
    

