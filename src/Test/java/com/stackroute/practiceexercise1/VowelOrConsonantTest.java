package com.stackroute.practiceexercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantTest {
    VowelOrConsonant vowelOrConsonant;

    @Before
    public void setUp() {
        /*
        This method runs before each and every test cases
         */
        this.vowelOrConsonant = new VowelOrConsonant();
    }

    @After
    public void tearDown() {
        /*
        This method runs after every test cases.
         */
        vowelOrConsonant = null;
    }

    @Test
    public void givenStringShouldReturnNotALetter() {
        //act
        String actualResult[] = this.vowelOrConsonant.vowelOrConsonantChecker("3");
        //assert
        assertEquals("Not a letter", actualResult[0]);
    }

    @Test(expected = NullPointerException.class)
    public void givenStringShouldReturnNullPointerException() {
        //act
        this.vowelOrConsonant.vowelOrConsonantChecker(null);
        //assert
    }


    @Test
    public void givenStringShouldReturnAnArrayWithAllPossibleResult() {
        //act
        String[] actualResult = this.vowelOrConsonant.vowelOrConsonantChecker("ag2");
        //assert
        String[] expected = {"Vowel", "Consonant", "Not a letter"};
        assertArrayEquals(expected, actualResult);
//        assertEquals(expected, actualResult);
    }
}