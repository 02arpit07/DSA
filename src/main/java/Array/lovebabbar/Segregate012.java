package Array.lovebabbar;

public class Segregate012 {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 2, 0};
        int countOf0 = 0;
        int countOf1 = 0;
        int countOf2 = 0;
        for (int i : arr) {
            if (i == 0) {
                countOf0++;
            } else if (i == 1) {
                countOf1++;
            } else {
                countOf2++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (countOf0 > 0) {
                arr[i] = 0;
                countOf0--;
            } else if (countOf1 > 0) {
                arr[i] = 1;
                countOf1--;
            } else {
                arr[i] = 2;
                countOf2--;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
