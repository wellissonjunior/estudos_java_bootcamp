package exerciciosArray;

import java.util.Random;

/*Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
 * Ao final mostre os números e seus sucessores.
 */


public class Array03 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int index = 0; index < numerosAleatorios.length; index++) {
            int numero = random.nextInt(100);
            numerosAleatorios[index] = numero;
        }
        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.println("\nSucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+1 + " ");
        }
        
    }
}
