package modulos;

public class Mensagens {
    public String Titulo () {

        String tituloInicial = """
                
                *********************************************************
                          Bem vindo ao conversor de moedas
                *********************************************************
        """;


        return tituloInicial;

    }

    public String opcoes1(){

        String option = "BRL (Real Brasileiro)  -->  USD (Dollar Americano)";
        return option;

    }
    public String opcoes2(){

        String option = "USD (Dollar Americano) -->  BRL (Real Brasileiro)";
        return option;

    }
    public String opcoes3(){

        String option = "EUR (Euro) -->  BRL (Real Brasileiro)";
        return option;

    }
    public String opcoes4(){

        String option = "BRL (Real Brasileiro)  --> EUR (Euro)";
        return option;

    }

    public String opcoes5(){

        String option = "USD (Dollar Americano) --> EUR (Euro)";
        return option;

    }

    public String opcoes6(){

        String option = "EUR (Euro) --> USD (Dollar Americano)";
        return option;

    }
    public String sair(){

        String option = "Sair";
        return option;

    } public String saindo(){

        String option = "Saindo do programa...";
        return option;

    }



    public String opcaoDesejada(){

        String option = "\nDigite a opção desejada: ";
        return option;

    }

    public String opcaoInvalida(){

        String option = "Opção inválida. Tente novamente: ";
        return option;

    }


    public String mensagemParaConversao() {

        String valorParaConversao = """
                Digite o valor para conversão:
                """;
        return valorParaConversao;

    }

    public String valor(){
        String valor = "Valor: ";
        return valor;
    }

    public String espaco(){
        String espaco = " ";
        return espaco;
    }

    public String valorFinal(){
        String valorFinal = " corresponde ao valor final de --> ";
        return valorFinal;
    }

    public String erroValor(){
        String erroValor = "Valor invalido, Tente novamente:";
        return erroValor;
    }


}

