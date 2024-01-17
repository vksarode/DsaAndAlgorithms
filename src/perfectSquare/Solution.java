package perfectSquare;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve(9));
    }
    public static int solve(int A) {

        Scanner s = new Scanner(System.in);
      
        int sq =1;
        for(int i=1; i*i<=A; i++){
            if( (i*i) == A){
                sq = i;
                break;
            }else if((i*i) > A){
                sq = -1;
                break;
            }
        }
        return sq;
    }
}
