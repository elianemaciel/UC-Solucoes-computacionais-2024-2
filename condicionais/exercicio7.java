package exercicio;
import java.util.Scanner;

public class Exercicio7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Digite a terceira: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Digite a quarta: ");
        double nota4 = scanner.nextDouble();
        double soma = nota1 + nota2 + nota3 + nota4;

        double menorNota = nota1;
        
        if (nota2 < menorNota) {
            menorNota = nota2;
        }
        if (nota3 < menorNota) {
            menorNota = nota3;
        }
        if (nota4 < menorNota) {
            menorNota = nota4;
        }
        soma = soma - menorNota;
        double media = soma / 3;
        System.out.printf("A média é: %.2f", media);
    }
}
