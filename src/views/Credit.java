package views;
import components.MyButton;
import components.MyHeading;
import components.MyLabel;
import components.MyTextField;
import coursework.BankCard;
import coursework.CreditCard;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.ArrayList;

public class Credit extends JFrame {

    public MyButton setButton, cancelButton, backButton, clearForCreditButton, displayButton;


    public MyHeading creditLabel, setCreditLimitLabel, cancelCreditCardLabel;


    public MyLabel cardIdLabel, creditLimitLabel, gracePeriodLabel ;

    public MyTextField cardIdTf, creditLimitTf, gracePeriodTf;

    public Credit(ArrayList<BankCard> bankCards){
        super("Credit");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,800);
        setLocationRelativeTo(null);
        setVisible(true);



        setButton = new MyButton("Set");
        cancelButton= new MyButton("cancel Credit Card");
        backButton= new MyButton("Back");
        clearForCreditButton= new MyButton("Clear All");
        displayButton= new MyButton( "Display");

        creditLabel = new MyHeading("Credit Card Details");
        setCreditLimitLabel= new MyHeading("Set your credit limit");
        cancelCreditCardLabel= new MyHeading("Cancel credit card");

        cardIdLabel = new MyLabel("Card Id");
        creditLimitLabel= new MyLabel("Credit Limit");
        gracePeriodLabel= new MyLabel("Grace period");

        cardIdTf= new MyTextField("");
        creditLimitTf = new MyTextField("");
        gracePeriodTf = new MyTextField("");


        GridBagLayout gblForCredit = new GridBagLayout();
        GridBagConstraints gbcForCredit = new GridBagConstraints();
        setLayout(gblForCredit);

