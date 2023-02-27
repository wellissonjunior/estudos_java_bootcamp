import java.util.Scanner;

public class exercicio03 {
    
    /*
     * Faça um programa que leia 5 números e informe o maior número e a média desses números
     */

     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0; 
        int soma = 0;
       

        do {
         System.out.println("Digite um número: ");
         numero = scan.nextInt();

         if (numero > maior) {
            maior = numero;
         };

         soma = soma + numero;

         count ++;
        } while (count < 5);

        System.out.println("O maior número foi: " + maior);
        System.out.println("A média foi: " + (soma/5));

            
     }


}
