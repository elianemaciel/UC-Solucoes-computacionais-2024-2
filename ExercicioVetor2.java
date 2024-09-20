package aula2009;

import java.util.Scanner;

/*Construa um programa que armazene em um array as notas
de 10 alunos. Em seguida
imprima qual foi a maior nota */
public class ExercicioVetor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] notas = new int[10];
        int nota, i;
        int maior = 0;

        for (i=0; i<10; i++) {
            System.out.println("Informe um número");
            notas[i] = entrada.nextInt();
        }
        for (i=0; i<10; i++) {
            if(notas[i] > maior) {
                maior = notas[i];
            } 
        }
        System.out.println("O maior valor é :" + maior);
    }
}
