package com.felipe.atividades;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declaração das variaveis
        String opcao;
        char opc = 's';

        while (true) {
        //sout - scanner das opçoes
        System.out.println("============================================" +
                "\nBem vindo ao banco Shabaray!" +
                "\nTemos as seguintes opções:" +
                "\n - Consultar Saldo" +
                "\n - Depositar" +
                "\n - Sacar" +
                "\n - Transferir" +
                "\n - Sair" +
                "\n============================================" +
                "\nSelecione sua opção:");
        opcao = sc.nextLine().toLowerCase();

        //switch-case com as opções
        switch (opcao) {
            case "consultar saldo":
                System.out.println("====================Saldo=================" +
                        "\nSeu saldo é de: R$ 12.140,000" +
                        "\n============================================");
                break;
            case "depositar":
                System.out.println("===============Depósito================" +
                        "\nDigite quantos você quer depositar: ");
                double dep = sc.nextDouble();
                System.out.printf("\nVocê depositou R$ %.2f", dep);
                System.out.println("\n============================================");
                break;
            case "sacar":
                System.out.println("====================Sacar=================" +
                        "\nDigite quantos você quer sacar: ");
                double sac = sc.nextDouble();
                System.out.printf("\nVocê sacou R$ %.2f", sac);
                System.out.println("\n============================================");
                break;
            case "transferir":
                System.out.println("================Transferir===============" +
                        "\nDigite o nome para quem você quer transferir:");
                String nome = sc.nextLine();
                System.out.println("\nAgora digite o valor da transferência:");
                double transf = sc.nextDouble();
                System.out.printf("\nVocê transferiu R$ %.2f para %s.", transf, nome);
                System.out.println("\n============================================");
                break;
            default:
                break;

        }
        
        System.out.println("Deseja fazer outra operação? (s/n)");
        opc = sc.next().toLowerCase().charAt(0);
        if (opc == 'n') {
            System.out.println("Obrigado por usar o Banco Shabaray!");
            break;
        }
        }
    }
}
