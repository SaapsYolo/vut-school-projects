/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 * a program to create function perfect_number() and check whether a number is
 * perfect or not,
 *
 * @author S Biyo 218081642
 */
public class question2
{

    public static void main(String[] args)
    {
        //declaring variables
        int number, isPerfectNumber;
        Scanner enterNumber = new Scanner(System.in);
        
        //tell a user to enter a perfect number
        System.out.print("Enter Perfect No: ");
        number = enterNumber.nextInt();

        //store a number to test later it if it is a perfect number
        isPerfectNumber = perfect_number(number);

        //test if a number is a perfect number and display a message
        if (isPerfectNumber == number)
        {
            System.out.println(number + " is a perfect number");
        }
        else
        {
            System.out.println(number + " is not a perfect number");
        }

    }

    static int perfect_number(int number)
    {
        //declare a variable
        int sum = 0;

        //a formula to calculate a perfect number
        for (int i = 1; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                sum = sum + i;
            }
        }

        return sum;

    }
}
