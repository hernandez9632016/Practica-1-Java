package banco;
public class Principal {

    public static void main(String[] args) {
        Customer c = new Customer();
        c.Customer("Luis","Alberto");

        Account a = new Account();
        a.deposit(1500);
        a.withdraw(1200);
        System.out.println("Mi balance es: "+a.getBalance()+"\n");

        c.Customer("Luis","Alberto");
        Account a2 = new Account();
        a2.deposit(1700);
        a2.withdraw(1500);
        System.out.println("Mi balance es: "+a2.getBalance()+"\n");
    }
}