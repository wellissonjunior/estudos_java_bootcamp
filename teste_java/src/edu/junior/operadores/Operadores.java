package edu.junior.operadores;

public class Operadores {
    public static void main(String[] args) {

        //Concatenações
        System.out.println(5+5+" camisas");
        System.out.println(5+5+"5"+5+5);
        System.out.println("5"+ 5+5);
        
        //Positivar e negativar a variável
        int numero = 5;
        numero = - numero; // negativou
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero); //Positivou

        //Incremento e decremento
        
        int idade = 15;
        System.out.println(idade++);//acrescenta após a execução
        System.out.println(idade);//imprimiu o acréscimo da anterior
        System.out.println(++idade);// acrescenta antes de imprimir

        //Boleana de negação

        Boolean historia = true;
        System.out.println("Esta história é " + !historia);
        historia = !historia;
        System.out.println("Esta história é " + !historia);
    }

   
}

