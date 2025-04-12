import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ECommerceApp extends JFrame {
    private DefaultListModel<String> productListModel;
    private JList<String> productList;
    private DefaultListModel<String> cartListModel;
    private JList<String> cartList;

    public ECommerceApp() {
        setTitle("E-Commerce Application");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Product list
        productListModel = new DefaultListModel<>();
        productList = new JList<>(productListModel);
        add(new JScrollPane(productList), BorderLayout.WEST);

        // Cart list
        cartListModel = new DefaultListModel<>();
        cartList = new JList<>(cartListModel);
        add(new JScrollPane(cartList), BorderLayout.EAST);

        // Buttons panel
        JPanel buttonPanel = new JPanel();
        JButton addToCartButton = new JButton("Add to Cart");
        JButton removeFromCartButton = new JButton("Remove from Cart");

        buttonPanel.add(addToCartButton);
        buttonPanel.add(removeFromCartButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Populate product list
        for (String product : new String[]{"Laptop", "Smartphone", "Headphones", "Smartwatch", "Camera"}) {
            productListModel.addElement(product);
        }

        // Button actions
        addToCartButton.addActionListener(e -> {
            String selectedProduct = productList.getSelectedValue();
            if (selectedProduct != null && !cartListModel.contains(selectedProduct)) {
                cartListModel.addElement(selectedProduct);
            }
        });

        removeFromCartButton.addActionListener(e -> {
            String selectedProduct = cartList.getSelectedValue();
            if (selectedProduct != null) {
                cartListModel.removeElement(selectedProduct);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ECommerceApp().setVisible(true);
        });
    }
}
