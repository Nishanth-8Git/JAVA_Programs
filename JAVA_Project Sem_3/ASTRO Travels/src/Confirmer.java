import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Confirmer {

    public static void main(String[] args) {
        String fileName = "nishanths file .txt";
        int userInputNumber = getUserInputNumber();
        String userInputName = getUserInputName();
        if (isBookingConfirmed(fileName, userInputNumber, userInputName)) {
            System.out.println("The booking is confirmed.");
        } else {
            System.out.println("Booking is not confirmed.");
        }
    }

    private static int getUserInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int userInputNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        scanner.close();
        return userInputNumber;
    }
    private static String getUserInputName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name: ");

        scanner.close();
        return scanner.nextLine();
    }
    private static isBookingConfirmed(String fileName, int userInputNumber, String userInputName) {
        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String userBookingInfo = userInputNumber + " " + userInputName;
                if (line.equals(userBookingInfo)) {
                    return true;
                }
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace(); // Handle the exception appropriately in a real-world scenario
        }

        return false;
    }
}