package Day8_IntroductionToArrays;

public class SecondLargest {

    public static void main(String[] args) {
//        int A[] = {13,7,16,18,14,17,18,8,10};
//        int A[] = {11,15,19};
//        int A[] = {4,0,5,14,1,3,6,7};
//        int A[] = {16,19,2,0,20,13,0,9};
//        int A[] ={11,8,10};
                int A[] ={10,10,9,8,1};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int temp =0 ;
        int ft = Integer.MIN_VALUE;
        int st = Integer.MIN_VALUE;
        if(A.length <=1){
            return -1;
        }
        int i=0;
        for(i=0; i<A.length -1; i+=2){
            ft = A[i];
            st = A[i+1];

            if(ft >  st){
                temp = ft;
                ft = st;
                st = temp;
            }else if(ft == st ){
                ft = Integer.MIN_VALUE;
            }
            if(firstLargest < ft ){
                firstLargest = ft;
            }
            if(secondLargest < st){
                if(firstLargest < secondLargest ){
                    firstLargest = secondLargest;
                }
                secondLargest = st ;
            }

            if(secondLargest > st && firstLargest < st ){
                firstLargest = st;
            }

            if(firstLargest >  secondLargest){
                temp = firstLargest;
                firstLargest = secondLargest;
                secondLargest = firstLargest;
            }

        }
        if(A.length %2 ==1){
            if( secondLargest < A[A.length -1]){
                firstLargest = secondLargest ;
                secondLargest = A[A.length -1] ;
            }else  if( firstLargest < A[A.length -1]){
                firstLargest = A[A.length -1] ;
            }

        }
        if(firstLargest == secondLargest){
            return -1;
        }else{
            return firstLargest;
        }

    }
}
