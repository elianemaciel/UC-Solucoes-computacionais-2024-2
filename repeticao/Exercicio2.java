import java.util.Scanner;

/* Escreva um código que some os números entre 1 e 10,
escrevendo o resultado
final; */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        double nota;
        double media = 0.0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a nota:");
            nota = scanner.nextDouble();
            soma += nota;
        }
        media = soma / 10;
        System.out.println("A media é " + media);

        scanner.close();
    }
}
