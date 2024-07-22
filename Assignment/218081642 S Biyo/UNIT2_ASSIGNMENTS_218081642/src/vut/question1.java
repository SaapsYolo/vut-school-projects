/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 * A program that reads a sequence of numbers and counts how many numbers are
 * even and how many are odd. The program terminates when zero is entered.
 *
 * @author S Biyo 218081642
 */
public class question1
{

    public static void main(String[] args)
    {
        int number;
        int oddCount = 0, evenCount = 0;

        Scanner intNumber = new Scanner(System.in);
        System.out.print("Enter a number or type 0 to stop: ");
        number = intNumber.nextInt();

        while (number != 0)
        {
            if (number % 2 == 0)
            {
                evenCount++;
            }
            else
            {
                oddCount++;
            }

            System.out.print("Enter a number or type 0 to stop: ");
            number = intNumber.nextInt();
        }

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
    }

}
