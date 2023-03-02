package exerciciosFor;
import java.util.Scanner;

//Faça um programa que receba a idade de dez pessoas, que calcule e mostre a quantidade de pessoas com idade maior ou igual a 18 anos.

public class exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero;
        int maiorIdade = 0;

        for (int index = 1; index < 11; index++) {
            System.out.println("Digite sua idade:");
            numero = scan.nextInt();

            if (numero >= 18) {
                maiorIdade++;
            }
            
        }

        System.out.println("Número de pessoas com mais de 18 anos: " + maiorIdade);
    }
}
