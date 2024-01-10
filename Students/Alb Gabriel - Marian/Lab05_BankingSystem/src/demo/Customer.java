package demo;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerID;
    private String name;
    private String contactInfo;
    private List<BankAccount> accounts;

    //Constructor
    public Customer(int customerID, String name, String contactInfo){
        this.contactInfo = contactInfo;
        this.customerID = customerID;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    //Getters and setters
    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<BankAccount> accounts) {
        this.accounts = accounts;
    }

    //Methods
    public void addAcount(BankAccount ac){
        accounts.add(ac);
    }

    @Override
    public String toString() {
        String result;
        result = "Customer: " + "customerId=" + customerID + ", name='" + name + ", contactInfo='" + contactInfo + ", accounts=" + accounts + ".";
        return result;
    }



}
