import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        // datatype[] name = new datatype[size];
        int[] rollNos; // declaration: rollNos is getting defined in the stack here.
                       // Happens at compile time
        rollNos = new int[5]; // initialization: this is where object is being created in the heap.
                              // Memory allocation happens here
                              // happens at run time
                              // "new" keyword is used to create an object
        // Dynamic memory allocation: memory is allocated at run time

        // or:
        int[] arr = { 1, 2, 3, 4, 5, 6 }; // can directly mention the values of array

        int[] numsArr = new int[5];
        System.out.println("2nd element nums: " + numsArr[1]); // 0

        String[] stringsArr = new String[5];
        System.out.println("2nd element strings: " + stringsArr[1]); // null

        // forEach loop in JAVA
        for (int num : arr) { // for every element in the array, print the element
            System.out.println(num + " "); // here num represents the element of the array
        }

        // best way to print full array:
        System.out.println(Arrays.toString(arr));
    }
    // 1. array objects are in heap
    // 2. heap objects are not continuous
    // 3. there is dynamic memory allocation
    // Hence: Internally in java, array elements may not be continuous [Depends on
    // JVM]

}
