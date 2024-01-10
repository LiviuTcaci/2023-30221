package demo;
import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private int accountNumber;
    private String accounttype;
    private double balance;
    private List<Transaction> transactions;

    //Constructor
    public BankAccount(int accountNumber, String accounttype){
        this.accountNumber = accountNumber;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    //Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccounttype() {
        return accounttype;
    }
    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    //Methods
    public void addTrans(Transaction trans){
        transactions.add(trans);
    }

    @Override
    public String toString(){
        String result = "BankAccount: " + "accountNumber=" + accountNumber + ", accountType='" + accounttype + ", balance=" + balance + ", transactions=" + transactions + ".";
        return result;
    }



}
