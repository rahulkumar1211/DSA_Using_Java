package OOPS_Concepts;

public class Bank_Account {

    private String AccountNumber;
    private int Funds;
    private String Email;
    private String PhoneNumber;
    private String CustomerName;

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public void setFunds(int funds) {
        if(funds<0){
            System.out.println("Please enter the value greater than zero");
        }
        Funds = funds;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public int getFunds() {
        return Funds;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void Deposit(int amount){
        if(amount<=0){
            System.out.println("Please enter the amount greater than zero");
            return;
        }
        Funds+=amount;
        System.out.println(amount+" has been deposited. Bank Balance is: "+Funds);
    }
    public void Withdraw(int amount){
        if(amount>Funds){
            System.out.println("Sorry!!!...Insufficient balance in account");
            return;
        }
        Funds-=amount;
        System.out.println("You have withdrawn "+amount+". Your current Balance is: "+Funds);
    }
}
