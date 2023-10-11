import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        // find number of occurences of a digit in a number
        Scanner input = new Scanner(System.in);
        int n = 27363321;
        int digit = input.nextInt();
        int cnt = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == digit) {
                cnt++;
            }
            n = n / 10;
        }
        System.out.println("occurences: " + cnt);
    }
}
