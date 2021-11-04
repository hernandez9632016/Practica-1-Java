package banco;

public class Account {
    public double balance;

    public Double Account(Double intBalance){
        balance = intBalance;
        return intBalance;
    }

    public double getBalance() {
        return balance;
    }

    public Double deposit(double dep){
        balance = balance + dep;
        return balance;
    }

    public Double withdraw(double dep){
        balance = balance - dep;
        return balance;
    }
}
