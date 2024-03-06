import java.util.*;

class FixingStringIndexOutOfBoundsException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        String outOfBounds = "Out of bounds!";

        System.out.println(index >= 0 && index < string.length() ? string.charAt(index) : outOfBounds);
    }
}