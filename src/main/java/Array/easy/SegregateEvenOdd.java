package Array.easy;

public class SegregateEvenOdd {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int[] clone = arr.clone();
        int start = 0;
        int end = arr.length-1;
        for (int i = 0 ; i <arr.length -1 ;i++) {
            if (clone[i] % 2 == 0) {
                arr[start] = clone[i];
                start++;
            } else {
                arr[end] = clone[i];
                end--;
            }
        }
        for (int i =0;i<arr.length-1;i++) {
            System.out.print(arr[i]);
        }
    }
}
