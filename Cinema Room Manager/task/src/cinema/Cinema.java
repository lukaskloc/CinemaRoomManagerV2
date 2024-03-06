package cinema;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cinema {
    private static final DecimalFormat decfor = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketsBought = 0;
        int currentIncome = 0;

        System.out.println("Enter the number of rows:");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsInARow = scanner.nextInt();

        int totalIncome = calculateTotalIncome(numberOfRows, seatsInARow);

        int totalSeats = numberOfRows * seatsInARow;

        String[][] cinema = new String[numberOfRows + 1][seatsInARow + 1];

        //filling the array
        cinema[0][0] = " ";
        for (int i = 1; i < cinema[0].length; i++) {
            cinema[0][i] = String.valueOf(i);
        }
        for (int i = 1; i < cinema.length; i++) {
            cinema[i][0] = String.valueOf(i);
        }
        for (int i = 1; i < cinema.length; i++) {
            for (int j = 1; j < cinema[i].length; j++) {
                cinema[i][j] = "S";
            }
        }

        //menu
        while (true) {
            System.out.println();
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println();
                printArray(cinema);
            } else if (input == 2) {
                currentIncome = buyTicket(scanner, cinema, totalSeats, numberOfRows, seatsInARow, currentIncome);
                ticketsBought++;
            } else if (input == 3) {
                showStatistics(ticketsBought, totalIncome, currentIncome, totalSeats);
            } else if (input == 0) {
                break;
            }
        }
    }

    private static int buyTicket(Scanner scanner, String[][] cinema, int totalSeats, int numberOfRows, int numberOfSeats, int currentIncome) {
        while (true) {
            System.out.println();
            System.out.println("Enter a row number:");
            int rowNumber = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            int seatNumber = scanner.nextInt();

            if (rowNumber > numberOfRows || rowNumber < 0 || seatNumber > numberOfSeats || seatNumber < 0) {
                System.out.println("Wrong input!");
                continue;
            }

            if (cinema[rowNumber][seatNumber].equals("B")) {
                System.out.println("That ticket has already been purchased!");
                continue;
            } else {
                cinema[rowNumber][seatNumber] = "B";
            }
            if (totalSeats <= 60) {
                System.out.println("Ticket price: $10");
                currentIncome += 10;
                return currentIncome;
            } else {
                if (rowNumber <= numberOfRows / 2) {
                    System.out.println("Ticket price: $10");
                    currentIncome += 10;
                } else {
                    System.out.println("Ticket price: $8");
                    currentIncome += 8;
                }
                return currentIncome;
            }
        }
    }

    public static void printArray(String[][] array) {
        System.out.println("Cinema:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void showStatistics(int tickets, int totalIncome, int currentIncome, int totalSeats) {
        System.out.println("Number of purchased tickets: " + tickets);
        double occupancy = ((double) (tickets * 100) / totalSeats);
        System.out.println("Percentage: " + decfor.format(occupancy) + "%");
        System.out.println("Current income: $" + currentIncome);
        System.out.println("Total income: $" + totalIncome);

    }

    private static int calculateTotalIncome(int rows, int seats) {
        int totalSeats = rows * seats;
        if (totalSeats <= 60) {
            return totalSeats * 10;
        } else {
            if (rows % 2 == 0) {
                return rows / 2 * seats * 10 + rows / 2 * seats * 8;
            } else {
                return rows / 2 * seats * 10 + (rows / 2 + 1) * seats * 8;
            }
        }
    }
}