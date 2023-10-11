import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 45, 6 };
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // you make a change to the object via this reference variable
    }
}

// strings are immutable
// Java -> only call by value. No reference. No pointers
// primitve data types: Original value is not changed. [string]
// non-primitive: Original value is changed. [array]