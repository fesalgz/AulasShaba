import java.util.Scanner;

public class ConversorTemp {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        char opcao = 'S';

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite a temperatura (em celsius) que você quer converter: ");
            celsius = sc.nextDouble();

            fahrenheit = ((9 * celsius) / 5) + 32;

            System.out.printf("A temperatura convertida é: %.1f °F", fahrenheit);
            System.out.println("\nDeseja continuar? (S/N)");
            opcao = sc.next().charAt(0);
        }  while (opcao != 'N');

        System.out.println("Obrigado por usar o conversor!");
        sc.close();
    }
}
