package com.abhisheksingh.junitchallenges;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Utilities {


    public char[] everyNthChar (char [] sourceArray , int n){
        if (sourceArray == null || sourceArray.length<n) {
            return sourceArray;
        }
        int returnedLength = sourceArray.length/n;
        char[] result = new char[returnedLength];
        int index = 0;

        for (int i = n-1; i < sourceArray.length ; i+=n) {
            result[index++] = sourceArray[i];
        }
        return sourceArray;
    }

    // Removes pairs of the same character that are next
    // to each other , by removing on e occurrence of the character
    // "ABBCDEEF" -> "ABCDEF"
    // "ABCBDEEF" -> "ABCBDEF" (the two B's aren't next to each other , so they aren't removed

    public String removePairs (String source){
        // If length is less than 2 , there won't be any pairs
        if (source.length() < 2){
            return source;
        }
        StringBuilder sb = new StringBuilder();
        CharacterIterator iterator = new StringCharacterIterator(source);
        while (iterator.current()!=CharacterIterator.DONE){
            char currentChar = iterator.current(); // getting current char
            char nextChar = iterator.next(); // getting next char and updating current's position
            if (currentChar!=nextChar){
                sb.append(currentChar);
            }
        }
        return sb.toString();
    }

    //perform a conversion based on some internal business rule
    public int converter (int a , int b)  {
        return (a/b) + (a * 30) -2;
    }

    public String nullIfOddLength (String source) {
        if (source.length()% 2==0) {
            return source;
        }
        return null;
    }
}
