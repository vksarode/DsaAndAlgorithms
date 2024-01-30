package rotateArray;

/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.
 *******************************************************************************/

public class RotateArray_Sol_1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int N = 3;
        int A[] = {1, 2, 3, 4, 5};
        int B[] = new int[A.length];

        int R = N % A.length;
        System.out.println("N:" + N);
        for (int i = 0, j = A.length - R; j < A.length; i++, j++) {
            B[i] = A[j];

        }

        print(B);
        for (int i = R, j = 0; j < A.length - R; i++, j++) {
            B[i] = A[j];
        }
        print(B);
        System.out.println("\n---------------");
        // print(B);

    }

    public static void print(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }
}
