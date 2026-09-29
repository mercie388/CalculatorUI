import javax.swing.*;
import java.awt.*;

public class CalculatorUI extends JFrame {
    public CalculatorUI(){
        setTitle("Standard Calculator");
        setSize(300, 350);
        setLayout(new BorderLayout());

        JTextField screen = new JTextField();
        screen.setPreferredSize(new Dimension(300, 50));
        screen.setHorizontalAlignment(JTextField.RIGHT);
        add(screen, BorderLayout.NORTH);

        JPanel grid = new JPanel(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };
        for(String label : buttons){
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            grid.add(btn);
        }
        add(grid, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CalculatorUI();
    }
}
