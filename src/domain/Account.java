package domain;

public class Account {
    private String accountNumber = "8532";
    private double valorDeposito;
    private double balanceAccount;
    public Owner owner;
    private static final double WITHDRAWAL = 5;

    public Account(String accountNumber, Owner owner, double balanceAccount) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balanceAccount = balanceAccount;
    }

    public void deposit(double amount) {
        this.balanceAccount += amount;
    }

    public void withdrawal(double amount) {
        this.balanceAccount -= (amount + WITHDRAWAL);
    }

    public void print() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + owner.getName());
        System.out.println("Balance: " + balanceAccount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(double valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public void setBalanceAccount(double balanceAccount) {
        this.balanceAccount = balanceAccount;
    }

    public double getBalanceAccount() {
        return balanceAccount;
    }

    // Adicionando o getter para Owner
    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
