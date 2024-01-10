package demo;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Customer c = new Customer(1234, "Florin Piersic", "fpiersic@nustiu.com");
        BankAccount saveAccount = new BankAccount(1, "Savings");
        c.addAcount(saveAccount);
        BankAccount checkAccount = new BankAccount(2, "Checking");
        c.addAcount(checkAccount);
        System.out.println(c.toString());

        
    }
}