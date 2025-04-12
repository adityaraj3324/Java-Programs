import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class InventoryManagementSystem extends JFrame {
    private DefaultListModel<String> inventoryModel;
    private JList<String> inventoryList;
    private JTextField itemField;
    private JButton addButton, removeButton;

    public InventoryManagementSystem() {
        setTitle("Inventory Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Inventory List
        inventoryModel = new DefaultListModel<>();
        inventoryList = new JList<>(inventoryModel);
        add(new JScrollPane(inventoryList), BorderLayout.CENTER);

        // Input Panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        itemField = new JTextField(15);
        addButton = new JButton("Add Item");
        removeButton = new JButton("Remove Item");

        inputPanel.add(new JLabel("Item:"));
        inputPanel.add(itemField);
        inputPanel.add(addButton);
        inputPanel.add(removeButton);
        add(inputPanel, BorderLayout.SOUTH);

        // Button Listeners
        addButton.addActionListener(e -> {
            String item = itemField.getText().trim();
            if (!item.isEmpty()) {
                inventoryModel.addElement(item);
                itemField.setText("");
            }
        });

        removeButton.addActionListener(e -> {
            int selectedIndex = inventoryList.getSelectedIndex();
            if (selectedIndex != -1) {
                inventoryModel.remove(selectedIndex);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            InventoryManagementSystem ims = new InventoryManagementSystem();
            ims.setVisible(true);
        });
    }
}
