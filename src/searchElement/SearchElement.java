package searchElement;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for number of test cases:");
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {

            System.out.println("Enter length of the array:");
            int N = sc.nextInt();

             int A[] = readArray(N);

            System.out.println("Enter Element to search:");
            int B = sc.nextInt();

            int r= searchElement(A, B);
            System.out.println("The element "+B+ (r==1 ? " present in the array " : " does not present in the array" ) );

        }
    }

    private static int searchElement(int[] a, int b) {
        int result = 0;
        for(int i=0; i< a.length; i++){
            if(b == a[i]){
                result = 1;
            }
        }
        return result;
    }

    private static int[] readArray(int N) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[N];
        int i = 0;
        System.out.println("Enter Array elements:");
        while (true) {
            if (i >= N) {
                break;
            }
            A[i] = sc.nextInt();
            i++;
        }
        return A;
    }

    public static void print(int A[]) {
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

    }
}
