package Array;

public class Hello {
    public static void main(String[] args) {
        String name  = "Arpit";
        String name2 = "vanshika";

        int numbers[] = new int[10];   //  0 0 0 0 0

        numbers[3] = 10;   //10 0 0 0 0
        for (int i=0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        String[] names = {"Arpit","Vanshika"};
    }
}
