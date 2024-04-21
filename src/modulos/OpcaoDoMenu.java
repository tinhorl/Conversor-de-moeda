package modulos;

import java.io.IOException;
import java.util.Scanner;

public class OpcaoDoMenu {


    Mensagens mensagens = new Mensagens();
    Scanner valor = new Scanner(System.in);

    public String opcao1() throws IOException, InterruptedException {
        System.out.println(mensagens.mensagemParaConversao());
        var leitura = valor.nextLine().replace(",", ".");
        ApiConversor conversor = new ApiConversor();
        return conversor.conversao(leitura, "BRL", "USD");


    }

    public String opcao2() throws IOException, InterruptedException {
        System.out.println(mensagens.mensagemParaConversao());
        var leitura = valor.nextLine().replace(",", ".");
        ApiConversor conversor = new ApiConversor();
        return conversor.conversao(leitura, "USD", "BRL");

    }

    public String opcao3 () throws IOException, InterruptedException {
        System.out.println(mensagens.mensagemParaConversao());
        var leitura = valor.nextLine().replace(",", ".");
        ApiConversor conversor = new ApiConversor();
        return conversor.conversao(leitura, "EUR", "BRL");

    }

    public String opcao4 () throws IOException, InterruptedException {
        System.out.println(mensagens.mensagemParaConversao());
        var leitura = valor.nextLine().replace(",", ".");
        ApiConversor conversor = new ApiConversor();
        return conversor.conversao(leitura, "BRL", "EUR");

    }
    public String opcao5() throws IOException, InterruptedException {
        System.out.println(mensagens.mensagemParaConversao());
        var leitura = valor.nextLine().replace(",", ".");
        ApiConversor conversor = new ApiConversor();
        return conversor.conversao(leitura, "USD", "EUR");

    }

    public String opcao6() throws IOException, InterruptedException {
        System.out.println(mensagens.mensagemParaConversao());
        var leitura = valor.nextLine().replace(",", ".");
        ApiConversor conversor = new ApiConversor();
        return conversor.conversao(leitura, "EUR", "USD");

    }



    public void fecharValor(){
        valor.close();
    }


}
