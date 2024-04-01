import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        int numero, soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números inteiros, para que eles sejam somados" +
                "\nquando digitar 0, eles somarão automatico.");

        while (true) { // while (true) sempre fica executando
            System.out.println("Digite o número - ");
            numero = sc.nextInt();

            if (numero == 0) { //
                break;
            }

            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);
        sc.close();

    }
}
