package codesoft;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        atm l = new atm();
        l.info();
        do{
        System.out.println("\nMain menu\n1. With Draw\n2. Deposit\n3. Check Balance\n4. Exit\n ");    
        choice = sc.nextInt();
        if(choice==1){
            l.withdraw(0);
        }
        if(choice==2){
            l.deposit(0);
        }
        if(choice==3){
            l.checkBalance();
        }
        }while(choice!=4);
    }
}
class atm extends userBankAccount{
    public void info(){
        details();
        printDetails();
    }
    public void withdraw(int amount){
        System.out.println("Enter money to be withdrawn: ");    
        amount = sc.nextInt();
        if(amount <= moneyAmount){
        moneyAmount = moneyAmount - amount;
        System.out.println("Successful transaction!\nCurrent balance after withdrawing: "+moneyAmount);}
        else{
            System.out.println("Insufficient balance!");
        }
    }
    public void deposit(int amount){
        System.out.println("Enter money to be deposited: ");    
        amount = sc.nextInt();
        moneyAmount = moneyAmount + amount;
        System.out.println("Deposited!\nCurrent balance after depositing: "+moneyAmount);
    }
    public void checkBalance(){
        System.out.println("Current balance: "+moneyAmount);
    }
}
class userBankAccount{
    Scanner sc = new Scanner(System.in);
    int moneyAmount,id;
    String name;
    public void details(){
    System.out.print("Enter your Name: ");
    name = sc.nextLine();
    System.out.print("Enter your ID: ");    
    id = sc.nextInt();
    System.out.print("Enter your Balance in account: ");    
    moneyAmount = sc.nextInt();
    }
    public void printDetails(){
        System.out.println("Name: "+name+"\nID: "+id+"\nBalance: "+moneyAmount);
    }
}