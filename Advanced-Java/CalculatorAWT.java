import java.awt.*;
import java.awt.event.*;

public class CalculatorAWT extends Frame implements ActionListener {
    TextField input1, input2, result;
    Button add, subtract, multiply, divide;

    public CalculatorAWT() {
        // Layout setup
        setLayout(new FlowLayout());

        // Components
        input1 = new TextField(10);
        input2 = new TextField(10);
        result = new TextField(10);
        result.setEditable(false);

        add = new Button("Add");
        subtract = new Button("Subtract");
        multiply = new Button("Multiply");
        divide = new Button("Divide");

        // Add components to Frame
        add(new Label("Input 1:"));
        add(input1);
        add(new Label("Input 2:"));
        add(input2);
        add(new Label("Result:"));
        add(result);
        add(add);
        add(subtract);
        add(multiply);
        add(divide);

        // Event listeners
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        // Frame properties
        setTitle("AWT Calculator");
        setSize(400, 200);
        setVisible(true);

        // Close window on exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double res = 0;

            if (e.getSource() == add) {
                res = num1 + num2;
            } else if (e.getSource() == subtract) {
                res = num1 - num2;
            } else if (e.getSource() == multiply) {
                res = num1 * num2;
            } else if (e.getSource() == divide) {
                if (num2 != 0) {
                    res = num1 / num2;
                } else {
                    result.setText("Error");
                    return;
                }
            }
            result.setText(String.valueOf(res));
        } catch (NumberFormatException ex) {
            result.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new CalculatorAWT();
    }
}
