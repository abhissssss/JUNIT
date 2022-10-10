package com.abhisheksingh.junitchallenges;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Arrays;

import static org.junit.Assert.*;

public class UtilitiesTest {
private Utilities utilities;


@org.junit.Before
public void setup() {
    utilities = new Utilities();
    System.out.println("Running a test........");
}
    @Test
    public void everyNthChar() {
        fail("This test has not been implemented");
    }

    @Test
    public void removePairs() {
      assertEquals("ABCDEF" , utilities.removePairs("AABCDDEFF"));
    }


    @Test
    public void converter() {
        fail("This test has not been implemented");
    }

    @Test
    public void nullIfOddLength() {
        fail("This test has not been implemented");
    }
}