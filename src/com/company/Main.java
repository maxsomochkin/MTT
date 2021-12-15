package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human maxHuman = new Human();
        
        System.out.println(maxHuman.name);
        maxHuman.printHello();
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Please enter your name:");
        String enteredName =  scanner.nextLine();
        maxHuman.name = enteredName;
        maxHuman.printHello();
        
    }
}
