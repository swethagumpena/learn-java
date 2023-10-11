import java.util.Arrays;

public class ArrayReverse {
    // arr: [1,2,3,4,5] ->
    // swap first and last.
    // Then start is second element. End is second last element. Swap these two
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("original: " + Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println("reversed: " + Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
