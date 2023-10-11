import java.util.Scanner;

public class TypeConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 2 types should be compatible
        // destination type should be greater than source type
        float num = input.nextInt(); // can assign int to float. Not vice versa

        // Narrowing conversion / Type casting
        int intNum = (int) (66.32f);
        System.out.println(intNum); // o/p-66

        byte a = 40;
        byte b = 50;
        byte c = 100;
        int res = a * b / c; // intermediate a*b exceeds byte range(256). Internally converts to int coz we
                             // are assigning final res to int
        // byte res = a * b / c; // but this would give an error coz it exceeds byte
        // range(256). Unless we do explicit casting

        int number = 'a';
        System.out.println(number); // output - 97 [ascii value]
        // Java follows unicode values
    }
}
