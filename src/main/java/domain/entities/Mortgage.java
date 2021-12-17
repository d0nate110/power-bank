package domain.entities;

import domain.constants.MortgageStatus;

public class Mortgage {

    private long customerSSN;
    private long loanID;
    private double time;
    private double interestRate;
    private double initialDeposit;
    private double totalValue;
    private double monthPayment;
    private String status;

    public Mortgage(long customerSSN, long loanID, double time, double initialDeposit, double totalValue, double monthPayment){

        this.customerSSN = customerSSN;
        this.loanID = loanID;
        this.time = time;
        this.interestRate = 0.03;
        this.initialDeposit = initialDeposit;
        this.totalValue = totalValue;
        this.monthPayment = monthPayment;
        this.status = MortgageStatus.pending;
    }

    public boolean equals(Mortgage mortgage){
        return (this.getLoanID() == mortgage.getLoanID()) && (this.getCustomerSSN() == mortgage.getCustomerSSN());
    }

    public long getCustomerSSN() {
        return customerSSN;
    }

    public void setCustomerSSN(long customerSSN) {
        this.customerSSN = customerSSN;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public double getMonthPayment() {
        return monthPayment;
    }

    public void setMonthPayment(double monthPayment) {
        this.monthPayment = monthPayment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getLoanID() {
        return loanID;
    }

    public void setLoanID(long loanID) {
        this.loanID = loanID;
    }
}