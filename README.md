# Conversão de moedas:

O código apresentado implementa um conversor de moedas utilizando API Exchangerate. O programa oferece um menu interativo para o usuário escolher as moedas de origem e destino, digitar o valor a ser convertido e visualizar o resultado.

## Funcionalidades:

 **Conversão de moedas:**

Permite converter valores entre diversas moedas, como BRL, USD, EUR, etc. Utilize a API Exchangerate para obter as taxas de câmbio atualizadas.

**Menu interativo:**

Apresenta um menu com opções para escolher as moedas e digitar o valor. Valide a entrada do usuário para garantir que sejam valores numéricos válidos. Exibe mensagens de erro em caso de entrada inválida. Tratamento de erros: Captura e trata de abordagens relacionadas à API e à entrada do usuário. Exiba mensagens de erro informativas para o usuário.

## Classes:

**APIConversor:**

Responsável por realizar a conversão de moeda utilizando API. Implemente uma lógica para chamar a API e processar a resposta.

**Mensagens:**

Armazena as strings de mensagem utilizadas no programa, como títulos, opções do menu e mensagens de erro.

**MenuConsole:**

Controle a interação com o usuário através do menu. Exibe as opções do menu, recebe a entrada do usuário e valida a escolha.

**Moeda:**

Representa os detalhes da moeda convertida, incluindo código da moeda, valor convertido e taxa de câmbio.

**OpçãoDoMenu:**

Implementa as funções específicas para cada opção do menu de conversão. Chame a classe ApiConversor para realizar a conversão e formato o resultado.

**Principal:**

Ponto de entrada do programa. Instancia as classes permitidas, configura o menu e inicia o loop principal. Apresentação:

O programa pode ser executado em um ambiente Java 17 e oferece uma interface de linha de comando amigável para o usuário.
O código utiliza a biblioteca com.google.gson para desserializar a resposta JSON da API. As mensagens de erro podem ser personalizadas de acordo com as necessidades do usuário.
