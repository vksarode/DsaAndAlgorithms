package CarryForward;

public class CarryForward {
    public static void main(String[] args) {


        int[] A = {4,3,2,7,6,-2};
        int E[] = new int[A.length];
        int O[] = new int[A.length];

        // create event index elements sum array
        // create odd index elements sum array
        E[0] = A[0];
        O[0] = 0;
        for (int i = 1; i < A.length; i++) {
            if (i % 2 == 0) {
                E[i] = A[i] + E[i - 1];
                O[i] = O[i - 1];
            } else {
                E[i] = E[i - 1];
                O[i] = A[i] + O[i - 1];
            }
        }

        printArray(A);
        printArray(E);
        printArray(O);

        //iterate 0 to N, for each i, remove the element at index i get the sum of event and odd array
        // check if both the event and off array sum is same.  If sum is same, then i is the required index.
        int ES = 0;
        int OS = 0;

        for (int i = 0; i < A.length; i++) {
            if (i == 0) {
                ES = O[A.length - 1] - O[i];
                OS = E[A.length - 1] - E[i];
            } else {
                ES = E[i - 1] + O[A.length - 1] - O[i];
                OS = O[i - 1] + E[A.length - 1] - E[i];
            }
            if (ES == OS) {
                System.out.println(" perfect number is:" + i + " ES:" + ES + " OS:" + OS);
            } else {
                System.out.println(" i=" + i + " ES:" + ES + " OS:" + OS);
            }
        }
    }

    public static void printArray(int A[]) {
        System.out.println(" ---------------- ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(" ---------------- ");

    }
}
