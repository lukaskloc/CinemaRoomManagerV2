import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int counter = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } else {
                counter++;
            }
        }
        System.out.println(counter);
    }
}