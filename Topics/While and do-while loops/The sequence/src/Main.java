import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfElements = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        while (numberOfElements > 0) {
            int input = scanner.nextInt();
            if (input % 4 == 0 && input > max) {
                max = input;
            }
            numberOfElements--;
        }
        System.out.println(max);
    }
}