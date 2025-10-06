package main;

import arvores.ArvoreAVL;

import java.util.Scanner;

public class menuAVL {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArvoreAVL avl = new ArvoreAVL();
        int opcao;

        do {

            System.out.println("0 - Sair");
            System.out.println("1 - Inserir");
            System.out.println("2 - Mostrar FB de cada Nó");
            System.out.println("3 - Remover Nó da AVL");
            opcao = entrada.nextInt();

            switch (opcao) {

                case 0:
                    System.out.println("Encerrando o programa");

                    break;
                case 1:
                    System.out.println("Informe o valor para inserir na ABB: ");
                    int valor = entrada.nextInt();

                    avl.root = avl.inserirAVL(avl.root, valor);
                    avl.atualizaAlturas(avl.root);

                    break;
                case 2:
                    System.out.println("\n Apresentação: ");

                    avl.mostraAVL(avl.root);

                    break;
                case 3:
                    System.out.println("Informe o valor a ser removido: ");
                    valor = entrada.nextInt();

                    avl.root = avl.removeValor(avl.root, valor);
                    avl.root = avl.atualizaAlturaBalanceamento(avl.root);
                    avl.atualizaAlturas(avl.root);

                    break;
                default:
                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

    }// main

}// class
