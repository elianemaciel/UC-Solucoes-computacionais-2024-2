package aula1309;

import java.util.Scanner;

/* Construa um programa que leia o conjunto de
20 números inteiros e mostre qual
foi o maior e o menor valor fornecido */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = 1;
        int maior = 0;
        int menor = 99999999;
        for(int i=0; i<20; i++){
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior número é " + maior);
        System.out.println("o menor número é " + menor);
    }
}