        gbcForCredit.gridx=0;
        gbcForCredit.gridy=0;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,150,50,150);
        add(creditLabel,gbcForCredit);

        gbcForCredit.gridx=0;
        gbcForCredit.gridy=1;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,0,50,200);
        add(cardIdLabel,gbcForCredit);


        gbcForCredit.gridx=1;
        gbcForCredit.gridy=1;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,150,50,0);
        add(cardIdTf,gbcForCredit);


        gbcForCredit.gridx=0;
        gbcForCredit.gridy=2;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,150,50,150);
        add(setCreditLimitLabel,gbcForCredit);

        gbcForCredit.gridx=0;
        gbcForCredit.gridy=3;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,0,10,200);
        add(creditLimitLabel,gbcForCredit);


        gbcForCredit.gridx=1;
        gbcForCredit.gridy=3;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,150,10,0);
        add(creditLimitTf,gbcForCredit);


        gbcForCredit.gridx=0;
        gbcForCredit.gridy=4;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,0,10,200);
        add(gracePeriodLabel,gbcForCredit);


        gbcForCredit.gridx=1;
        gbcForCredit.gridy=4;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,150,10,0);
        add(gracePeriodTf,gbcForCredit);


        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 5;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(40, 200, 40, 200);
        add(setButton, gbcForCredit);

        gbcForCredit.gridx=0;
        gbcForCredit.gridy=6;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,150,50,150);
        add(cancelCreditCardLabel,gbcForCredit);


        gbcForCredit.gridx = 0;
        gbcForCredit.gridy = 7;
        gbcForCredit.gridwidth = 2;
        gbcForCredit.insets = new Insets(0, 200, 40, 200);
        add(cancelButton, gbcForCredit);

        gbcForCredit.gridx=0;
        gbcForCredit.gridy=9;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,200,10,200);
        add(backButton,gbcForCredit);

        gbcForCredit.gridx=0;
        gbcForCredit.gridy=8;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,300,10,30);
        add(displayButton,gbcForCredit);

        gbcForCredit.gridx=0;
        gbcForCredit.gridy=8;
        gbcForCredit.gridwidth=2;
        gbcForCredit.insets = new Insets(0,10,10,300);
        add(clearForCreditButton,gbcForCredit);

        setButton.addActionListener(e -> {
          try{
            String cardIdForCredit = cardIdTf.getText();
            String creditLimitForCredit = creditLimitTf.getText();
            String gracePeriodForCredit = gracePeriodTf.getText();
            if(bankCards.isEmpty()){
                JOptionPane.showMessageDialog(null,"Please add credit card in Bank Account ");
            } else if (cardIdForCredit.isEmpty() || creditLimitForCredit.isEmpty() || gracePeriodForCredit.isEmpty() ){
                JOptionPane.showMessageDialog(null,"Fields fillup is mandatory");
            }else{

                    int cardId = Integer.parseInt(cardIdForCredit);
                    double newCreditLimit = Double.parseDouble(creditLimitForCredit);
                    int newGracePeriod = Integer.parseInt(gracePeriodForCredit);
                    boolean searchCard = false;
                    CreditCard creditCard = null;

                //It iterates over the "bankCards" ArrayList using the enhanced for loop syntax and checks each credit card object to find the one with the given card ID.
                for (BankCard bankCard1 : bankCards) {
                    //usage of downcasting to access the object of bankcard
                    if (bankCard1 instanceof CreditCard) {
                        creditCard = (CreditCard) bankCard1;
                        // checking if the card id of credit id matches with the card id of arraylist
                        if (creditCard.getCardId() == cardId) {
                            searchCard = true;
                            break;
                        }
                    }
                }
                if (searchCard) {
//                      calling the method set credit limit to set the credit limit.
                    setCreditLimit(creditCard,newCreditLimit,newGracePeriod);
                    // update the bankCards array with the newly updated credit card object
                    bankCards.set(bankCards.indexOf(creditCard), creditCard);
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill the correct Card Id");
                }
            }
                }catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(null,"Please fill the correct value for the fields");
                }
        });

        cancelButton.addActionListener(e ->  {
        try {
            String cardIdForCreditCancel = cardIdTf.getText();

            //checks if the arraylist is empty
            if (bankCards.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please add credit card in Bank A/C first");
            } else if (cardIdForCreditCancel.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill up the fields");
            } else {
                int cardID = Integer.parseInt(cardIdForCreditCancel);
                boolean searchCard = false;
                CreditCard creditCard = null;
//                    It iterates over the "bankCards" ArrayList using the enhanced for loop syntax and checks each credit card object to find the one with the given card ID.
                for (BankCard bankCard2 : bankCards) {
                    //usage of downcasting to access the object of bankcard
                    if (bankCard2 instanceof CreditCard) {
                        creditCard = (CreditCard) bankCard2;
                        if (creditCard.getCardId() == cardID) {
                            searchCard = true;
                            break;
                        }
                    }
                }
                if(searchCard){
                    //call the cancelcreditcard method from creditcard
                    cancelCreditCard(creditCard);
                    //updates the bankcard array with newly updated credit card object
                    bankCards.set(bankCards.indexOf(creditCard), creditCard);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter the valid Card Id");
                }
            }
        }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter the valid input");
        }
    });





        displayButton.addActionListener(e -> {
            new DisplayForCredit(bankCards);
        });

        backButton.addActionListener(e -> {
            dispose();
        });

        clearForCreditButton.addActionListener(e -> {
            clear();
        });

    }

    public void clear() {
        cardIdTf.setText("");
        gracePeriodTf.setText("");
        creditLimitTf.setText("");
    }


    //a method to set the credit limit of credit card
    public void setCreditLimit(CreditCard creditCard,double newCreditLimit, int newGracePeriod){
        if (newCreditLimit >= 2.3 * creditCard.getBalanceAmount()){
            JOptionPane.showMessageDialog(null, "Your credit limit cannot be more than 2.3 times the balance amount.");
        }else {
            creditCard.setCreditLimit(newCreditLimit,newGracePeriod);//calling the setCreditLimit method from credit card.
            JOptionPane.showMessageDialog(null, " credit limit  set.");
            clear();
        }
    }

    //    a method to cancel the credit card
    public void cancelCreditCard(CreditCard creditCard){
        creditCard.cancelCreditCard();//calling the cancelcreditcard method from credit card
        JOptionPane.showMessageDialog(null, "credit card cancelled");
        clear();
    }
}




