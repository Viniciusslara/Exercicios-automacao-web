#Author: Vinicius Lara

Feature: ValidarTotalCompra

  Scenario: validar o valor total da compra após o login até tela 07 checkout-complete e no final efetuar o logout
    
    Given que o usuário realize o login na aplicaçao saucedemo com o perfil "standard_user"
    And selecione um dos produtos pelo botão "Add to cart"
    And clicar no icone carrinho de compra
    And clicar no botão "Checkout"
    When preencher o formulário de checkout
    And clicar no botão "Continue"
    Then o valor total da compra deve consistir na soma do(s) produto(s) com a taxa
    And realizar logout

