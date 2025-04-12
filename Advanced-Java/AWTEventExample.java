import java.awt.*;
import java.awt.event.*;

public class AWTEventExample extends Frame implements ActionListener {
    Button button;

    public AWTEventExample() {
        button = new Button("Click Me");
        button.setBounds(50, 50, 80, 30);
        button.addActionListener(this); // Register the listener
        add(button);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    public static void main(String[] args) {
        new AWTEventExample();
    }
}
