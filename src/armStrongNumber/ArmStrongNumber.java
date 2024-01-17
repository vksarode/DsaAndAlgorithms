package armStrongNumber;

import java.lang.*;
        import java.util.*;

public class ArmStrongNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner s = new Scanner(System.in);

        int j = s.nextInt();
        int con = 0;
        for(int i=1; i<= j; i++){
            int sum =0;
            int n=i;
            //int d = i < 10? i : i%10;
            int d = 0;
            while(true){

                if(n < 10){
                    d = n;
                }else{
                    d = n%10;
                }
                sum = sum + (d*d*d);
                if(n < 10){
                    break;
                }else{
                    n = n/10;
                }

            }

            if(sum == i){
                System.out.println(i);
            }
        }
    }
}
