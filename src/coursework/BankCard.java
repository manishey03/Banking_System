package coursework;
/**
 * This class(bankCard) is the parent class of debitCard and creditCard.
 * @author (Manisha KC)
 * @version (1.2 2023)
 */
public class BankCard
{
    private int cardId ;//declaring cardId
    private double balanceAmount; // declaring balanceAmount
    private String bankAccount;// declaring bankAccount
    private String issuerBank;// declaring issuerBank
    private String clientName;// declaring clientName

    //This is no argument constructor
    protected BankCard()
    {

    }

    //This is a parameterized constructor that accepts 4 parameters.
    protected BankCard(int cardId, double balanceAmount, String issuerBank, String bankAccount)
    {
        this.cardId = cardId; //intializing cardId
        this.balanceAmount = balanceAmount; // intializing balanceAmount
        this.bankAccount = bankAccount;// intializing bankAccount
        this.issuerBank = issuerBank;// intializing issuerBank
        this.clientName="";// intializing clientName
    }

    //getter method for cardId
    public int getCardId()
    {
        return cardId;
    }
    // getter method for BalanceAmount
    public double getBalanceAmount()
    {
        return balanceAmount;
    }
    // getter method for BankAccount
    public String getBankAccount()
    {
        return bankAccount;
    }
    // getter method for IssuerBank
    protected String getIssuerBank()
    {
        return issuerBank;
    }
    // getter method for ClientName
    public String getClientName()
    {
        return clientName;
    }
    // setter method for client name
    protected void setClientName(String newClientName)
    {
        this.clientName = newClientName;
    }
    // setter method for BalanceAmount
    protected void setBalance(double newBalanceAmount)
    {
        this.balanceAmount = newBalanceAmount;
    }
    //Method to display output for bank card
    protected void display()
    {
        if(clientName ==  "")
        {
            System.out.println("Please assign the client name.");
        }else{
            System.out.println("client name is " + clientName);
            System.out.println("card ID is " + cardId);
            System.out.println("balanceAmount is " + balanceAmount);
            System.out.println("issuer bank is " + issuerBank);
            System.out.println("bank account is " + bankAccount);
        }
    }



}

