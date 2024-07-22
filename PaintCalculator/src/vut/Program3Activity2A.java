/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 *
 * @author siyabulela
 */
public class Program3Activity2A
{

    public static void main(String[] args)
    {
        // 1Litre = 2m^2
        // can only buy 5Litre tins
        // n of Litre tins to be bought = ?

        double length, height, area, paintLitres;
        double tins;

        Scanner lengthNumber = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = lengthNumber.nextDouble();
        Scanner heightNumber = new Scanner(System.in);
        System.out.println("Enter height: ");
        height = heightNumber.nextDouble();
        area = calcArea(length, height);
        paintLitres = calcLitresPaint(length, height);
        tins = calcTins(length, height);

        System.out.println("\nThe area is " + area);
        System.out.println("Litres of paint needed is " + paintLitres);
        System.out.println("Number of tins needed is " + tins);

    }

    public static double calcArea(double length, double height)
    {
        double area;

        area = (1 / 2) * (length) * (height);

        return area;

    }

    public static double calcLitresPaint(double length, double height)
    {
        double litresPaint;
        double area;

        area = calcArea(length, height);
        litresPaint = area / 2;

        return litresPaint;
    }

    public static double calcTins(double length, double height)
    {
        double tins;
        double litres;

        litres = calcLitresPaint(length, height);
        tins = (litres / 5);

        return tins;
    }
}
