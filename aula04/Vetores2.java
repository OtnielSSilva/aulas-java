package aula04;
import java.util.Scanner;

public class Vetores2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] vetor = new int[3];
        int maior = Integer.MIN_VALUE;

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = teclado.nextInt();
            if(vetor[i] > maior)
                maior = vetor[i];
        }
        teclado.close();
        System.out.println("Maior número é: " + maior);
    }
}
