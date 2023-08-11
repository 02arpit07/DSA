package Array.lovebabbar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class KthSmallestNonDistinct {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 44, 20, 30, 12, 11, 22, 3333, 33, 0, 1, 2, 3, 4, 5, 98};
        int k = 8;
        Arrays.sort(arr);
        HashSet hs = new HashSet();
        for (int i : arr) {
            hs.add(i);
        }
        int count = 0;
        Iterator<Integer> itr = Arrays.stream(arr).iterator();
        while (itr.hasNext() && count != k) {
            count++;
            itr.next();
        }
        System.out.println(itr.next());
    }
}
