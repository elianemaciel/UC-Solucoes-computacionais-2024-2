package aula2009;

import java.util.Scanner;

/* Construa um programa que armazene em um array 10 números informados pelo
usuario. Em seguida imprima a soma desses números. A soma deve ser realizada
após a leitura de todos os números. */
public class ExercicioVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int num, i;
        int soma = 0;

        for (i=0; i<10; i++) {
            System.out.println("Informe um número");
            num = entrada.nextInt();
            numeros[i] = num;
        }

        for (i=0; i<10; i++){
            soma += numeros[i];
        }

        System.out.println("A soma dos números é: " + soma);

        entrada.close();
    }
}
