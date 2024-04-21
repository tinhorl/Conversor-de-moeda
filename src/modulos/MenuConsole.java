package modulos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuConsole {

    private Scanner scanner;
    Mensagens mensagens = new Mensagens();

    public MenuConsole() {
        this.scanner = new Scanner(System.in);
    }

    public int exibirMenu(String[] opcoes) {

        System.out.println(mensagens.Titulo());
        for (int i = 0; i < opcoes.length; i++) {

            System.out.println((i + 1) + " - " + opcoes[i]);

        }
        try {
            System.out.print(mensagens.opcaoDesejada());


            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao < 1 || opcao > opcoes.length) {
                System.out.println(mensagens.opcaoInvalida());
                return exibirMenu(opcoes);
            } else if (opcao == opcoes.length) {
                System.out.println(mensagens.saindo());
                return 0;

            }

            return opcao;
        } catch (InputMismatchException e) {
            System.out.println(mensagens.opcaoInvalida());
            scanner.next();
            return exibirMenu(opcoes);
        }

    }


    public int exibirMenuComSair(String[] opcoes) {
        String[] opcoesComSair = new String[opcoes.length + 1 ];
        System.arraycopy(opcoes, 0, opcoesComSair, 0, opcoes.length);
        opcoesComSair[opcoes.length] = mensagens.sair();

        int opcao = exibirMenu(opcoesComSair);

        if ((opcao ) == opcoesComSair.length ) {
            System.out.println(mensagens.saindo());
            return opcoesComSair.length -1 ;
        }



        return opcao ; // Ajustar índice para começar em 0
    }

    public void fecharScanner() {
        scanner.close();
    }
}


