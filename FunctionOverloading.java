public class FunctionOverloading {
    // two functions can have the same name if the number of arguments are different
    // or type of arguments are different
    // it decides in complile time which function should be called
    public static void main(String[] args) {
        fun(67); // line 10
        fun("Swetha");// line 14
        demo(); // error: ambiguity as to which function to choose
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String a) {
        System.out.println(a);
    }

    static void demo(String... a) {
        System.out.println(a);
    }

    static void demo(int... a) {
        System.out.println(a);
    }
}
