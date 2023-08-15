package Array.lovebabbar;

class RotateBy1 {

    public void rotateMethodByArpit(int arr[], int n)
    {
        int max = Integer.MAX_VALUE;
        int lastElement = arr[n-1];
        for(int i = arr.length-1 ;i > 0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0]= lastElement;

    }
}