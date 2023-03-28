package org.example;
import java.util.Scanner;

public class LabBankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth; //look up LocalDate data type
    private Integer accountNumber;
    private Double balance;

    public LabBankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = 0;
        this.balance = 0.00;
    }

//    CUSTOM METHODS
    public Double deposit(double depositedBalance) {
        if (depositedBalance > 0) {
             this.balance += depositedBalance;
        } return depositedBalance;
    }

    public Double withdrawal(double withdrawalBalance) {
        if (withdrawalBalance > 0) {
            this.balance -= withdrawalBalance;
        } return withdrawalBalance;
    }

    public Double payInterest() {
           return this.balance *= 0.1;
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
}

