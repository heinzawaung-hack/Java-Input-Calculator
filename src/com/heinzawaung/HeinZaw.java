package com.heinzawaung;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HeinZaw {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select a program, 1 = Plus , 2 = Minus , 3 = Multiply , 4 = Divided");
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println("Please add first number");
            int firstNumber = scanner.nextInt();

            System.out.println("Please enter second number");
            int secondNumber = scanner.nextInt();

            int plusFunction = firstNumber + secondNumber;

            System.out.println("The Number That You entered " + firstNumber + " + "  + secondNumber + " = " + plusFunction);

        }else if (number == 2){
            System.out.println("Please enter first Number");
            int thirdNumber = scanner.nextInt();

            System.out.println("Please enter second number");
            int fourthNumber = scanner.nextInt();

            int minus = thirdNumber - fourthNumber;

            System.out.println("The answer that you entered " +
                    thirdNumber + " - " + fourthNumber + " = " + minus );
        }else if (number == 3){
            System.out.println("Please enter first number ");
            int fifthNumber = scanner.nextInt();

            System.out.println("Please enter Second number");
            int sixthNumber = scanner.nextInt();

            int multiply = fifthNumber * sixthNumber;

            System.out.println("The answer that you entered " + fifthNumber + " * " +
                    sixthNumber + " = " + multiply);
        }else if (number == 4){
            System.out.println("Please enter First Number");
            int seventhNumber = scanner.nextInt();

            System.out.println("Please enter Second Number");
            int eighthNumber = scanner.nextInt();

            int divided = seventhNumber / eighthNumber;

            System.out.println("The Number that you entered " + seventhNumber + " / " +
                    eighthNumber + " = " + divided);
        }else if (number == 5){
            System.out.println("Please enter a number");
            int square = scanner.nextInt();

            System.out.println("The Number That you entered " + square + " of square root is " +
                    (Math.sqrt(square) ));
        }else {
            System.out.println("We have only 6 functions " +
                    "for you MOTHERFUCKER!");
        }
         scanner.close();
    }
}
