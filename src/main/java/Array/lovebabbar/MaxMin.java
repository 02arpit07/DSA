package Array.lovebabbar;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {10,20,30,12,11,22,3333,33,0,98,-98};
        int MIN = Integer.MAX_VALUE;
        int MAX = Integer.MIN_VALUE;
        for (int i =0 ;i<arr.length;i++){
            if (arr[i] > MAX){
                MAX = arr[i];
            }
            if (arr[i]< MIN){
                MIN = arr[i];
            }
        }
        System.out.println("MAX : "+MAX);
        System.out.println("MIN : "+MIN);
    }
}
