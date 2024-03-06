import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numN = scanner.nextInt();

        for (int i = numA; i <= numB; i++) {
            if (i % numN == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}