package Array.lovebabbar;

public class MoveNegativeToBegining {
    public static void main(String[] args) {
        //First way could be simply do Arrays.sort()
        //Second way -:
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        int n = arr.length;
        int j = 0;
        for (int i = 0 ; i < n ; i++) {
            //if we got a negatie number.
            if (arr[i] < 0){
                //This if condition ensures we are not replacing the same element example on firsrt iteration we have negative number
                // we will let it be and no need to swap as i and j both are equal.
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
//                we have to increement the j index to place next negative nuber on this index.
                j++;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
