package codesoft;

import java.util.Random;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        System.out.println(" \nNow it's time for you to play!\n");
	System.out.println("Guess the number!\n\nHint: 1 < number < 100 :)");
    task1 o1 = new task1();
        System.out.println("--------------------------------------------------");
    o1.match1();    
        System.out.println("\n--------------------------------------------------");

    o1.match2();   
        System.out.println("\n--------------------------------------------------");

    o1.match3();
        System.out.println("\n--------------------------------------------------");

    }   
}
class task1{
    int x;
    int guessno;
    int attempt = 0;    
    int attempt2 = 0;
    int attempt3 = 0;

    Scanner sc = new Scanner(System.in);
    public void match1(){
        Random random = new Random();
        x = random.nextInt(100);
//        System.out.println("Random number: " + x);
        System.out.println("In round 1 you have 5 allowed attemps!");
        do{
        System.out.print("\nGuess for the generated number: ");
        guessno = sc.nextInt();
        attempt++;
        
        if (guessno == x) {
	System.out.printf("**** Hey! you got the number in %d attempts ****",attempt);
	}
	if (guessno < 1 || guessno > 100) {
	System.out.printf("The number doesn't match the criteria.");
	}
	if (guessno < x && guessno < 100) {
	System.out.printf("The number is smaller than the generated number.");
	if ((x % 2) == 0) {
	System.out.printf("\nHint: * The number is even. *");
	}
	else {
	System.out.printf("\nHint: * The number is odd. *");
	}
	}
	if (guessno > x && guessno < 100) {
	System.out.printf("The number is greater than the generated number.");
	if ((x % 2) == 0) {
	System.out.printf("\nHint: * The number is even. *");
	}
	else {
	System.out.printf("\nHint: * The number is odd. *");
	}
	}
        if(guessno != x && attempt == 5 ){
            System.out.println("\nfailed!");
            System.out.printf("The number was %d :(",x);
            break;
        }
        }while (guessno != x );
    }  
    public void match2(){
        if (guessno == x) {
        Random random = new Random();
        x = random.nextInt(100);
//        System.out.println("\nRandom number: " + x);
        System.out.println("In round 2 you have 3 allowed attemps!");
        if ((x % 2) == 0) {
	System.out.printf("\nHint: * The number is even. *");
	}
	else {
	System.out.printf("\nHint: * The number is odd. *");
	}
        do{
        System.out.print("\nGuess for the generated number: ");
        guessno = sc.nextInt();
        attempt2++;
        if (guessno == x) {
	System.out.printf("**** Hey! you got the number in %d attempts ****",attempt2);
	}
	if (guessno < 1 || guessno > 100) {
	System.out.printf("The number doesn't match the criteria.");
	}
	if (guessno < x && guessno < 100) {
	System.out.printf("The number is smaller than the generated number.");
	}
	if (guessno > x && guessno < 100) {
	System.out.printf("The number is greater than the generated number.");
	}
        if(guessno != x && attempt2 == 3 ){
            System.out.println("\nfailed!");
            System.out.printf("The number was %d :(",x);
            break;
        }
        }while (guessno != x );
        }
        else{
            System.out.println("You failed match 1 so you can not proceed");
        }
    }
    public void match3(){
        if (guessno == x) {
        Random random = new Random();
        x = random.nextInt(100);
//        System.out.println("Random number: " + x);
        System.out.println("In last round you have 2 allowed attemps!");
        if ((x % 2) == 0) {
	System.out.printf("\nHint: * The number is even. *");
	}
	else {
	System.out.printf("\nHint: * The number is odd. *");
	}
        do{
        System.out.print("\nGuess for the generated number: ");
        guessno = sc.nextInt();
        attempt3++;
        
        if (guessno == x) {
	System.out.printf("**** Hey! you got the number in %d attempts ****",attempt3);
	}
	if (guessno < 1 || guessno > 100) {
	System.out.printf("The number doesn't match the criteria.");
	}
	if (guessno < x && guessno < 100) {
	System.out.printf("The number is smaller than the generated number.");
	}
	if (guessno > x && guessno < 100) {
	System.out.printf("The number is greater than the generated number.");
	}
        if(guessno != x && attempt3 == 2 ){
            System.out.println("\nfailed!");
            System.out.printf("The number was %d :(",x);
            break;
        }
        }while (guessno != x );
        System.out.println("\nYou won all 3 matches!!");
    }  
        else{
            System.out.println("You failed match 2 so you can not proceed");
        }
    }
}
