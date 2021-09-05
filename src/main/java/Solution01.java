/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 1
 *  Copyright 2021 Matthew  Trump
 *
 *  This program will print a line asking for the users name
 *  Then it will take input from the user
 *  Finally, it will print a nice message with the users' name
 */
import java.util.Scanner;

public class Solution01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");

        String n = input.next();

        System.out.println("Hello, " + n + ", nice to meet you!");
    }
}
