import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();

        String numberString = Integer.toString(number);

        if (numberString.charAt(0) == numberString.charAt(3)
                && numberString.charAt(1) == numberString.charAt(2)) {
            System.out.println(1);
        } else {
            System.out.println(69);
        }

    }
}