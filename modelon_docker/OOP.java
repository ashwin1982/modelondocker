import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

class OOP extends JFrame {

  private JTextField heightField;
  private JTextField weightField;
  private JLabel bmiLabel;

  public OOP(){
    String text = "This program demonstrates";
    String text2 = text.concat(" OOP concepts in Java");

    JLabel label = new JLabel(text2);
    JPanel panel = new JPanel();
    panel.setBackground(Color.white);

    // Create height label and text field
    JLabel heightLabel = new JLabel("Height (cm):");
    heightField = new JTextField(10);

    // Create weight label and text field
    JLabel weightLabel = new JLabel("Weight (kg):");
    weightField = new JTextField(10);

    // Create BMI label
    bmiLabel = new JLabel();

    // Create calculate button
    JButton calculateButton = new JButton("Calculate");
    calculateButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        calculateBMI(); // Call the method to calculate BMI
      }
    });

    // Add components to panel
    panel.add(label);
    panel.add(heightLabel);
    panel.add(heightField);
    panel.add(weightLabel);
    panel.add(weightField);
    panel.add(calculateButton);
    panel.add(bmiLabel);

    getContentPane().add(panel);
  }

  private void calculateBMI() {
    double height = Double.parseDouble(heightField.getText());
    double weight = Double.parseDouble(weightField.getText());

    // Calculate BMI
    double bmi = weight / ((height / 100) * (height / 100));

    // Display the calculated BMI
    bmiLabel.setText("BMI: " + String.format("%.2f", bmi));
  }

  public static void main(String[] args){
    OOP frame = new OOP();

    frame.setTitle("OOP Principles");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    frame.setVisible(true);
  }
}