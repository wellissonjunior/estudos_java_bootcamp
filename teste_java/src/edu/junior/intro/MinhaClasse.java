package edu.junior.intro;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Wellisson";
        String segundoNome = "Junior";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
       
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return "O nome completo é " + primeiroNome.concat(" " + segundoNome);
    }
}
