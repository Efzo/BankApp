package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("WELCOME TO BLUE SKY BANK");
        System.out.println("==========================\n");
	    BankApp efosaojomo = new BankApp();
	    efosaojomo.info();

	   while (1 < 2){
           int i = 1;
           int choice = 0;
           do {
               efosaojomo.task();
           }while (i < 2);
           i++;
           System.out.println("To perform another operation\n Press 1 to Continue\n Press any key to exit\n:");
           Scanner sc =  new Scanner(System.in);
           if (choice == 1){
               efosaojomo.task();
           }else if(choice != 1){
               System.out.println("Wrong Input, Try Again!!!");
           }else {
               System.exit(0);
           }
       }





    }
}
