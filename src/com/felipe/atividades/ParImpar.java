package com.felipe.atividades;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, div;

        while (true) {
            System.out.println("Digite um número inteiro (Digite 0 para sair): ");
            numero = sc.nextInt();

            div = numero % 2;

            if (div == 1) {
                System.out.println("Esse número é impar!");
            } else {
                System.out.println("Esse número é par!");
            }

            if (numero == 0){
                System.out.println("Finalizando o Programa!");
                break;
            }
        }
        sc.close();
    }
}
