package exerciciosFor;
import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada capaz de gerar a tabuada de um número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele deseja a tabuada.
 */


public class exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeroEscolhido;

        
        System.out.println("Digite um número: ");
        numeroEscolhido = scan.nextInt();

        System.out.println("Tabuada de " + numeroEscolhido);

        for (int index = 0; index <= 10; index++) {

           System.out.println(numeroEscolhido + " X " + index + " = " +(numeroEscolhido*index));
            
        }





    }
}
