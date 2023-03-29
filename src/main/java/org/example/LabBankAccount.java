package org.example;
import java.util.Scanner;

public class LabBankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth; //look up LocalDate data type
    private Integer accountNumber;
    private Double balance;
    private String accountType;
    private Double overdraft;


    public LabBankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountType = "";
        this.accountNumber = 0;
        this.balance = 0.00;
        this.overdraft = -10.00;
    }

//    CUSTOM METHODS
    public Double deposit(double depositedBalance) {
        if (depositedBalance > 0) {
             this.balance += depositedBalance;
        } return depositedBalance;
    }

//    public Double withdrawal(double withdrawalBalance) {
//        can withdraw up to the overdraft
//        if (withdrawalBalance > this.overdraft && ) {
//            this.balance -= withdrawalBalance;
//        } else if (withdrawalBalance <= this.overdraft){
//            return this.balance
//        }
//        return withdrawalBalance;
//    }

    public Double payInterest(double inputBalance, String inputAccountType) {
        this.balance = inputBalance;
        this.accountType = inputAccountType;
        if (this.accountType == "Savings Account") {
            double interestRateMoney = inputBalance * 0.1;
            this.balance += interestRateMoney;
        } else if (this.accountType == "Current Account"){
            double interestRateMoney = inputBalance * 0.3;
            this.balance += interestRateMoney;
        } return this.balance;
    }

//    GETTERS AND SETTERS
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String newDateOfBirth){
        this.dateOfBirth = newDateOfBirth;
    }

    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(Integer newAccountNumber){
        this.accountNumber = newAccountNumber;
    }

    public Double getBalance(){
        return this.balance;
    }

    public void setBalance(Double newBalance){
        this.balance = newBalance;
    }

    public String getAccountType(){
        return this.accountType;
    }

    public void setAccountType(String newAccountType){
        this.accountType = newAccountType;
    }
}

