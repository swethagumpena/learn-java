import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = input.nextInt();
        System.out.println("Marks are " + marks);

        int a = 234_000_000; // 234 billion. Won't allow commas. Put underscore
        System.out.println(a);

        Scanner numberInput = new Scanner(System.in);
        int num1 = numberInput.nextInt();
        int num2 = numberInput.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum=" + sum);
    }
}
