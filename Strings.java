public class Strings {
    public static void main(String[] args) {
        String a = "swetha";
        String b = "swetha";
        String c = a;
        System.out.println("a==b" + (a == b)); // true
        System.out.println("a==c: " + (a == c)); // true
        System.out.println("a.equals(b): " + a.equals(b)); // true

        // a.equals(b) -> check by value
    }
}
