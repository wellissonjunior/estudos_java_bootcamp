package exerciciosArray;

import java.util.Scanner;

/*Faça um programa que leia um vetor de 6 caracteres
 * e diga quantas consoantes foram lidas.
 * imprima as consoantes.
 */

public class Array02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantidadeConsoantes = 0;
        String letra;

        int count = 0;

         do {
            System.out.println("Digite uma letra: ");
            letra = scan.next();

            if (!(letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u"))) {
              consoantes[count]  = letra;
              quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        for (String apenasConsoante : consoantes) {

            if (apenasConsoante!= null) {
                System.out.print(apenasConsoante + " ");
            }
            
        }
        System.out.println("Quantidade de consoantes: "+ quantidadeConsoantes);
    }
}
 