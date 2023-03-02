package exerciciosFor;
import java.util.Scanner;

/*
 * Faça um programa que receba a idade de 15 pessoas e que calcule e mostre:
a) A quantidade de pessoas em cada faixa etária;
b) A percentagem de pessoas na primeira e na última faixa etária, com relação ao total de pessoas: 

    Até 15 anos
    De 16 a 30 anos
    De 31 a 45 anos
    De 46 a 60 anos
    Acima de 61 anos
 */


public class exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrada;
        int faixa1 = 0;
        int faixa2 = 0;
        int faixa3 = 0;
        int faixa4 = 0;
        int faixa5 = 0;
        double porcentagemFaixa1;
        double porcentagemFaixa5;

        for (int index = 1; index <= 15; index++) {
            System.out.println("Digite sua idade: ");
            entrada = scan.nextInt();

           if (entrada <= 15) {
            faixa1++;
           } else if(entrada > 15 && entrada <=30) {
            faixa2++;
           } else if(entrada > 30 && entrada <=45) {
            faixa3++;
           } else if(entrada > 45 && entrada <=60) {
            faixa4++;
           } else {
            faixa5++;
           }
        }

        porcentagemFaixa1 = (100*faixa1)/15;
        porcentagemFaixa5 = (100*faixa5)/15;

        System.out.println("Quantidade de pessoas na faixa 1: " + faixa1);
        System.out.println("Quantidade de pessoas na faixa 2: " + faixa2);
        System.out.println("Quantidade de pessoas na faixa 3: " + faixa3);
        System.out.println("Quantidade de pessoas na faixa 4: " + faixa4);
        System.out.println("Quantidade de pessoas na faixa 5: " + faixa5);
        System.out.println("Porcentagem na faixa 1: " + porcentagemFaixa1 + "%");
        System.out.println("Porcentagem na faixa 5: " + porcentagemFaixa5 + "%");


        }
    }
    

