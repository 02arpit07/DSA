package Array.lovebabbar;

public class KadaneMaxSubArrayBrute {
    //Worked on attempt 1.
    public static void main(String[] args) {
        int arr[] = {1,2,3,-2,5};
        int MAX_SUM = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = i ; j < arr.length ; j++) {
                sum =  sum + arr[j];
                if (sum>MAX_SUM) {
                    MAX_SUM = sum;
                }
            }
            sum = 0;
        }
        System.out.println(MAX_SUM);
    }
}
