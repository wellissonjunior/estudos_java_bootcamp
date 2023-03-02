package exerciciosFor;
import java.util.Scanner;

// Faça um programa que mostre as tabuadas dos números de 1 a 10 usando laços de repetição.


public class exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));


        int numeroTabuada;

        System.out.println("Digite seu número: ");
        numeroTabuada = scan.nextInt();
        System.out.println("A tabuada do " + numeroTabuada + ":");

        for (int index = 0; index < 11; index++) {
           
            System.out.println(numeroTabuada + " X " + index + " = " + (numeroTabuada*index));
        }
    }
}
