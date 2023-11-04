import java.util.*;

public class App {

    static String[] dataEmployee = { "0", "Jakrit", "123", "25000" };
    static String[] dataCustomer = { "0", "Pakawat", "0813397654", "Mueng Phitsanulok", "pakawat@gmail.com", "123",
            "1" };  

    public static void main(String[] args) {
        Login();
    }

    private static void Login() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Please input username : ");
            String username = scanner.nextLine();
            System.out.print("Please input password : ");
            String password = scanner.nextLine();

            if (username.equals(dataEmployee[1])) {
                if (password.equals(dataEmployee[2])) {
                    Employee.modeEmployee();
                }
            } else if (username.equals(dataCustomer[4])) {
                if (password.equals(dataCustomer[5])) {
                    Customer customer = new Customer(dataCustomer, dataCustomer[dataCustomer.length - 1]);
                    customer.modeCustomer();
                }
            }
        }
    }
}
