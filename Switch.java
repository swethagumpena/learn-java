import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        switch (fruit) {
            case "Mango":
                System.out.println("Mango");
                break;
            case "Apple":
                System.out.println("Apple");
                break;
            default:
                System.out.println("Enter valid");
        }

        // enhanced switch statement: internally has break after every case
        switch (fruit) {
            case "Mango" -> System.out.println("Mango");
            case "Apple" -> System.out.println("Apple");
            default -> System.out.println("Enter valid");
        }

        // ---------------------------------------------- //

        // when not to use break: eg-Need to print weekday or weekend
        int day = input.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }

        // enhanced switch statement:
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
