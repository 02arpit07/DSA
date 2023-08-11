package Array.lovebabbar;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5,6};
        int[] arr2 = {3,4,5,6,7,8,1};
        doIntersection(arr,arr2);
    }
    public static void doIntersection(int[] arr, int[] arr2) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i =0 ;i<arr.length ;i++) {
            al.add(arr[i]);
        }
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int element : arr2){
            if(al.contains(element)){
                al2.add(element);
                System.out.print(element + " ");
            }
        }
    }
}
