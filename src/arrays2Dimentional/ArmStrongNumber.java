package arrays2Dimentional;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int[][] A = get2DArray();
        int[][] B = get2DArray();
        int[][] C = solve(A, B);

        print2DArray(C);

    }

    private static int[][] get2DArray() {
        System.out.println("Enter 2D array elements");
        int N = 3;
        int[][] A = new int[1][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 4; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        return A;
    }

    public static int[][] solve(int[][] A, int[][] B) {

        int C[][] = new int[A.length][B.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        return C;
    }

    public static void print2DArray(int T[][]) {
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {
                System.out.print(T[i][j] + " ");
            }
            System.out.println();
        }
    }

}
