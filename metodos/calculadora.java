public class calculadora {
    

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("A soma entre " + numero1 + " + " + numero2 + " = " + resultado);
        
    }


    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("A subtração entre " + numero1 + " - " + numero2 + " = " + resultado);
        
    }


    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação entre " + numero1 + " X " + numero2 + " = " + resultado);
        
    }


    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("A divisão entre " + numero1 + " / " + numero2 + " = " + resultado);
        
    }
}
