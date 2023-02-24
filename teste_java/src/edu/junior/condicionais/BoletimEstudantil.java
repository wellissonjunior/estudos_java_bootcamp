package edu.junior.condicionais;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if (mediaFinal>6) {
            System.out.println("APROVADO");
            
        } else {
            System.out.println("REPROVADO");
        }
    
    //Operador ternário

        String resultado = mediaFinal>6 ? "Aprovado" : "Reprovado";
        int resultadoInteiro = mediaFinal>6 ? 0 : 1;

        System.out.println(resultado);
        System.out.println(resultadoInteiro);

        //Condicional &&

        boolean condicional1 = true;

        boolean condicional2 = false;

        if (condicional1 && condicional2) {
            System.out.println("As duas condicionais são verdadeiras");
        } else {
            System.out.println("As duas, ou uma das duas condicionais são falsas");
        }
                  
    }

}
