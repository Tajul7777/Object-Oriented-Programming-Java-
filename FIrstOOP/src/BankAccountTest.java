/**
 * Created by swakkhar on 5/12/16.
 */
public class BankAccountTest {
    public static void main(String args[]){
        BankAccount accSwakkhar=new BankAccount();  // now it is alright
        BankAccount accSanjay = new BankAccount("Sanjay Saha",2000.0);

        BankAccount accAkash = new BankAccount("Akash Islam");
        BankAccount accDummy = new BankAccount(accSanjay);

        System.out.println("Account Name:"+accSwakkhar.getAccountName());
        System.out.println("Initial Balance:"+accSwakkhar.getBalance());

        System.out.println("Account Name:"+accSanjay.getAccountName());
        System.out.println("Initial Balance:"+accSanjay.getBalance());

        System.out.println("Account Name:"+accAkash.getAccountName());
        System.out.println("Initial Balance:"+accAkash.getBalance());

        System.out.println("Account Name:"+accDummy.getAccountName());
        System.out.println("Initial Balance:"+accDummy.getBalance());

    }
}


