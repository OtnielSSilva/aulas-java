package aula04;

public class Vetores1 {
    public static void main(String[] args) {
        int[] vetor = { 1, 34, 12, 79, 43, 67 };

        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                System.out.print(vetor[i] + " ");
            }
        }
        System.out.println();
    }
}
