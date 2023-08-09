package views;

import components.MyTextField;
import components.MyButton;
import components.MyHeading;
import components.MyLabel;
import coursework.BankCard;
import coursework.CreditCard;
import coursework.DebitCard;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

//This code declares a public class named "Bank" that inherits from the JFrame class.
public class
Bank extends JFrame {

    public MyButton credentialButton, addCreditButton, addDebitButton, backButton, displayButton, clearButton ;

    public MyHeading bankLabel, debitLabel, creditLabel ;

    public MyLabel clientNameLabel, balanceAccountLabel, balanceAmountLabel, issuerBankLabel, cardIdLabel, pinNumberLabel, cvcNumberLabel,interestRateLabel, creditLimitLabel, gracePeriodLabel, expirationDateLabel ;


    public MyTextField clientNameTf, cardIdTf, balanceAccountTf, balanceAmountTf, issuerBankTf, pinNumberTf, cvcNumberTf, interestRateTf, creditLimitTf, gracePeriodTf;

    public JComboBox currentDateDay, currentDateMonth, currentDayYear;

    public Bank(ArrayList<BankCard> bankCards) {
        super("NBL");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,900);
        setLocationRelativeTo(null);
        setVisible(true);

        addCreditButton = new MyButton("Add Credit");
        addDebitButton = new MyButton("Add Debit");
        backButton = new MyButton("Back");
        displayButton = new MyButton("Display");
        clearButton = new MyButton("Clear All");

        bankLabel = new MyHeading("Bank Card");
        debitLabel = new MyHeading("Add Debit Card!");
        creditLabel = new MyHeading("Add Credit Card!");

        clientNameLabel = new MyLabel("Client Name");
        cardIdLabel = new MyLabel("Card ID");
        balanceAmountLabel = new MyLabel("Balance Amount");
        balanceAccountLabel = new MyLabel("Balance A/C");
        issuerBankLabel = new MyLabel("Issuer Bank");


        pinNumberLabel = new MyLabel("Pin Number");

        cvcNumberLabel = new MyLabel("CVC Number");
        interestRateLabel = new MyLabel( "Interest Rate");
        creditLimitLabel = new MyLabel("Credit Limit");
        gracePeriodLabel = new MyLabel("Grace Period");
        expirationDateLabel = new MyLabel("Expiration Date");

        clientNameTf = new MyTextField("");
        cardIdTf= new MyTextField("");
        balanceAccountTf = new MyTextField("");
        balanceAmountTf = new MyTextField("");
        issuerBankTf = new MyTextField("");
        pinNumberTf= new MyTextField("");
        cvcNumberTf= new MyTextField("");
        interestRateTf= new MyTextField("");
        creditLimitTf= new MyTextField("");
        gracePeriodTf= new MyTextField("");

        String years[] = {"Select Date","2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029","2030"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08","09", "10", "11" ,"13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",
                "27" ,"28", "29", "30", "31", "32"};
        currentDayYear = new JComboBox<>(years);
        currentDateMonth = new JComboBox<>(months);
        currentDateDay = new JComboBox<>(days);

        GridBagLayout gblForBank = new GridBagLayout();
        GridBagConstraints gbcForBank = new GridBagConstraints();
        setLayout(gblForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=0;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(10,200,50,0);
        add(bankLabel,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=1;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(clientNameLabel,gbcForBank);


        gbcForBank.gridx=1;
        gbcForBank.gridy=1;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(clientNameTf,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=2;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(cardIdLabel,gbcForBank);


        gbcForBank.gridx=1;
        gbcForBank.gridy=2;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(cardIdTf,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=3;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(balanceAccountLabel,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=3;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(balanceAccountTf,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=4;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,230);
        add(balanceAmountLabel,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=4;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(balanceAmountTf,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=5;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(issuerBankLabel,gbcForBank);


        gbcForBank.gridx=1;
        gbcForBank.gridy=5;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(issuerBankTf,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=7;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(30,100,40,0);
        add(creditLabel,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=8;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(cvcNumberLabel,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=8;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(cvcNumberTf,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=9;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(interestRateLabel,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=9;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(interestRateTf,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=10;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(creditLimitLabel,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=10;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(creditLimitTf,gbcForBank);


        gbcForBank.gridx=0;
        gbcForBank.gridy=11;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(gracePeriodLabel,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=11;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(gracePeriodTf,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=12;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(expirationDateLabel,gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 12;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 20, 10, 0);
        add(currentDayYear,gbcForBank);

        gbcForBank.gridx = 1;
        gbcForBank.gridy = 12;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, 280, 10, 0);
        add(currentDateMonth,gbcForBank);


        gbcForBank.gridx = 2;
        gbcForBank.gridy = 12;
        gbcForBank.gridwidth = 2;
        gbcForBank.insets = new Insets(0, -80, 10, 100);
        add(currentDateDay,gbcForBank);


        gbcForBank.gridx=0;
        gbcForBank.gridy=13;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,200,10,0);
        add(addCreditButton,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=14;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(30,100,40,0);
        add(debitLabel,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=15;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,0,10,200);
        add(pinNumberLabel,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=15;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,135,10,0);
        add(pinNumberTf,gbcForBank);

        gbcForBank.gridx=1;
        gbcForBank.gridy=16;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,120,40,0);
        add(addDebitButton,gbcForBank);


        gbcForBank.gridx=0;
        gbcForBank.gridy=19;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,250,10,0);
        add(backButton,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=18;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,500,10,30);
        add(displayButton,gbcForBank);

        gbcForBank.gridx=0;
        gbcForBank.gridy=18;
        gbcForBank.gridwidth=2;
        gbcForBank.insets = new Insets(0,300,10,300);
        add(clearButton,gbcForBank);




        addDebitButton.addActionListener(e -> {
            String balance = balanceAmountTf.getText();
            String card = cardIdTf.getText();
            String bankAccount = balanceAccountTf.getText();
            String issuerBank = issuerBankTf.getText();
            String clientName = clientNameTf.getText();
            String pin = pinNumberTf.getText();

            if (balance.equals("") || card.equals("") || bankAccount.equals("") || issuerBank.equals("") || clientName.equals("")) {
                JOptionPane.showMessageDialog( null, "Please fill the credentials for bank card");
            } else if (pin.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill your secret  pin number.");
            } else {
                try {
                    double balanceAmount = Double.parseDouble(balance);
                    int cardId = Integer.parseInt(card);
                    int pinNumber = Integer.parseInt(pin);
                    DebitCard debitCard = new DebitCard(cardId, balanceAmount, issuerBank, bankAccount, clientName, pinNumber);
                    bankCards.add(debitCard);
                    JOptionPane.showMessageDialog(null, "Debit Card added successfully");
                    clearForDebit();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,"Please enter the valid input for the fields");
                }
            }
        });

        displayButton.addActionListener(e -> {
            new DisplayForDebit(bankCards);
        });

        addCreditButton.addActionListener(e -> {
            String balance = balanceAmountTf.getText();
            String card = cardIdTf.getText();
            String bankAccount = balanceAccountTf.getText();
            String issuerBank = issuerBankTf.getText();
            String clientName = clientNameTf.getText();
            String cvcNum = cvcNumberTf.getText();
            String interestRt = interestRateTf.getText();
            String expirationDate = years[currentDayYear.getSelectedIndex()] + "-" + months[currentDateMonth.getSelectedIndex()] + "-" + days[currentDateDay.getSelectedIndex()];

            if (balance.equals("") || card.equals("") || bankAccount.equals("") || issuerBank.equals("") || clientName.equals("") ) {
                JOptionPane.showMessageDialog(null, "Please fill the credentials for bank card");
            }else if(cvcNum.equals("") || interestRt.equals("") || currentDayYear.getSelectedIndex() == 0 || currentDateMonth.getSelectedIndex() == 0 || currentDateDay.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null, "Please provide the inputs for credit.");
            }
            else {
                try {
                    double balanceAmount = Double.parseDouble(balance);
                    int cardId = Integer.parseInt(card);
                    int cvcNumber = Integer.parseInt(cvcNum);
                    int interestRate = Integer.parseInt(interestRt);

                    CreditCard creditCard = new CreditCard(cardId, balanceAmount, issuerBank, bankAccount, clientName, cvcNumber, interestRate, expirationDate);
                    bankCards.add(creditCard);
                    JOptionPane.showMessageDialog(null, "Credit Card added successfully");
                    clearForCredit();
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Please enter the valid input for the fields");
                }
            }
        });


        addCreditButton.addActionListener(e -> {
            new DisplayForCredit(bankCards);
        });

        backButton.addActionListener(e -> {
            dispose();
        });

//        Button to clear all the text fields
        clearButton.addActionListener(e -> {
            clear();
        });
    }
    //    Method to clear all the text fields
    public void clear(){
        clientNameTf.setText("");
        cardIdTf.setText("");
        issuerBankTf.setText("");
        balanceAccountTf.setText("");
        balanceAmountTf.setText("");
        pinNumberTf.setText("");
        cvcNumberTf.setText("");
        interestRateTf.setText("");
        currentDayYear.setSelectedIndex(0);
        currentDateMonth.setSelectedIndex(0);
        currentDateDay.setSelectedIndex(0);
        gracePeriodTf.setText("");
        creditLimitTf.setText("");

    }
    public void clearForDebit(){
        pinNumberTf.setText("");
    }

    public void clearForCredit(){
        cvcNumberTf.setText("");
        interestRateTf.setText("");
        currentDayYear.setSelectedIndex(0);
        currentDateMonth.setSelectedIndex(0);
        currentDateDay.setSelectedIndex(0);
        gracePeriodTf.setText("");
        creditLimitTf.setText("");
    }

}

