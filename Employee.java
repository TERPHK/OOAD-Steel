import java.sql.*;
import java.util.Scanner;
import java.util.Date;

public class Employee extends Person {
    private static int salary;

    // add Constructor from Person
    Employee(String[] dataPerson, int salary2) {
        super(dataPerson);
        this.salary = salary2;

    }

    public static void modeEmployee() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println();
            }
            System.out.println("-------------------------------------------------------");
            System.out.println("Menu:");
            System.out.println("1. List Steel");
            System.out.println("2. Confirm Order");
            System.out.println("3.History Steel");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    toListSell(1);
                    break;
                case 2:
                    toConfirmOrder();
                    break;
                case 3:
                    toListSell(2);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void toConfirmOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("List Order Steel");
        Notification.fetchNotification(1);
        System.out.print("Input ID Order do you want to finsih : ");
        int choice = scanner.nextInt();
        Notification.confirmOrder(choice);
    }

    private static void toListSell(int select) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("List Order Steel");
        Notification.fetchNotification(select);
        System.out.print("press Enter to continue.");
        scanner.nextLine();
        // System.out.print("Input ID Order to finish : ");
        // int choice = scanner.nextInt();

    }

    public static int getSalary() {
        return salary;
    }

    private static void toaddSteel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Add Steel");

        String mostId = RecycledSteel.dataRecylSteel[RecycledSteel.dataRecylSteel.length - 1][0] + 1;

        System.out.print("Enter type: ");
        String type = scanner.next();

        System.out.print("Enter name: ");
        String name = scanner.next();

        System.out.print("Enter weight: ");
        String weight = scanner.next();

        System.out.print("Enter amount: ");
        String amount = scanner.next();

        String[] newEntry = { mostId, type, name, weight, amount };
        RecycledSteel.addSteel(newEntry);

        scanner.close();

    }
}
