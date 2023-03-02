//Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.


package exerciciosArray;

public class Array01 {
    public static void main(String[] args) {
        
        int vetor[] = {5, -9, 8, 2, 25, -15};

        int count = 0;
        System.out.println("Vetor: ");
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("Vetor: ");
        for (int index = vetor.length-1; index >=-0; index--) {
            System.out.print(vetor[index] + " ");
            
        }
    }
}
