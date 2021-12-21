package com.company;


import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// write your code here
		Human maxHuman = new Human();
		ChildHuman childHuman = new ChildHuman();
		childHuman.getAge();
//
//		System.out.println(maxHuman.getName());
//		maxHuman.printHello();
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Please enter your name:");
//		String enteredName = scanner.nextLine();
//		maxHuman.setName(enteredName);
//
//		System.out.println("Please enter your age:");
//		short enteredAge = scanner.nextShort();
//		maxHuman.setAge(enteredAge);
		
//		for (int i = 0; i < 10; i++) {
//			maxHuman.printHello();
//		}
//		int i = 110;
//		while( i < 10){
//            maxHuman.printHello();
//            i++;
//        }
//
//		do{
//            maxHuman.printHello();
//        }while ( i < 10);
//
		
		childHuman.setName("ChildName");
		System.out.println(childHuman.getName());
		childHuman.playGame();
		
	}
}
