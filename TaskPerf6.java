import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ScaptionProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("Select an option:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("0. Exit");

            option = input.nextInt();

            switch (option) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }

        } while (option != 0);
    }

    public static void register() {
        Scanner input = new Scanner(System.in);
        String username, password;

    
        System.out.println("Register");
        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        try {
            File file = new File("records.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(username + "," + password + "\n");
            writer.close();
            System.out.println("Registration successful.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }

    public static void login() {
        Scanner input = new Scanner(System.in);
        String username, password, line;

        System.out.println("Login");
        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Password: ");
        password = input.nextLine();

        try {
            File file = new File("records.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                line = reader.nextLine();
                String[] parts = line.split(",");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    System.out.println("Successfully logged in.");
                    return;
                }
            }

            System.out.println("Incorrect username or password.");
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }
}