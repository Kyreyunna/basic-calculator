package com.pluralsight;

import com.sun.source.tree.PackageTree;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        //Exercise 4
        //For this exercise, only code the questions and code prompts. Only multiply in your
        //output, and ignore whatever option the user selects

        //Enter the first number:
        System.out.print( "Enter number 1:");
        int num1= scanner.nextInt();
        //Enter the second number:
        System.out.print( "Enter number 2:");
        int num2= scanner.nextInt();
        scanner.nextLine();

        System.out.println("What do you want to do? ");

        System.out.println(" Enter " +
                "        Add" +
                "        Subtract" +
                "        Multiply" +
                "        Divide" +
                "        Please select an option: ");

//      action=what you chose
        //int num 1 (action "-") int num2 = num3
        String action= scanner.nextLine();

        int solution = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + solution);


//        int solution = ;
//
//        if (action == "Subtract"){
//            int solution = num1 - num2;
//            System.out.println(num1 + "-" + num2 + "=" + solution);
//
//
//        if (action == "Add")
//            int solution = num1 + num2;
//            System.out.println(num1 + "+" + num2 + "=" + solution);
//
//
//        if (action == "Multiply")
//            int solution = num1 * num2;
//            System.out.println(num1 + "*" + num2 + "=" + solution);
//
//
//        if (action == "Division")
//            float solution = num1 / num2;
//            System.out.println(num1 + "/" + num2 + "=" + solution);
//        }


        //Possible calculations:
        //(A)dd
        //(S)ubtract
        //(M)ultiply
        //(D)ivide
        //Please select an option: M
        //5 * 12 = 60






    }
}
