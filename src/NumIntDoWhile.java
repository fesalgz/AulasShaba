import java.util.Scanner;

public class NumIntDoWhile {
    public static void main(String[] args) {
        int numero, soma = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números inteiros, para que eles sejam somados" +
                "\nquando digitar 0, eles somarão automatico.");
         do{
             System.out.println("Digite o numero: ");
             numero = sc.nextInt();

             if (numero == 0){
                 System.out.println("A soma é: " + soma);
                 break;
             } else {
                 soma += numero;
             }
         } while (true);


    }
}
