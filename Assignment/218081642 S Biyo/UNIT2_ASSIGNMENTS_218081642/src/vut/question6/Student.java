/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.question6;

import java.util.Scanner;

/**
 *
 * @author siyab
 */
public class Student
{

    public static void main(String[] args)
    {
        String name, subjectCode=" ";
        double test1, test2, test3, examMark = 0;

        Scanner strName = new Scanner(System.in);
        name = strName.next();

        Scanner dblTest1 = new Scanner(System.in);
        test1 = dblTest1.nextDouble();
        Scanner dblTest2 = new Scanner(System.in);
        test2 = dblTest2.nextDouble();
        Scanner dblTest3 = new Scanner(System.in);
        test3 = dblTest3.nextDouble();

        double semesterMark = calcSemesterMark(test1, test2, test3);
        double finalFinalMark = calcFinalMark(examMark, semesterMark);
        
        String studDetails = name + " " + subjectCode + " " + test1 + " " + test2 + " " + test3;

        System.out.println(studDetails);

    }

    static double calcSemesterMark(double test1, double test2, double test3)
    {
        double totalMarks;

        totalMarks = (test1 + test2 + test3) / 3;

        return totalMarks;
    }

    static double calcFinalMark(double examMark, double semesterMark)
    {
        double finalMark;

        finalMark = (examMark + semesterMark) / 2;

        return finalMark;
    }
}
