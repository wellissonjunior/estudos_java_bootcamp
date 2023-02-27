import java.util.Scanner;

//Faça um programa que verifique e mostre os números entre 1.000 e 2.000 (inclusive) que, quando divididos por 11 produzam resto igual a 2.


public class exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero = 1000;
        int numeroBuscado = 0;

        for (int index = numero; index < 2000; index++) {
            if (index%11 == 2) {
                numeroBuscado = index;
            }
           
        }
        System.out.println(numeroBuscado);
    }
}
