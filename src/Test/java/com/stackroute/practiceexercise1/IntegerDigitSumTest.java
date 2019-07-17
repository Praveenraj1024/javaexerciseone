package com.stackroute.practiceexercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerDigitSumTest {

    IntegerDigitSum integerDigitSum;

    @Before
    public void setUp(){
        /*
        This method runs before each and every test cases
         */
        //arrange
        this.integerDigitSum = new IntegerDigitSum();
    }

    @After
    public void tearDown() {
        /*
        This method runs after every test cases.
         */
        integerDigitSum = null;
    }


    @Test
    public void givenAnIntegerShouldReturnFalseValue() {
        //act
        boolean actualResult = this.integerDigitSum.sortedSumOfInteger(23423);
        //assert
        assertEquals(false, actualResult);
    }

    @Test
    public void givenAnIntegerShouldReturnTrueValue() {
        //act
        boolean actualResult = this.integerDigitSum.sortedSumOfInteger(234283);
        //assert
        assertEquals(true, actualResult);
    }

//
//    @Test
//    public void givenAnIntegerShouldReturnFalseValue() {
//        //act
//        boolean actualResult = this.integerDigitSum.sortedSumOfInteger(23423);
//        //assert
//        assertEquals(false, actualResult);
//    }
}