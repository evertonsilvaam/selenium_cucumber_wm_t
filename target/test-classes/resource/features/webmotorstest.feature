# language: pt

Funcionalidade: Realizando Buscas

Cenário: Realizar busca com dados
Dado que a modal esteja sendo exibida
Quando o campo de busca sejam preenchidos da seguinte forma
| marca  | <marca>   |
|modelo  | <modelo> |    
E for realizado o busca
Então deve ser mostrado os modelos de carro Honda City
Exemplos:
| dados      | marca      | modelo   | 
| campos     | honda      | city     | 

Cenário: Realizar busca por Honda City selecionando por uma cidade
Dado que o resultado da busca está sendo exibida
Quando é inserido o valor Brasília no campo Localização
Então deve ser possível ver a lista de carros “Honda City” no estoque de Brasília.

Cenário: Realizar busca por Honda City selecionando uma versão
Dado que o resultado da busca está sendo exibida
Quando é selecionado uma <versao>
|  versao   | Honda City 1.5 Dx 16v Flex 4p Automático |
Então deve ser possível ver a lista de carros “Honda City” no estoque de Brasília com a versão selecionada.

Cenário: Filtrar o resultado da busca por loja
Dado que o resultado da busca está sendo exibida
Quando o vendedor selecionado é uma loja
Então deve ser possível ver a lista de carros “Honda City” no estoque de Brasília com a versão selecionada somente inseridas por lojas.

Cenário: Filtrar o resultado da busca por concessionária
Dado que o resultado da busca está sendo exibida
Quando o vendedor selecionado é uma loja que é uma concessionária
Então deve ser possível ver a lista de carros “Honda City” no estoque de Brasília com a versão selecionada somente inseridas por lojas concessionárias.