package coursework;

/**
 * This class(DebitCard) is the child class of BankCard.
 * @author (Manisha KC)
 * @version (1.2 2023)
 */
public class DebitCard extends BankCard {
    private int pinNumber; // declaring pinNumber
    private int withdrawalAmount; // declaring withdrawalAmount
    private String dateOfWithdrawal; // declaring dateOfWithdrawal
    private boolean hasWithdrawn; // declaring hasWithdrawn

    /**
     * This is a parameterized constructor that accepts 6 parameters.
     */
    public DebitCard(int cardId, double balanceAmount, String issuerBank, String bankAccount, String clientName, int pinNumber) {
        super(cardId, balanceAmount, issuerBank, bankAccount); // calling cardId, balanceAmount, issuerBank, bankAccount from parent class
        super.setClientName(clientName); // calling clientName from parent class
        this.pinNumber = pinNumber; // initializing pinNumber
        this.hasWithdrawn = false; // initializing hasWithdrawn
    }

    //getter method of pinNumber
    public int getPinNumber() {
        return pinNumber;
    }

    //getter method of withdrawalAmount
    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    //getter method of dateOfWithdrawal
    public String getDateOfWithdrawal() {
        return dateOfWithdrawal;
    }

    //getter method of hasWithdrawn
    public boolean getHasWithdrawn() {
        return hasWithdrawn;
    }

    //setter method of withdrawalAmount
    public void setWithdrawalAmount(int withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    /**
     * This is a method to withdraw amount from debit card.
     */
    public void withdraw(int pinNumber, int withdrawalAmount, String dateOfWithdrawal) {
        if (pinNumber == this.pinNumber) {
            if (super.getBalanceAmount() >= withdrawalAmount) {
                hasWithdrawn = true;
                this.dateOfWithdrawal = dateOfWithdrawal;
                setBalance(getBalanceAmount() - withdrawalAmount);
                this.withdrawalAmount = withdrawalAmount;
                System.out.println("Withdrawal successful. New balance: " + super.getBalanceAmount());
            } else {
                System.out.println("Inadequate fund");
            }
        } else {
            System.out.println("Please enter the correct pin");
        }
    }

    /**
     * Method to display output for debit card.
     */
    public void display() {
        super.display();
        if (hasWithdrawn == true) {
            System.out.println("Pin Number: " + pinNumber);
            System.out.println("Amount of withdrawal: " + withdrawalAmount);
            System.out.println("Date of Withdrawal: " + dateOfWithdrawal);
        } else {
            System.out.println("Balance Amount: " + super.getBalanceAmount());
        }
    }
}
