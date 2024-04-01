package com.felipe.atividades;

import java.util.Scanner;

public class Banco2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        char opc;

        while (true) {

            System.out.println("Menu do banco: " +
                    "\n1. Depositar" +
                    "\n2. Sacar" +
                    "\n3. Transferir" +
                    "\n4. Ver Saldo" +
                    "\n0. Sair");
            System.out.println("Digite uma opção:");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Quantos você quer depositar?");
                    double dep = sc.nextDouble();

                    System.out.printf("Você depositou: R$%.2f", dep);
                    break;
                case 2:
                    System.out.println("Quantos você quer sacar?");
                    double sac = sc.nextDouble();

                    System.out.printf("Você sacou: R$%.2f", sac);
                    break;
                case 3:
                    System.out.println("Digite o nome para quem você vai transferir: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite o valor da transferência: ");
                    double transf = sc.nextDouble();

                    System.out.printf("Você transferiu R$%.2f para %s", transf, nome);
                    break;
                case 4:
                    System.out.println("Seu saldo é de R$ 10.000,00");
                    break;
                case 0:
                    System.out.println("Obrigado por usar o banco shabaray!");
                    break;
                default:
                    System.out.println("Digite uma operação válida!");
                    break;
            }

            if (opcao == 0) {
                break;
            } else {
                System.out.println("Deseja fazer outra operação? (s/n)");
                opc = sc.next().toLowerCase().charAt(0);
                if (opc == 'n') {
                    System.out.println("Obrigado por usar o banco shabaray!");
                    break;
                }
            }
        }
    }
}
