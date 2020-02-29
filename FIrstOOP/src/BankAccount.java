/**
 * Created by swakkhar on 5/12/16.
 */
public class BankAccount {
    private String accountName;
    private double balance;

    public BankAccount()
    {
        accountName="";
        balance=0.0;
    }

    public BankAccount(String name){
        accountName =  name;
        balance = 0.0;
    }

    public BankAccount(String name, double amount){
        accountName =  name;
        balance = amount;
    }

    public BankAccount(BankAccount other){
        accountName =  other.getAccountName();
        balance = other.getBalance();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

