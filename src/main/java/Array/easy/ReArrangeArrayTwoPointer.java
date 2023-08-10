package Array.easy;

public class ReArrangeArrayTwoPointer {
    //Rearrange in such manner that at pos 1 we have largest pos 2 smallest the largest then smallest.
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int[] cloneArray = arr.clone();
        int start = 0;
        int end = arr.length - 1;
        boolean flag = true;
        for (int i = 0 ; i < arr.length ; i++) {
            if (flag) {
                arr[i] = cloneArray[end--];
            } else {
                arr[i] = cloneArray[start++];
            }
            flag = !flag;
        }
        for (int i =0;i<arr.length-1;i++) {
            System.out.print(arr[i]);
        }
    }
}
