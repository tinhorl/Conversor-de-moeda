O código apresentado implementa um conversor de moedas utilizando a API Exchangerate. O programa oferece um menu interativo para o usuário escolher as moedas de origem e destino, digitar o valor a ser convertido e visualizar o resultado.

Funcionalidades:

Conversão de moedas:

Permite converter valores entre diversas moedas, como BRL, USD, EUR, etc.
Utiliza a API Exchangerate para obter as taxas de câmbio atualizadas.

Menu interativo:

Apresenta um menu com opções para escolher as moedas e digitar o valor.
Valida a entrada do usuário para garantir que sejam valores numéricos válidos.
Exibe mensagens de erro em caso de entrada inválida.
Tratamento de erros:
Captura e trata exceções relacionadas à API e à entrada do usuário.
Exibe mensagens de erro informativas para o usuário.

Classes:

ApiConversor:

Responsável por realizar a conversão de moeda utilizando a API.
Implementa a lógica para chamar a API e processar a resposta.

Mensagens:

Armazena as strings de mensagem utilizadas no programa, como títulos, opções do menu e mensagens de erro.

MenuConsole:

Controla a interação com o usuário através do menu.
Exibe as opções do menu, recebe a entrada do usuário e valida a escolha.

Moeda:

Representa os detalhes da moeda convertida, incluindo código da moeda, valor convertido e taxa de câmbio.

OpcaoDoMenu:

Implementa as funções específicas para cada opção do menu de conversão.
Chama a classe ApiConversor para realizar a conversão e formata o resultado.

Principal:

Ponto de entrada do programa.
Instancia as classes necessárias, configura o menu e inicia o loop principal.
Apresentação:

O programa pode ser executado em um ambiente Java 17 e oferece uma interface de linha de comando amigável para o usuário.

Exemplo de execução:

*********************************************************
Bem vindo ao conversor de moedas
*********************************************************

1 - BRL (Real Brasileiro) --> USD (Dollar Americano)
2 - USD (Dollar Americano) --> BRL (Real Brasileiro)
3 - EUR (Euro) --> BRL (Real Brasileiro)
4 - BRL (Real Brasileiro) --> EUR (Euro)
5 - USD (Dollar Americano) --> EUR (Euro)
6 - EUR (Euro) --> USD (Dollar Americano)

Digite a opção desejada:

1

Digite o valor para conversão:
100

Valor: 100.0 corresponde ao valor final de --> USD 179.55
Observações:

O código utiliza a biblioteca com.google.gson para deserializar a resposta JSON da API.
As mensagens de erro podem ser personalizadas de acordo com as necessidades do usuário.
