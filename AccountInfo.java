package BankingApplication;

public class AccountInfo {
    private double balance;
    private final String customerName;
    private final int customerAccountNo;
    private final int pinNumber;

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerAccountNo() {
        return customerAccountNo;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountInfo(String customerName, int customerAccountNo, int pinNum, double balance) {
        this.customerName = customerName;
        this.customerAccountNo = customerAccountNo;
        this.pinNumber = pinNum;
        this.balance = balance;
    }


}
