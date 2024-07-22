/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author siyab
 */
public class Unit3Assignment
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        final int BASIC_SALARY = 750, MAX_EMPLOYEES = 2, WEEKLY_SALES = 2;
        final double COMMISION = 0.1;

        int[][] arrMonthlySales = new int[MAX_EMPLOYEES][WEEKLY_SALES];
        double dblMonthlySales;
        int sales, sum;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter weekly sales per employee");
        for (int cntEmployee = 0; cntEmployee < MAX_EMPLOYEES; cntEmployee++)
        {

            System.out.println("Employee " + (cntEmployee + 1) + ": ");
            for (int cntWeeklySales = 0; cntWeeklySales < WEEKLY_SALES; cntWeeklySales++)
            {

                System.out.println("Type Week " + (cntWeeklySales + 1) + " sales: ");
                sales = in.nextInt();

                arrMonthlySales[cntEmployee][cntWeeklySales] = sales;
            }

        }

        System.out.println(Arrays.deepToString(arrMonthlySales));
        //System.out.println(arMonthlySales.length);
    }

}
