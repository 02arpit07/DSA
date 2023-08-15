package Array.lovebabbar;

public class KadaneAlgo {
    public static void main(String[] argss) {
        // here we check if the sum of number becomes negative , no need to take it forwrard. just start  fresh by resetting
//        it to 0.
        int arr[] = {-5, 4, 6, -3, 4, -1};
        int maxSum = 0;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (currSum > maxSum ) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0;
            }

        }
        System.out.println(maxSum);

    }
}
