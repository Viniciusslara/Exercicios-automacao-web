#Author: Vinicius Lara

#CABEÇAÇHO

#Funcionalidade: Validação dos Valores no Carrinho de Compras

# ----------------------------------------------------------------------------------------------------------------------------------

#DESCRIÇÃO DA FUNCIONALIDADE

# A funcionalidade de validação dos valores no carrinho de compras tem como objetivo garantir que os valores exibidos 
# no carrinho estejam corretos e correspondam aos preços dos produtos adicionados.

# ----------------------------------------------------------------------------------------------------------------------------------

# CONTEXTO
# No cenário do site Sauce Demo, o carrinho de compras é uma área crítica onde os usuários podem visualizar os produtos que adicionaram 
# e proceder para o checkout. É fundamental que as informações exibidas sejam precisas para garantir uma experiência de compra confiável. 
# A funcionalidade de validação dos valores no carrinho garante que o sistema exiba corretamente os valores de cada produto.

# ----------------------------------------------------------------------------------------------------------------------------------

Feature: ValidarValorCarrinho

  Scenario Outline:  validação dos valores no carinho (tela 04) de um produto qualquer no website: https://www.saucedemo.com/ ao final devemos fazer logout
    
    Given que o usuário realize o login na aplicaçao saucedemo com o perfil "standard_user"
    And selecione o produto <produto> pelo botão "Add to cart"
    When clicar no icone carrinho de compra
    Then o valor do <produto> no carrinho deverá ser igual ao valor da tela inicial
    And realizar logout
    
    Examples:
    | produto  |
    | backpack |
    | bike     |
    
