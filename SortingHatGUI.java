import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SortingHatGUI extends JFrame implements ActionListener {
    private JLabel nameLabel;
    private JTextField nameTextField;
    private JButton startButton;
    private JTextArea resultArea;

    public SortingHatGUI() {
        // Set up the JFrame
        setTitle("Hogwarts Sorting Hat Quiz");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        nameLabel = new JLabel("Enter your name:");
        nameTextField = new JTextField(20);
        startButton = new JButton("Start Sorting Hat Quiz");
        startButton.addActionListener(this);
        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        // Add components to the frame
        add(nameLabel);
        add(nameTextField);
        add(startButton);
        add(resultArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            // Get the name entered by the user
            String userName = nameTextField.getText();

            // Ask the user the quiz questions
            int option = JOptionPane.showConfirmDialog(this,
                    "Do you value bravery and chivalry?",
                    "Hogwarts Sorting Hat Quiz",
                    JOptionPane.YES_NO_OPTION);

            String house = "";
            if (option == JOptionPane.YES_OPTION) {
                house = "Gryffindor";
            } else {
                option = JOptionPane.showConfirmDialog(this,
                        "Do you value hard work, dedication, and loyalty?",
                        "Hogwarts Sorting Hat Quiz",
                        JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    house = "Hufflepuff";
                } else {
                    option = JOptionPane.showConfirmDialog(this,
                            "Do you value intelligence, creativity, and learning?",
                            "Hogwarts Sorting Hat Quiz",
                            JOptionPane.YES_NO_OPTION);

                    if (option == JOptionPane.YES_OPTION) {
                        house = "Ravenclaw";
                    } else {
                        house = "Slytherin";
                    }
                }
            }

            // Display the result in the GUI
            resultArea.setText("Dear " + userName + ",\nYou belong to " + house + "!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SortingHatGUI sortingHatGUI = new SortingHatGUI();
            sortingHatGUI.setVisible(true);
        });
    }
}
