import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        int numberOfDs = 0;
        int numberOfCs = 0;
        int numberOfBs = 0;
        int numberOfAs = 0;

        for (int i = 0; i <= n; i++) {
            String grade = scanner.nextLine();
            switch (grade) {
                case "D" -> numberOfDs++;
                case "C" -> numberOfCs++;
                case "B" -> numberOfBs++;
                case "A" -> numberOfAs++;
            }
        }

        System.out.println(numberOfDs + " " + numberOfCs + " " + numberOfBs
                + " " + numberOfAs);

    }
}