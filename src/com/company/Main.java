package com.company;

import java.util.Scanner;

// Fix the Bugs in this code to get the name, age, and birth-year of the user.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input your name: ");
        String name = input.nextLine();
        System.out.println("Enter your age: ");
        String Age = input.nextLine();
        System.out.println("Enter your DOB year: ");
        String dob = input.nextLine();
        System.out.println("Summary: " + "Your name is: " + name + "\n" + "Your age is: " + Age + "\n" + "Your birth year is: " + dob);

    }}