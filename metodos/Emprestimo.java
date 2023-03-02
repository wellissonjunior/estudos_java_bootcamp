import java.util.Scanner;

public class Emprestimo {
    

    public static void Calcularemprestimo() {
        

        double taxaJuros = 0.25;
        double valor = 0;
        int parcelas=0;
        
        Scanner scan = new Scanner(System.in);

        double valorEmprestimo = ((valor*taxaJuros)+valor)/parcelas;

                
        System.out.println("Digite o valor para seu emprestimo: ");
        valor = scan.nextDouble();

        System.out.println("Digite a quantidade de parcelas: ");
        parcelas = scan.nextInt();

        System.out.println("Você pagará " + parcelas + " parcelas de " + valorEmprestimo + " reais");


    }
}
