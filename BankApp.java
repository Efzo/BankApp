package com.company;

import java.util.Scanner;

public class BankApp {
    private String accountName;
    private int balance = 0;
    private int deposit;
    private int withdraw;

    // constructor
    public BankApp() {
        this.balance = balance;
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    // getter
    public String getAccountName(){return accountName;}
    public int getBalance(){return balance;}
    public int getDeposit(){ return deposit;}
    public int getWithdraw(){ return withdraw;}

    // setters
    public void setAccountName(String accountName){ this.accountName = accountName;}
    public void setBalance (int balance) { this.balance = balance;}
    public  void setDeposit (int deposit) { this.deposit = deposit;}
    public  void  setWithdraw( int withdraw) { this.withdraw = withdraw;}



    public String info(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Please what is your name: ");
        String name = sc.nextLine();
        System.out.print("\nWhat would you like to do " + name + ":\n" );
        return null;
    }

        public String task(){
        System.out.print("1. Check Account Balance\n2. Make a Deposit\n3. Make a withdrawal\n4. To exit");
        System.out.print("\n:");
        Scanner sc =  new Scanner(System.in);
        int choice = sc.nextInt();
        if ( choice == 1){
            checkAccountBalance();

        }else if(choice == 2 ){
            makeDeposit();
            
        }else if(choice == 3){
          makeWithdrawal();

        }else if (choice == 4){
            System.exit(0);
        }
        
        else {
            System.out.println("Wrong input. Try again!!!");
            return info();
        }

        return accountName;
    }


    // Check account balance
    public int checkAccountBalance(){
        System.out.println("Account balance is: " + "$"+balance  );
        return   balance ;
    }


      // make a deposit
    public int makeDeposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter amount to deposit: ");
        int newDeposit = sc.nextInt();
        balance =  (deposit + newDeposit);
        System.out.println("You deposited " + "$"  +newDeposit + " successfully;");
        return balance;
    }

    // make withdrawal
    public int makeWithdrawal(){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Please enter amount to withdraw: ");
        int newWithdrawal  = sc.nextInt();
        balance -= newWithdrawal;
        System.out.println("You have withdrawn " +  "$"  +newWithdrawal + " successfully");
        return balance;
    }








}

