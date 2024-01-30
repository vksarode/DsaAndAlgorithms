package goodPair;

import java.util.ArrayList;
import java.util.List;

public class GoodPair {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        int N = A.size();
        int T = 5;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A.get(i) + A.get(j) == T) {
                    System.out.println("Good Pair is (" + i + "," + j + ")");
                }
            }
        }
    }
}
