import java.util.Scanner;

public class exercicio02 {

    /*Faça um programa que peça uma nota entre 10 e 0
     * Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido
     * 
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota <0 || nota > 10) {
            System.out.println("Nota inválida. Digite uma nota entre 0 e 10 ");
            System.out.println("Nota: ");
        nota = scan.nextInt();
        }


    }
}
