package exerciciowhile;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 2;
        // Usando o while
        while (numero % 2 == 0) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
        }

        // Usando o do..while
        do {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
        } while (numero % 2 == 0);
    }
}
