/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.util.Scanner;

/**
 * Write a program that accepts a string var as parameter and calculate the
 * number of words in a string sentence
 *
 * And also create a function that accepts a string var as parameter and
 * calculate the number of all characters in a string sentence, excluding empty
 * spaces.
 *
 * @author S Biyo 218081642
 */
public class question3
{

    public static void main(String[] args)
    {
        String character;
        String numWordsMessage = "Number of words in the string: ";
        String numCharsMessage = "Number of chars in the string: ";

        Scanner typeWords = new Scanner(System.in);
        System.out.print("Type your words here: ");
        character = typeWords.next();

        //display a message for number of words
        System.out.println(numWordsMessage + countString_Words(character));
        //display a message for number of characters
        System.out.println(numCharsMessage + countAllChars(character));

    }

    public static int countString_Words(String character)
    {
        //declare a variable and initialize it to zero
        int wordCount = 0;

        for (int i = 0; i < character.length(); i++)
        {
            if (character.charAt(i) == ' ')
            {
                wordCount += 1;
            }
        }
        return wordCount;
    }

    public static int countAllChars(String character)
    {
        //declare a variable
        int charCount = 0;

        for (int i=0; i < character.length(); i++)
        {
            if (character.charAt(i) != ' ')
            {
                charCount += 1;
            }
            else{
        //replace spaces and get the length
        charCount = character.replace(" ", "").length();}
        }

        return charCount;
    }
}
