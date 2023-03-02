public class Mensagem {
    
    public static void receberMensagem(int hora) {
        if (hora > 12 && hora < 18) {
            System.out.println("Good afternon!!!");
        } else if (hora >= 18 && hora <= 24) {
            System.out.println("Good evernig!!!");
        } else {
            System.out.println("Good morning!!!");
        }
        
    }
}
