import java.util.Scanner;

public class exercicio04 {
    /*
     * Faça um programa que peça N números inteiros, calcule e mostre a quantidade de número pares e a quantidade de número impares.
     */


     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int par = 0;
        int impar = 0;

        int count = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero%2 != 0) {
                impar ++;
            } else {
                par++;
            };

            count++;
            
        } while (count < quantidadeNumeros);

        System.out.println("Quantidade de numeros impares: " + impar);
        System.out.println("Quantidade de numeros pares: " + par);

     }
}
