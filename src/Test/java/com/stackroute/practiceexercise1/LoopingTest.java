package com.stackroute.practiceexercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopingTest {
    Looping looping;

    @Before
    public void setUp() {
        /*
        This method runs before each and every test cases
         */
        this.looping = new Looping();
    }

    @After
    public void tearDown() {
        /*
        This method runs after every test cases.
         */
        looping = null;
    }

    @Test
    public void givenNumberShouldReturnAnArray() {
        //act
        int[] actualResult = this.looping.printer(6);
        //assert
        int[] expectedResult = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5,
                                6, 6, 6, 6, 6, 6};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberShouldReturnAnArrayOfLengthOne() {
        //act
        int[] actualResult = this.looping.printer(1);
        //assert
        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test (expected = OutOfMemoryError.class)
    public void givenNumberShouldReturnAnOutOfMemoryError() {
        //act
        int[] actualResult = this.looping.printer(100000000);
    }

    @Test
    public void givenNumberShouldReturnAnEmptyArray() {
        //act
        int[] actualResult = this.looping.printer(0);
        //assert
        int[] expectedResult = {};
        assertArrayEquals(expectedResult, actualResult);
    }


}