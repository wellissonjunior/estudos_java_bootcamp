package exerciciosArray;

import java.util.Random;

/*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0 e 9. */


public class Arrey04 {
    
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizMulti = new int[4][4];

        for (int index = 0; index < matrizMulti.length; index++) {
            for (int j = 0; j < matrizMulti[index].length; j++) {
                matrizMulti[index][j] = random.nextInt(9);
            }
        }

        for (int[] linha : matrizMulti) {
            for (int coluna : linha) {
                System.out.print(coluna+" ");
            }
            System.out.println();
        }

    }
}
