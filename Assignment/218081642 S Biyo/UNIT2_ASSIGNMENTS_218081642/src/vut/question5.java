/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 * program that finds the smallest number
 *
 * @author S Biyo 218081642
 */
public class question5
{

    public static void main(String[] args)
    {
        int number;

        Scanner intNumber = new Scanner(System.in);
        System.out.print("Enter a number or type -1 to stop: ");
        number = intNumber.nextInt();
        int tempValue;

        while (number != -1)
        {
            if (number > -1)
            {
                tempValue = number;
            }

            System.out.println("Smallest Number is: " + number);

            number = intNumber.nextInt();

        }

    }
}
