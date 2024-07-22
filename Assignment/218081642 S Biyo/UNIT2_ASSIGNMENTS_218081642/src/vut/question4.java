/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

/**
 * program that prints only even numbers from range of 1 to 10
 *
 * @author S Biyo 218081642
 */
public class question4
{

    public static void main(String[] args)
    {
        //loop numbers from 1 to 10
        for (int i = 1; i < 10; i++)
        {
            //return only even numbers and display them
            if (i % 2 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
