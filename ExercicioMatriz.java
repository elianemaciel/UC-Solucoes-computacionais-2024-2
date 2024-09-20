package aula2009;

import java.util.Scanner;

public class ExercicioMatriz {
    public static void main(String[] args) {
        int NUMERO_LINHA = 4;
        int NUMERO_COLUNA = 3;
        Scanner entrada = new Scanner(System.in);
        int[][] numerosMatriz = new int[NUMERO_LINHA][NUMERO_COLUNA];

        int i = 0;

        for (i=0; i<NUMERO_LINHA; i++) {
            for(int j=0; j<NUMERO_COLUNA; j++){
                System.out.println("Digite o numero: ");
                numerosMatriz[i][j] = entrada.nextInt(); 
            }
        }
        imprimeMatriz(numerosMatriz, NUMERO_LINHA, NUMERO_COLUNA);
        for (i=0; i<NUMERO_LINHA; i++) {
            for(int j=0; j<NUMERO_COLUNA; j++) {
                if (numerosMatriz[i][j] % 2 == 0){
                    numerosMatriz[i][j] = 0;
                } else {
                    numerosMatriz[i][j] = 1;
                }
            }
        }
        imprimeMatriz(numerosMatriz, NUMERO_LINHA, NUMERO_COLUNA);
        entrada.close();
    }

    public static void imprimeMatriz(int[][] matriz, int linhas, int colunas){
        for (int i=0; i<linhas; i++) {
            for(int j=0; j<colunas; j++){
                System.out.print(" " + matriz[i][j]);
            }
            System.out.print("\n");
        }
    }

}
