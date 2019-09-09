/*
Write a program that prints the numbers 1-10.
Write a program that prints the numbers 1-10 backwards.
Write a program that prints all the odd numbers from 1-20.
Write a program that prints all the even numbers from 1-20.
Have the user input a number and print all numbers from that input value to 1.
Sum all values from 1-10.
Have the user enter a number and print the sum of all numbers from that inputted value to 1.
Write loops to print the following:
i)

**********
**********
**********
**********

ii)

*
**
***
****
*****

iii)

        *
       **
      ***
     ****
    *****

9. Guessing Game

10. Factorial of a Number:

You are going to write an application to determine the factorial of a single number.

A factorial of an integer is the product of that integer and all the integers below it.
For example, the factorial of 4 is (4 x 3 x 2 x 1 = 24).

The user will be required to enter an integer.

You will then calculate the factorial of that integer and print the result to the screen.

11. Need more practice? Try FizzBuzz!
 */

import java.util.Scanner;

public class LoopsLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInt;
        int sum = 0;

        //Print numbers 1-10
        System.out.println("Printing 1-10...");
        for(int i = 1; i <=10; i++)
            System.out.print(i + " ");

        System.out.println("\nPrinting 1-10 backwards...");

        //Print number 10-1
        for(int i = 10; i > 0; i--)
            System.out.print(i + " ");

        System.out.println("\nPrinting odd numbers between 1-20...");

        //Print Odd Numbers 1-20
        for(int i = 1; i <= 20; i++)
            if((i % 2) != 0)
                System.out.print(i + " ");

        System.out.println("\nPrinting even numbers between 1-20...");

        //Print Odd Numbers 1-20
        for(int i = 1; i <= 20; i++)
            if((i % 2) == 0)
                System.out.print(i + " ");

        System.out.print("\nEnter a integer: ");
        userInt = sc.nextInt();
        System.out.println("Printing from " + userInt + " to 1...");
        for(int i = userInt; i > 0; i--)
            System.out.print(i + " ");

        System.out.println("\nSum from 1-10...");

        for(int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("Sum = " + sum);

        System.out.print("Enter a integer: ");
        userInt = sc.nextInt();
        System.out.println("Printing sum from 1 to " + userInt);
        sum = 0;
        for(int i = 1; i <= userInt; i++)
            sum += i;
        System.out.println("Sum from 1 to " + userInt + " is: " + sum);

        System.out.println("Picture i");
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("Picture ii");
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5; j++)
                if(j <= i)
                    System.out.print("*");
            System.out.println();
        }

        System.out.println("Picture iii");
        for(int i = 1; i <= 5; i++){
            for(int j = 10; j >= 1; j--)
                if(j <= i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            System.out.println();
        }
    }
}
