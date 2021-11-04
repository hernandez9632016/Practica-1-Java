package banco;
public class Customer extends Account{
    public String firstName;
    public String lastName;
    public Account account;

    public String Customer(String f, String l){
        firstName = f;
        lastName = l;
        System.out.println("Mi nombre completo es: "+firstName+" "+lastName);
        return f+l;
    }

    public String getFirstName() {
        System.out.println(firstName);
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account count) {
        account = count;
    }
}