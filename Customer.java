import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.Date;

public class Customer extends Person {
    String level;

    // add Constructor from Person
    Customer(String[] dataPerson, String level2) {
        super(dataPerson);
        this.level = level2;
    }

    public static void modeCustomer() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1.Sell Steel");
            System.out.println("2.Profile");
            System.out.println("3.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    modeSellSteel();
                    break;
                case 2:
                    modeProfile();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }

    private static void modeProfile() {
        System.out.println("Hello " + person_name);
    }

    private static void modeSellSteel() {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Helo " + person_name);
        RecycledSteel.displayInfoSteel();
        System.out.print("Please input id steel do you want to sell : ");
        int choice = scanner.nextInt();
        System.out.print("Amount of steel (KG) : ");
        int amount = scanner.nextInt();
        RecycledSteel resteel = new RecycledSteel(choice);
        System.out.println("Are you confirm your order ?");
        System.out.println("1.Yes");
        System.out.println("2.No");

        int choice1 = scanner.nextInt();
        switch (choice1) {
            case 1:
                break;

            case 2:
                return;

            default:
                System.out.println("Invalid option. Please try again.");
        }

        Notification noti = new Notification(0);
        String[][] dataNoti = noti.dataPurchase;
        String mostid = Integer.toString(Integer.parseInt(dataNoti[dataNoti.length - 1][0]) + 1);

        String[] arr = { mostid, "0", Integer.toString(resteel.steel_id), Integer.toString(amount), person_name,
                person_tel, person_address, "Wait", currentDate.format(formatter) };
        Notification.addRow(arr);
        System.out.println("Employee will come your address.");
    }
    public static void  setCustomerName(String CustomerName2){
        person_name = CustomerName2;
    }
    public  void  setCustomerLevel(String CustomerLevel2){
        level = CustomerLevel2;
    }   
    public String getCustomerName(){
        return person_name;
    }
    public String getCustomerLevel(){
        return level;
    }
}
