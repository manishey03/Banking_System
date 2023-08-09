package views;
import components.MyButton;
import components.MyHeading;
import components.MyLabel;
import components.MyTextField;
import coursework.BankCard;
import coursework.DebitCard;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Debit extends JFrame {

    public MyButton withDrawnButton, backButton, clearAlLButton, displayButton;

    public MyHeading debitCardLabel;

    public MyLabel cardIdLabel, withDrawnAmountLabel, pinNumberLabel, withDrawnDateLabel;

    public MyTextField cardIdTf, withDrawnAmountTf, pinNumberTf;

    public JComboBox currentDateDay, currentDateMonth, currentDateYear;


    public Debit(ArrayList<BankCard> bankCards) {
        super("Debit Card Details");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLocationRelativeTo(null);
        setVisible(true);


        withDrawnButton = new MyButton("WithDrawn");
        backButton = new MyButton("Back");
        clearAlLButton = new MyButton("Clear All");
        displayButton = new MyButton("Display");

        debitCardLabel = new MyHeading("Debit Card Details");


        cardIdLabel = new MyLabel("Card Id");
        withDrawnAmountLabel = new MyLabel("Withdrawn Amount");
        pinNumberLabel = new MyLabel("Pin Number");
        withDrawnDateLabel = new MyLabel("WithDrawn Date");


        cardIdTf = new MyTextField("");
        withDrawnAmountTf = new MyTextField("");
        pinNumberTf = new MyTextField("");


        String years[] = {"Select Date","2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029","2030"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08","09", "10", "11" ,"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
        "27" ,"28", "29", "30", "31", "32"};
        currentDateYear = new JComboBox<>(years);
        currentDateMonth = new JComboBox<>(months);
        currentDateDay = new JComboBox<>(days);

        GridBagLayout gblForDebit = new GridBagLayout();
        GridBagConstraints gbcForDebit = new GridBagConstraints();
        setLayout(gblForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 0;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 250, 50, 150);
        add(debitCardLabel, gbcForDebit);


        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 1;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 10, 200);
        add(cardIdLabel, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 1;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 150, 10, 0);
        add(cardIdTf, gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 2;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 10, 250);
        add(withDrawnAmountLabel, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 2;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 150, 10, 0);
        add(withDrawnAmountTf, gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 3;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 10, 250);
        add(pinNumberLabel, gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 3;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 150, 10, 0);
        add(pinNumberTf, gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 4;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 0, 10, 250);
        add(withDrawnDateLabel, gbcForDebit);



        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 4;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 10, 10, 0);
        add(currentDateYear,gbcForDebit);

        gbcForDebit.gridx = 1;
        gbcForDebit.gridy = 4;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, 300, 10, 0);
        add(currentDateMonth,gbcForDebit);


        gbcForDebit.gridx = 2;
        gbcForDebit.gridy = 4;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(0, -90, 10, 0);
        add(currentDateDay,gbcForDebit);

        gbcForDebit.gridx = 0;
        gbcForDebit.gridy = 5;
        gbcForDebit.gridwidth = 2;
        gbcForDebit.insets = new Insets(40, 300, 40, 200);
        add(withDrawnButton, gbcForDebit);


        gbcForDebit.gridx=0;
        gbcForDebit.gridy=19;
        gbcForDebit.gridwidth=2;
        gbcForDebit.insets = new Insets(0,100,10,0);
        add(backButton,gbcForDebit);

        gbcForDebit.gridx=0;
        gbcForDebit.gridy=18;
        gbcForDebit.gridwidth=2;
        gbcForDebit.insets = new Insets(0,300,10,30);
        add(displayButton,gbcForDebit);

        gbcForDebit.gridx=0;
        gbcForDebit.gridy=18;
        gbcForDebit.gridwidth=2;
        gbcForDebit.insets = new Insets(0,200,10,300);
        add(clearAlLButton,gbcForDebit);


//        this is a button that takes in required inputs from the text fields and
//        checks various condition and calls the withdraw method to deduct the withdrawal amount from balance amount
        withDrawnButton.addActionListener(e -> {
            try {
                String cardIdForDebit = cardIdTf.getText();
                String withdrawalAmtForDebit = withDrawnAmountTf.getText();
                String pinNumberForDebit = pinNumberTf.getText();
                String dateOfWithdrawal = years[currentDateYear.getSelectedIndex()] + "-" + months[currentDateMonth.getSelectedIndex()] + "-" + days[currentDateDay.getSelectedIndex()];

                //if condition to check whether the arraylist is empty or not
                if(bankCards.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please add debit card in Bank Account first");
                }
                //condition to check if the text fields are empty or not
                else if(cardIdForDebit.isEmpty() || withdrawalAmtForDebit.isEmpty() || pinNumberForDebit.isEmpty() || currentDateYear.getSelectedIndex() == 0 || currentDateMonth.getSelectedIndex() == 0||currentDateDay.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                } else {
                    //              changing the string values from text fields into required double, int values.
                    int cardId = Integer.parseInt(cardIdForDebit);
                    int pinNumber = Integer.parseInt(pinNumberForDebit);
                    int withdrawalAmount = Integer.parseInt(withdrawalAmtForDebit);
                    boolean searchCard = false;
                    DebitCard debitCard = null;
                    // find the DebitCard object with the given cardId
                    //              It iterates over the "bankCards" ArrayList using the enhanced for loop syntax and checks each DebitCard object to find the one with the given card ID.
                    for (BankCard bankCard1 : bankCards) {
                        //usage of downcasting to access the object of bankcard
                        if (bankCard1 instanceof DebitCard) {
                            debitCard = (DebitCard) bankCard1;
                            if (debitCard.getCardId() == cardId) {
                                searchCard = true;
                                break;
                            }
                        }
                    }
                    if (searchCard) {
                        withdraw(debitCard, pinNumber, withdrawalAmount, dateOfWithdrawal);
//                        update the bankCards array with the newly updated debit card object
                        bankCards.set(bankCards.indexOf(debitCard), debitCard);
                    } else {
                        JOptionPane.showMessageDialog(null, "Card not found.Please enter valid card Id.");
                    }
                }
            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Please input valid number.");
            }
        });


        displayButton.addActionListener(e -> {
            new DisplayForDebit(bankCards);
        });

        backButton.addActionListener(e -> {
            dispose();
        });

        clearAlLButton.addActionListener(e -> {
            clear();
        });
    }



    public void clear() {
        cardIdTf.setText("");
        pinNumberTf.setText("");
        withDrawnAmountTf.setText("");
        currentDateYear.setSelectedIndex(0);
        currentDateMonth.setSelectedIndex(0);
        currentDateDay.setSelectedIndex(0);
    }

    //        Method to withdraw money
    public void withdraw(DebitCard debitCard,int pinNumber, int withdrawalAmount, String dateOfWithdrawal){
//        checking the pin of bank card with debit card
        if(debitCard.getPinNumber() == pinNumber){
//              checking whether the balance amount is smaller than withdrawal amount or not.
            if(debitCard.getBalanceAmount() < withdrawalAmount){
                JOptionPane.showMessageDialog(null, "Withdrawal Amount cannot be greater than balance amount.");
                return;
            }
//               calling the withdraw method from debit card
            debitCard.withdraw(pinNumber,withdrawalAmount,dateOfWithdrawal);
            JOptionPane.showMessageDialog(null, "Withdrawal of amount is successful");
            clear();
        }else{
            JOptionPane.showMessageDialog(null, "Please enter the correct pin number");
        }
    }
}












