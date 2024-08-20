#Author: Vinicius Lara

#CABEÇALHO

# Funcionalidade: Validação do Valor Total da Compra e Realização do Checkout

#-------------------------------------------------------------------------------------------------------------------------------------------------------------

# DESCRIÇÃO DA FUNCIONALIDADE

# A funcionalidade de validação do valor total da compra e a realização do checkout tem como objetivo assegurar que o sistema 
# calcula corretamente o total da compra, incluindo a verificação do valor final na página de checkout. Além disso, deve garantir que o processo 
# de checkout funcione corretamente, com a coleta e processamento das informações de pagamento e envio. O objetivo é garantir que os usuários possam 
# completar uma compra com precisão e que os valores cobrados estejam corretos.

#---------------------------------------------------------------------------------------------------------------------------------------------------------------

# CONTEXTO

# No contexto do site Sauce Demo, o processo de checkout é um fluxo crítico onde os usuários revisam o total da compra antes de concluir a transação. 
# É fundamental que o total final exibido na página de checkout corresponda ao valor calculado a partir dos produtos no carrinho e que o processo de checkout 
# permita que o usuário finalize a compra com sucesso.

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
    
    

