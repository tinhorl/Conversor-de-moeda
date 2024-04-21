package principal;

import modulos.Mensagens;
import modulos.MenuConsole;
import modulos.OpcaoDoMenu;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Mensagens mensagens = new Mensagens();
        String[] opcoesMenu = {mensagens.opcoes1(), mensagens.opcoes2(), mensagens.opcoes3(), mensagens.opcoes4(), mensagens.opcoes5(), mensagens.opcoes6()};
        OpcaoDoMenu opcao = new OpcaoDoMenu();
        MenuConsole menu = new MenuConsole();


        int opcaoEscolhida;

        do {
            opcaoEscolhida = menu.exibirMenuComSair(opcoesMenu);



            switch (opcaoEscolhida) {

                case 1:
                    System.out.println(opcao.opcao1());
                    break;
                case 2:
                    System.out.println(opcao.opcao2());
                    break;
                case 3:
                    System.out.println(opcao.opcao3());
                    break;
                case 4:
                    System.out.println(opcao.opcao4());
                    break;
                case 5:
                    System.out.println(opcao.opcao5());
                    break;
                case 6:
                    System.out.println(opcao.opcao6());
                    break;


            }
        } while (opcaoEscolhida != 0);

        menu.fecharScanner();
        opcao.fecharValor();
    }
}
