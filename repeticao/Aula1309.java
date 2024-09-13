package aula1309;

import java.util.Scanner;

/*Faça um código que determine o maior entre N números.
A condição de parada é a entrada de um valor 0, ou seja,
o algoritmo deve ficar calculando o maior até
que a entrada seja igual a 0 (ZERO).
 */
public class Aula1309 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1;
        int maior = 0;
        while (numero != 0) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é " + maior);
    }
}
