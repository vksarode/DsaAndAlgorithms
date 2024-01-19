package reverseAnArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        int A[] = readArray();
        print(A);
        A = reverse(A);
        print(A);

    }

    private static int[] reverse(int[] a){
        int temp = 0;
        for(int i=0, j=a.length -1; i< a.length /2; i++, j--){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return a;
    }

    public ArrayList<Integer> reverseArray(final List<Integer> A) {
        int temp=0;
        List<Integer> list = new  ArrayList<>(A);
        for(int i=0, j=A.size()-1; i< A.size() /2; i++, j--){
            temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
        return (ArrayList<Integer>) list;

    }

    private static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the Array:");
        int N = sc.nextInt();
        int A[] = new int[N];
        int i=0;

        System.out.println("Enter Array elements:");
        while (true){
            if(i>=N){
                break;
            }
            A[i] = sc.nextInt();
            i++;
        }
        return A;
    }
    public static void print(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println();

    }
}
