import java.util.Arrays;

public class VarArgs {
    // method which takles variable length arguments
    public static void main(String[] args) {
        fun(1, 3, 4, 4, 5, 8, 5, 5);// [1, 3, 4, 4, 5, 8, 5, 5]
        fun(); // []
        multiple(1, 2, "Swe", "Lala");
    }

    // ...variableName -> when we do not know how many arguments it would have.
    // Internally it takes it as an array of ints
    // if we want strings: (String ...v)
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    // varArgs should be last in the list
    static void multiple(int a, int b, String... s) {
        // System.out.println(a, b);
        System.out.println(Arrays.toString(s) + a + b);
    }
}
