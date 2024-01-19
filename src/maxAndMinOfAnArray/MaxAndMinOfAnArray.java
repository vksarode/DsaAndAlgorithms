package maxAndMinOfAnArray;

import java.util.Scanner;

public class MaxAndMinOfAnArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int i=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (true){

            if(i>=N){
                break;
            }
            A[i] = sc.nextInt();
            if(A[i] > max){
                max = A[i];
            }
            if(A[i] < min){
                min = A[i];
            }
            i++;
        }


        print(A);

        System.out.println("Max:"+ max);
        System.out.println("Min:"+ min);
    }
    public static void print(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println();

    }
}
