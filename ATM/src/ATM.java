import java.sql.*;

public class ATM {
    private int pinCode;
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    // JDBC URL, username, and password
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/atm";
    static final String USERNAME = "root";
    static final String PASSWORD = "s0gt495W@Amit";

    public ATM(String accountNumber, int pinCode, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getPin() {
        return pinCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            updateBalanceInDatabase();
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            updateBalanceInDatabase();
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
            return true;
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
            return false;
        }
    }

    public boolean verifyDetailsForAccountDetails(int pin, String accountNumber) {
        // Compare pin and account number for verification
        return this.pinCode == pin && this.accountNumber.equals(accountNumber);
    }

    private void updateBalanceInDatabase() {
        // Update balance in the database
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
            String query = "UPDATE atm_accounts SET balance = ? WHERE account_number = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setDouble(1, balance);
                preparedStatement.setString(2, accountNumber);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
