package com.ps;

import java.util.*;

public class FullNameApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        System.out.print("First name: ");
        String firstName = scanner.nextLine().trim();

        System.out.println("Middle name: ");
        String middleName = scanner.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine().trim();

        System.out.println("Your full name is " + firstName + " " + middleName + " " + lastName + " " + suffix);

        scanner.close();
        }
    }
