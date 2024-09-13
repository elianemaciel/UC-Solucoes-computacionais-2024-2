package aula1309;

import java.util.Scanner;

/* A seguinte sequência de números 0 1 1 2 3 5 8 13 21...
é conhecida como série de Fibonacci. Nessa sequência,
cada número, depois dos 2 primeiros, é igual à soma dos 2 anteriores.
Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N
primeiros números dessa série. */
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int fibonacci;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scan.nextInt();
        if (numero > 0 && numero < 46) {
            System.out.printf("%d %d ", n1, n2);
            for (int i = 0; i<numero; i++) {
                fibonacci = n1 + n2;
                System.out.printf("%d ", fibonacci);
                n1 = n2;
                n2 = fibonacci;
            }
        }
        
        
    }
}
