package com.kartik;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float productCost, serviceCost, totalCost;
        char memberIdentifier;

        productCost = 100;
        serviceCost = 200;
        memberIdentifier = 'p';

        // Uncomment these lines to take input from user

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product cost: ");
        productCost = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter service cost: ");
        serviceCost = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter membership identifier(p -> premium, g -> gold, s -> silver, n -> not a member): ");
        memberIdentifier = scanner.nextLine().charAt(0);
        while (memberIdentifier != 'p' && memberIdentifier != 'g' && memberIdentifier != 's' && memberIdentifier != 'n') {

            System.out.print("Enter a valid identifier: ");
            memberIdentifier = scanner.nextLine().charAt(0);

        } */



        Bill memberBill = new Bill(productCost, serviceCost, memberIdentifier);
        totalCost = memberBill.getFinalAmount();
        System.out.println("\nThe total payable amount is $" + totalCost);



    }
}
