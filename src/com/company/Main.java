package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //STAGE1
       final String bot_name = "Alice";
        final Scanner scanner = new Scanner(System.in);
        final int birth_day = 12;
        final int birth_month = 10;
        final int birth_year = 2021;
        if(bot_name.equalsIgnoreCase(scanner.nextLine())) {
            System.out.println("Hi, my name is " + bot_name);
        }
        System.out.println( "I was created " + birth_day + "." + birth_month + "." + birth_year );
    }
}
