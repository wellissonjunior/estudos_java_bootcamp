import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 */


public class exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




        int numero;
        int novoNumero = 1;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

      for (int index = numero; index > 0; index--) {
        novoNumero = novoNumero*index;
        
      }
      System.out.println("Fatorial " + numero +"!" + " = " +(novoNumero));
    }
}
