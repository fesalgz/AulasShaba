package com.felipe.atividades;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, result;
        int opc;
        char opc1;

        while (true) {
            System.out.println("Calculadora Shabaray" +
                    "\n1 - Adição" +
                    "\n2 - Subtração" +
                    "\n3 - Multiplicação" +
                    "\n4 - Divisão");

            System.out.println("Escolha a operação (1/2/3/4)");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Digite o Primeiro Número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o Segundo Número: ");
                    num2 = sc.nextDouble();

                    result = num1 + num2;

                    System.out.printf("O resultado é: %.2f", result);
                    break;
                case 2:
                    System.out.println("Digite o Primeiro Número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o Segundo Número: ");
                    num2 = sc.nextDouble();

                    result = num1 - num2;

                    System.out.printf("O resultado é: %.2f", result);
                    break;
                case 3:
                    System.out.println("Digite o Primeiro Número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o Segundo Número: ");
                    num2 = sc.nextDouble();

                    result = num1 * num2;

                    System.out.printf("O resultado é: %.2f", result);
                    break;
                case 4:
                    System.out.println("Digite o Primeiro Número: ");
                    num1 = sc.nextDouble();
                    System.out.println("Digite o Segundo Número: ");
                    num2 = sc.nextDouble();

                    result = num1 / num2;

                    System.out.printf("O resultado é: %.2f", result);
                    break;
                default:
                    System.out.println("Digite uma operação válida.");
                    break;
            }

            System.out.println("\nDeseja fazer outra operação? (s/n)");
            opc1 = sc.next().toLowerCase().charAt(0);

            if (opc1 == 'n') {
                break;
            }
            sc.close();
        }
    }
}
