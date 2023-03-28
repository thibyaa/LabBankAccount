package org.example;

public class LabBankAccount {
    private String firstName;
    private String lastName;
    private String dateOfBirth; //look up LocalDate data type
    private int accountNumber;
    private int balance;

    public LabBankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth){
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDateOfBirth;
        this.accountNumber = 0;
        this.balance = 0;
    }

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

    public Integer getBalance(){
        return this.balance;
    }

    public void setBalance(Integer newBalance){
        this.balance = newBalance;
    }
}

