package com.github.curriculeon;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 10/01/2019.
 */
public class StringParser {

    public static Character[] parseCharacters(String input) {
        // string characters into a list
        char[] stringCharacters = input.toCharArray();
        //get length of characters
        int numberOfCharacters = stringCharacters.length;
        Character[] result = new Character[numberOfCharacters];
        //loop number starts at 0
        int numberOfTimesLooped = 0;
        while (numberOfTimesLooped < numberOfCharacters) {
            result[numberOfTimesLooped] = stringCharacters[numberOfTimesLooped];
            numberOfTimesLooped = numberOfTimesLooped + 1;
        }
        return result;
    }

    public static Integer[] parseIntegers(String input) {
        if (input == null) {
            return null;
        }

        input = input.replace(" ","");
        char[] splitInput = input.toCharArray();


        Integer[] result = new Integer[splitInput.length];

        for (int i = 0; i < splitInput.length; i++) {
            Character currentCharacter = splitInput[i];
            result[i] = Integer.parseInt(currentCharacter.toString());

        }


        return result ;
    }

    public static List<String> toList(String[] input) {
        List<String> arry1 = new ArrayList<>(Arrays.asList(input));

        return arry1;
    }

    public static String[] parseStrings(String input) {
        if (input == null) {
            return null;
        }
        String[] stringCharacters = input.split("");
        int numberOfCharacters = stringCharacters.length;
        String[] result = new String[numberOfCharacters];
        int numberOfTimesLooped = 0;
        while (numberOfTimesLooped < numberOfCharacters) {
            result[numberOfTimesLooped] = stringCharacters[numberOfTimesLooped];
            numberOfTimesLooped = numberOfTimesLooped + 1;


        }

        return result;
    }
}