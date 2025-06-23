package devdojologic.arrays;

// Calcule a multiplicação dos valores da diagonal principal de uma matriz quadrada.
//   *a / -5  4  -3 \
// M = |  -2  -5  1  |   main diagonal ab
//      \ 5   2  2  / *b

public class E19MultiArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        matrix[0][0] = -5; //
        matrix[0][1] = 4;
        matrix[0][2] = -3;
        matrix[1][0] = -2;
        matrix[1][1] = -5; //
        matrix[1][2] = 1;
        matrix[2][0] = 5;
        matrix[2][1] = 2;
        matrix[2][2] = 2; //

        String matrixView = "-5   4  -3 \n-2  -5   1\n 5   2   2";
        String mainDiag = "Main diagonal = matrix[0][0] x matrix[1][1] x matrix[2][2]";
        int matrixDiagMultip = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                matrixDiagMultip *= matrix[i][j];
                }
            }
        }
        System.out.println(matrixView + "\n" + mainDiag + " = " + matrixDiagMultip);
    }
}
