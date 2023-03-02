package exerciciosFor;
import java.util.Scanner;

// interromper o laço quando colocar o 0 no local do nome.

public class exerciocio01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();

            if(nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();


        }

       System.out.println("Fim do laço de repetição");

    }
}