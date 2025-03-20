class BankAccount {
    protected double balance;
    public BankAccount(double initialBalance){
        this.balance=initialBalance;
    }
    public void Deposit(double amount){
        if (amount > 0) {
            balance+=amount;
            System.out.println("Deposited:"+amount);
        }else {
            System.out.println("Invalid Deposit amount!!");
        }
    }
    public void Withdraw(double amount){
        if (amount > 0 && amount <= balance){
            System.out.println("Withdraw:"+amount);
        }else {
            System.out.println("Insufficient balance!!");
        }
    }
    public void DisplayBalance(){
        System.out.println("Current Balance:"+balance);
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialbalance) {
        super(initialbalance);
    }

    @Override
    public void Withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal Denied! minimum Rs.100 balance must be maintained");
        } else {
            super.Withdraw(amount);
        }
    }
}
public class BankApp{
    public static void main(String[] args){
        SavingsAccount myaccount= new SavingsAccount(500);
        myaccount.DisplayBalance();
        myaccount.Deposit(200);
        myaccount.DisplayBalance();
        myaccount.Withdraw(550);
        myaccount.DisplayBalance();
        myaccount.Withdraw(300);
        myaccount.DisplayBalance();
    }
}