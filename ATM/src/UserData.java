import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class UserData {

    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/atm";
    static final String USERNAME = "root";
    static final String PASSWORD = "s0gt495W@Amit";

    public static void main(String[] args) {
        ArrayList<ATM> accounts = new ArrayList<>();

        // Input Pincode
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Pin Code: ");
        int inputPin = sc.nextInt();
        sc.nextLine(); // Consume newline character

        // Connect to the database and retrieve account information
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "SELECT * FROM atm_accounts WHERE pin = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, inputPin);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    while (resultSet.next()) {
                        String accountNumber = resultSet.getString("account_number");
                        int pin = resultSet.getInt("pin");
                        String accountHolderName = resultSet.getString("account_holder");
                        double balance = resultSet.getDouble("balance");

                        accounts.add(new ATM(accountNumber, pin, accountHolderName, balance));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        if (accounts.isEmpty()) {
            System.out.println("Invalid PIN.");
            return;
        }

        // Prompt user to select an operation
        System.out.print("Enter Operations: \n1. Check Balance\n2. Account Details\n3. Deposit\n4. Withdrawal\nChoose an operation: ");
        int operation = sc.nextInt();
        sc.nextLine(); // Consume newline character

        switch (operation) {
            case 1:
                // Check Balance
                ATM account = accounts.get(0); // Assume first account
                System.out.println("Balance: $" + account.getBalance());
                break;
            case 2:
                // Account Details
                System.out.print("Enter Account Number: ");
                String inputAccountNumber = sc.nextLine();
                ATM validAccount = verifyAccount(accounts, inputAccountNumber);
                if (validAccount != null) {
                    displayAccountDetails(validAccount);
                } else {
                    System.out.println("Account not found.");
                }
                break;
            case 3:
                // Deposit
                System.out.print("Enter Account Number: ");
                String depositAccountNumber = sc.nextLine();
                ATM depositAccount = findAccount(accounts, depositAccountNumber);
                if (depositAccount != null) {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    depositAccount.deposit(depositAmount);
                } else {
                    System.out.println("Account not found.");
                }
                break;
            case 4:
                // Withdrawal
                System.out.print("Enter Account Number: ");
                String withdrawAccountNumber = sc.nextLine();
                ATM withdrawAccount = findAccount(accounts, withdrawAccountNumber);
                if (withdrawAccount != null) {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    withdrawAccount.withdraw(withdrawAmount);
                } else {
                    System.out.println("Account not found.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }
    }

    private static ATM findAccount(ArrayList<ATM> accounts, String accountNumber) {
        for (ATM account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    private static ATM verifyAccount(ArrayList<ATM> accounts, String accountNumber) {
        for (ATM account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }




    private static void displayAccountDetails(ATM account) {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: $" + account.getBalance());
    }
}
