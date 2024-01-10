package demo;

public class Transaction {
    private int transID;
    private BankAccount sourceAccount;
    private BankAccount destAccount;
    private String transType;
    private double amount;

    //Constructor
    public Transaction(int transID, BankAccount sourceAccount, BankAccount destAccount, String transType, double amount){
        this.transID = transID;
        this.sourceAccount =sourceAccount;
        this.destAccount = destAccount;
        this.transType = transType;
        this.amount = amount;
    }

    //Getters and setters
    public int getTransID() {
        return transID;
    }
    public void setTransID(int transID) {
        this.transID = transID;
    }

    public BankAccount getSourceAccount() {
        return sourceAccount;
    }
    public void setSourceAccount(BankAccount sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public BankAccount getDestAccount() {
        return destAccount;
    }
    public void setDestAccount(BankAccount destAccount) {
        this.destAccount = destAccount;
    }

    public String getTransType() {
        return transType;
    }
    public void setTransType(String transType) {
        this.transType = transType;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Methods
    public String toSting(){
        String result =  "Transaction: " + "transactionId=" + transID + ", sourceAccount=" + sourceAccount + ", destinationAccount=" + destAccount + ", transactionType='" + transType +", amount=" + amount + ".";
        return result;
    }



}
