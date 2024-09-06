import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int A = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int B = scanner.nextInt();
        System.out.print("Digite o terceiro numero: ");
        int C = scanner.nextInt();

        int maior = A;
        String valorMaior = "A";

        if (B>maior) {
            maior = B;
            valorMaior = "B";
        }
        if (C>maior) {
            maior = C;
            valorMaior = "C";
        }

        System.out.println("O valor maior é " + maior + valorMaior);

    }
}
