import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int input = scanner.nextInt();
        String result = input > 0 ? "YES" : "NO";
        System.out.println(result);
    }
}