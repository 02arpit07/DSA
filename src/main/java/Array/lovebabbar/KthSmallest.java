package Array.lovebabbar;

import java.util.Arrays;

public class KthSmallest {
    //this solution is for the case when we have all distinct elements.
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 12, 11, 22, 3333, 33, 0, 98, -98};
        int k = 3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
