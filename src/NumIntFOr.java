import java.util.Scanner;

public class NumIntFOr {
    public static void main(String[] args) {
        int numero, soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números inteiros, para que eles sejam somados" +
                "\nquando digitar 0, eles somarão automatico.");

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite o numero: ");
            numero = sc.nextInt();
            i = i-1;

            if (numero == 0){
                System.out.println("A soma é: " + soma);
                break;
            } else {
                soma += numero;
            }
        }

        sc.close();

    }
}
