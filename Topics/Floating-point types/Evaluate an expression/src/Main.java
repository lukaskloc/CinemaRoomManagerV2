import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numberAmount = 4;
        double[] array = new double[numberAmount];

        for (int i = 0; i < numberAmount; i++) {
            array[i] = scanner.nextDouble();
        }

        System.out.println(array[0] * 10.5 + array[1] * 4.4 + (array[2] + array[3]) / 2.2);
    }
}