import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Menu {
    public static void main(String[] args) {
        // Menu system
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\nMAIN MENU");
        System.out.println("***************************************");
        System.out.println("1. Create and save drug data to a file");
        System.out.println("2. Create and save patient data to a database");
        System.out.println("3. Read object data from a file");
        System.out.println("4. Read object data from a database");
        System.out.print("\nYour choice:\n> ");

        // Will continue until valid input is received
        while (true) {
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                SaveToFile(scanner);
                break;
            } else if (choice.equals("2")) {
                SaveToDatabase(scanner);
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

    public static void SaveToFile(Scanner scanner) {
        // Create drug object
        // string name, double cost, double dosage
        System.out.print("Drug ID: ");
        int id = scanner.nextInt();

        scanner.nextLine(); // Buffer
        System.out.print("Drug name: ");
        String name = scanner.nextLine();

        System.out.print("Drug cost: ");
        double cost = scanner.nextDouble();

        System.out.print("Drug dosage: ");
        double dosage = scanner.nextDouble();

        Drug drug = new Drug(id, name, cost, dosage);
        System.out.println(drug);

        // Serialize object to file
        try {
            FileOutputStream fout = new FileOutputStream("Drugs.txt");
            ObjectOutputStream ObjOut = new ObjectOutputStream(fout);

            ObjOut.writeObject(drug);

            ObjOut.close();
            fout.close();

            System.out.println("Drug information created and stored successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void SaveToDatabase(Scanner scanner) {
        // Implement logic to save objects to an SQL Database
    }

    public static void ReadFromFile() {
        ArrayList<Drug> drugs = new ArrayList<>();

        // Read objects from file and add them to an arraylist
        try {
            FileInputStream fin = new FileInputStream("Drugs.txt");
            ObjectInputStream ObjIn = new ObjectInputStream(fin);
            Object temp = null;

            // Iterate until end of file
            while (true) {
                try {
                    temp = ObjIn.readObject();
                } 
                catch(EOFException e) {
                    break;
                }

                drugs.add((Drug)temp);
            }

            ObjIn.close();
            fin.close();

        } 
        catch(Exception e) {
            e.printStackTrace();
        }

        // Return all objects
        System.out.println(drugs);
    }

    public static void ReadFromDatabase() {
        // Implement logic to read objects from an SQL Database
    }

}
