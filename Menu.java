import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nMAIN MENU");
        System.out.println("***************************************");
        System.out.println("1. Create and save drug data to a file");
        System.out.println("2. Create and save patient data to a database");
        System.out.println("3. Read object data from a file");
        System.out.println("4. Read object data from a database");
        System.out.print("\nYour choice:\n> ");

        while (true) {
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                SaveToFile();
                break;
            } else if (choice.equals("2")) {
                SaveToDatabase();
                break;
            } else if (choice.equals("3")) {
                ReadFromFile();
                break;
            } else if (choice.equals("4")) {
                ReadFromDatabase();
                break;
            } else {
                System.out.print("Invalid option, try again\n> ");
            }
        }

        scanner.close();

    }

    public static void SaveToFile() {
        // Implement logic to save objects to a file
    }

    public static void SaveToDatabase() {
        // Implement logic to save objects to an SQL Database
    }

    public static void ReadFromFile() {
        // Implement logic to read objects from a file
    }

    public static void ReadFromDatabase() {
        // Implement logic to read objects from an SQL Database
    }

}
