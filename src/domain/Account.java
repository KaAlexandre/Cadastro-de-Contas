package domain;

public class Account {
    private String accountNumber ="8532";
    private double valorDeposito;
    private double balanceAccount;
    public Owner owner;
    private static final double WIDTHDRAWAL = 5;

    public Account(String accountNumber, Owner owner, double balanceAccount) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balanceAccount = balanceAccount;
    }

    public void deposit (double amount){
        this.balanceAccount += amount;
    }

    public void withdrawal (double amount){
        this.balanceAccount -= (amount+5);
    }


    public void print(){
        System.out.println("Account "+ accountNumber);
        System.out.println("Holder: "+owner.name);
        System.out.println("Balance: "+ balanceAccount);
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }
}
