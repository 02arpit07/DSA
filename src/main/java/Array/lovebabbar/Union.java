package Array.lovebabbar;

import java.util.HashSet;

public class Union {
    //print total number element in union of two arrays.
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5,6};
        int[] arr2 = {3,4,5,6,7,8,1};
        System.out.println(doUnion(arr,arr2));
    }
        public static int doUnion(int a[], int b[])
        {
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int i : a){
                hs.add(i);
            }
            for(int j : b){
                hs.add(j);
            }
            return hs.size();
        }
}
