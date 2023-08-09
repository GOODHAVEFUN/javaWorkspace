package play;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorGUI extends JFrame {
    private JTextField textField;
    private JButton btnAdd, btnSubtract, btnMultiply, btnDivide, btnCalculate;
    private int firstNumber, secondNumber;
    private String operator;

    public CalculatorGUI() {
        setTitle("계산기");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1));

        textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        add(textField);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 2));

        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");
        btnMultiply = new JButton("*");
        btnDivide = new JButton("/");
        btnCalculate = new JButton("Calculate");

        buttonPanel.add(btnAdd);
        buttonPanel.add(btnSubtract);
        buttonPanel.add(btnMultiply);
        buttonPanel.add(btnDivide);
        buttonPanel.add(btnCalculate);

        add(buttonPanel);

        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator = "+";
                getNumbersFromUser();
            }
        });

        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator = "-";
                getNumbersFromUser();
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator = "*";
                getNumbersFromUser();
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                operator = "/";
                getNumbersFromUser();
            }
        });

        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateResult();
            }
        });
    }

    private void getNumbersFromUser() {
        String firstNumberText = textField.getText();
        firstNumber = Integer.parseInt(firstNumberText);
        textField.setText("");
    }

    private void calculateResult() {
        String secondNumberText = textField.getText();
        secondNumber = Integer.parseInt(secondNumberText);
        int result = 0;

        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            result = firstNumber / secondNumber;
        }

        textField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }
}
