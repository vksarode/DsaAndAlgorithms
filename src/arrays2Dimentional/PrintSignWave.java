package arrays2Dimentional;

public class PrintSignWave {
    public static void main(String[] args) {
        int A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print2DArray(A);
        printSignWave(A);
    }

    private static void printSignWave(int[][] T) {
        int loop =0;
        int I = 0;
        int J = 0;
        for (int i = 0; i < T.length; i++) {
            for (int j = 0; j < T.length; j++) {

                if(loop%2 ==0){
                    I = j;
                    J=i;
                }else{
                    I=T.length -j -1;
                    J = i;
                }
//                System.out.print("I"+I+",J"+J+" "+T[I][J] + " ");
                System.out.print(T[I][J] + " ");
            }

            loop++;
            System.out.println();
        }
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
