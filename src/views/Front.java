package views;

import components.MyButton;
import components.MyHeading;
import coursework.BankCard;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Front extends JFrame {
    ArrayList<BankCard> bankCards = new ArrayList<>();

    public MyButton bankButton, creditButton, debitButton;

    public MyHeading welcomeLabel, bankLabel, cardLabel;

    public Front() {
        super("NBL");

        bankButton = new MyButton("Open Bank Account");
        creditButton = new MyButton("Apply for Credit Card");
        debitButton = new MyButton("Apply for Debit Card");

        welcomeLabel = new MyHeading("Nepal Bank Limited");
        bankLabel = new MyHeading("Want to open a new account?");
        cardLabel = new MyHeading("Or apply for a new card?");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        // Create panel to hold components
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(137,207,240));
        panel.setBorder(BorderFactory.createLineBorder(Color.PINK, 15));

        GridBagConstraints gbcForPanel = new GridBagConstraints();

        gbcForPanel.gridx = 0;
        gbcForPanel.gridy = 0;
        gbcForPanel.gridwidth = 20;
        gbcForPanel.insets = new Insets(20, 0, 100, 0);
        panel.add(welcomeLabel, gbcForPanel);

        gbcForPanel.gridx = 0;
        gbcForPanel.gridy = 1;
        gbcForPanel.gridwidth = 3;
        gbcForPanel.insets = new Insets(0, 0, 20, 0);
        panel.add(bankLabel, gbcForPanel);

        gbcForPanel.gridx = 0;
        gbcForPanel.gridy = 2;
        gbcForPanel.gridwidth = 3;
        gbcForPanel.insets = new Insets(0, 0, 20, 0);
        panel.add(cardLabel, gbcForPanel);

        gbcForPanel.gridx = 0;
        gbcForPanel.gridy = 3;
        gbcForPanel.gridwidth = 3;
        gbcForPanel.insets = new Insets(0, 0, 20, 0);
        panel.add(bankButton, gbcForPanel);

        gbcForPanel.gridx = 0;
        gbcForPanel.gridy = 4;
        gbcForPanel.gridwidth = 1;
        gbcForPanel.insets = new Insets(0, 0, 0, 5);
        panel.add(creditButton, gbcForPanel);

        gbcForPanel.gridx = 1;
        gbcForPanel.gridy = 4;
        gbcForPanel.gridwidth = 2;
        gbcForPanel.insets = new Insets(0, 5, 0, 0);
        panel.add(debitButton, gbcForPanel);

        // Add panel to the frame
        getContentPane().add(panel);

        // Set colors for buttons
        bankButton.setBackground(new Color(170, 183, 189));
        creditButton.setBackground(new Color(120, 136, 153));
        debitButton.setBackground(new Color(80, 98, 143));

        bankButton.addActionListener(e -> {
            new Bank(bankCards).setVisible(true);
        });

        debitButton.addActionListener(e -> {
            new Debit(bankCards).setVisible(true);
        });

        creditButton.addActionListener(e -> {
            new Credit(bankCards).setVisible(true);
        });
    }
}
