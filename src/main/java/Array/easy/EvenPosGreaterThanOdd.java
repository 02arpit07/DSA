package Array.easy;

import java.util.Arrays;

public class EvenPosGreaterThanOdd {
    public static void main(String[] args) {
       int A[] = {1, 2, 2, 1,8789,3,5,63,35,1,0,77};
       int ans[] = new int[A.length];
        Arrays.sort(A);
        int p = 0;
        int q = A.length-1;
        for (int i = 0 ; i <= A.length -1; i++) {
            if ((i+1) % 2 == 0) {
                ans[i] = A[q];
                q--;
            } else {
                ans[i] = A[p];
                p++;
            }
        }
        for (int i = 0; i <A.length ; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
