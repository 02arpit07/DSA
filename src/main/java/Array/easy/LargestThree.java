package Array.easy;

public class LargestThree {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        printLargestThreeElement(arr);
    }

    static void printLargestThreeElement(int[] array) {
        int first, second, third;
        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                //the sequence should be same.
                third = second;
                second = first;
                first = array[i];
            }
            else if (array[i] > second) {
                third = second;
                second = array[i];
            }
            else if (array[i] > third) {
                third = array[i];
            }
        }
        System.out.println(first + " " + second + " "+ third);
    }
}
