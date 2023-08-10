package Array.lovebabbar;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3,8,83,9,9488,449};
        int start = 0 ;
        int end = arr.length - 1;
        //jab tak start variable ki value end value se choti nahi hogi tab tak yeh loop exit nahi hogi
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        for (int i = 0 ; i <arr.length;i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    //Method used to swap elements of array
    private static void swap(int[] arr, int index1 , int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
