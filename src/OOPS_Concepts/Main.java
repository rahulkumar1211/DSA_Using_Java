package OOPS_Concepts;

public class Main {
    public static void main(String[] args) {
        Bank_Account Customer1= new Bank_Account();
        Customer1.setCustomerName("Rahul Kumar");
        Customer1.setEmail("rk.0353@gmail.com");
        Customer1.setPhoneNumber("5578945786");
        Customer1.setAccountNumber("DJAPKEDS85769854");
        Customer1.setFunds(700);

        System.out.println(Customer1.getAccountNumber());

        Customer1.Deposit(500);
        Customer1.Withdraw(500);
        Customer1.Withdraw(1000);
        Customer1.Deposit(10000);
        Customer1.Withdraw(8000);
    }
}
