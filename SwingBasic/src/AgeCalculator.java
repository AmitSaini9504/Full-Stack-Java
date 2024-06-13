import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    private JLabel age;
    private JTextField inputAge;
    private JButton calculateAgeButton;
    private JPanel rootPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("AgeCalculator");
        frame.setContentPane(new AgeCalculator().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public AgeCalculator() {
        calculateAgeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the input age from the JTextField
                String inputAgeText = inputAge.getText();

                // Parse the input age string to LocalDate
                LocalDate dob = LocalDate.parse(inputAgeText);

                // Obtain the current date from the system clock
                LocalDate curDate = LocalDate.now();

                // Calculate the difference between two dates
                Period period = Period.between(dob, curDate);

                // Display the difference in years, months, and days
                int years = period.getYears();
                int months = period.getMonths();
                int days = period.getDays();
                String ageText = "Age: " + years + " years, " + months + " months, " + days + " days";

                // Set the calculated age text to the JLabel
                age.setText(ageText);
            }
        });
    }
}
