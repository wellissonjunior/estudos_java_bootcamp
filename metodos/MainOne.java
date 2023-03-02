
public class MainOne {

        public static void main(String[] args) {
            calculadora.soma(8, 6);
            calculadora.subtracao(7.5, 5);
            calculadora.divisao(550, 2);
            calculadora.multiplicacao(7, 5);

            System.out.println("-----------------------------------");

            Mensagem.receberMensagem(15);
            Mensagem.receberMensagem(21);
            Mensagem.receberMensagem(9);

            System.out.println("-----------------------------------");

            Emprestimo.Calcularemprestimo();
        }
    
}