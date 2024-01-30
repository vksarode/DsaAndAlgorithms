package rotateArray;

public class RotateArray_Sol_2
{
	public static void main(String[] args) {
	    int R = 3;
        int A[] = {1,2,3,4,5};
        int B[] = new int[A.length];
        int N = A.length;
        R = R % A.length;
        System.out.println("R:"+ R);

        int newIndex = 0;
        for(int i=0; i< N; i++){
            newIndex = (i+ (N-R) ) % N ;
            System.out.println("i="+ i+ "newIndex" + newIndex );
            B[i] = A[newIndex];
        }
        print(B);

        
	}
	public static void print(int A[]){
	    for(int i=0; i<A.length; i++){
	        System.out.print(A[i]+ " ");
	    }
	    System.out.println();
	    
	}
}
