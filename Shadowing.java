public class Shadowing {
    static int x = 90; // need to declare variables as static
    // this will be shadowed at line 9. Lower level is overriding the upper level
    static int z = 10;

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x = 40; // class variable at line 2 is shadowed by this
        System.out.println(x); // 40
        fun();
        int z; // shadowing begins when the local variable is declared (not initialised)
        // System.out.println(z); // will give an error. Coz z is not initialized.
    }

    static void fun() {
        System.out.println("In fun: " + x); // 90
        // 40 is only in local scope. This will access x of global scope i.e., 90
    }
}
