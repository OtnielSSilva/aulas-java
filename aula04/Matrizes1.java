package aula04;

public interface Matrizes1 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j % 2 == 0) {
                    matriz[i][j] = i + j;
                    System.out.printf("%2d", matriz[i][j]);
                } else {
                    matriz[i][j] = i - j;
                    System.out.printf("%2d", matriz[i][j]);
                }
            }
            System.out.println();
        }
    }
}
