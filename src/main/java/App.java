/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Is the car silent when you turn the key?");
        String ans = input.nextLine().toLowerCase();

        if(ans.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            ans = input.nextLine().toLowerCase();
            System.out.println(ans.equals("y") ? "Clean terminals and try starting again." : "Replace cables and try again.");
        }else{

            System.out.println("Does the car make a slicking noise?");
            ans = input.nextLine().toLowerCase();
            if(ans.equals("y")){
                System.out.println("Replace the battery.");
            }else {
                System.out.println("Does the car crank up but fail to start?");
                ans = input.nextLine().toLowerCase();

                if (ans.equals("y")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.println("Does the engine start and then die?");
                    ans = input.nextLine().toLowerCase();
                    if (ans.equals("y")) {
                        System.out.println("Does your car have fuel injection?");
                        ans = input.nextLine().toLowerCase();
                        System.out.println(ans.equals("y") ? "Get it in for service." : "Check to ensure the choke is opening and closing.");
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }

        }
    }
}