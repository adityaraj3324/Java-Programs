import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField display;
    JButton[] buttons;
    String[] labels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "C", "0", "=", "+"};
    String operand1 = "", operand2 = "", operator = "";

    public Calculator() {
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 18));

        buttons = new JButton[16];
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        for (int i = 0; i < 16; i++) {
            buttons[i] = new JButton(labels[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 18));
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
        }

        setLayout(new BorderLayout());
        add(display, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setTitle("Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if ("0123456789".contains(command)) {
            if (operator.isEmpty()) {
                operand1 += command;
            } else {
                operand2 += command;
            }
            display.setText(operand1 + operator + operand2);
        } else if ("/*-+".contains(command)) {
            if (!operand1.isEmpty() && operand2.isEmpty()) {
                operator = command;
                display.setText(operand1 + operator);
            }
        } else if (command.equals("=")) {
            if (!operand1.isEmpty() && !operand2.isEmpty()) {
                int result = calculate(Integer.parseInt(operand1), Integer.parseInt(operand2), operator);
                display.setText(String.valueOf(result));
                operand1 = String.valueOf(result);
                operator = operand2 = "";
            }
        } else if (command.equals("C")) {
            operand1 = operand2 = operator = "";
            display.setText("");
        }
    }

    private int calculate(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return b != 0 ? a / b : 0;
        }
        return 0;
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
