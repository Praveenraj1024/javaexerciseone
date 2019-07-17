package com.stackroute.practiceexercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerAndNonIntegerValueTest {
    IntegerAndNonIntegerValue integerAndNonIntegerValue;

    @Before
    public void setUp() {
        /*
        This method runs before each and every test cases
         */
        //arrange
        this.integerAndNonIntegerValue = new IntegerAndNonIntegerValue();
    }

    @After
    public void tearDown() {
        /*
        This method runs after every test cases.
         */
        integerAndNonIntegerValue = null;
    }

    @Test
    public void givenStringShouldReturnATotal() {
        //act
        String actualResult = this.integerAndNonIntegerValue.sumOfIntegerValue(
                "20 30 23 32");
        //assert
        assertEquals("105", actualResult);
    }

    @Test
    public void givenStringShouldReturnAErrorMessage() {
        //act
        String actualResult = this.integerAndNonIntegerValue.sumOfIntegerValue(
                "20 fe 2e 32");
        //assert
        assertEquals("Non Integer Value", actualResult);
    }


    @Test
    public void givenStringShouldReturnAZero() {
        //act
        String actualResult = this.integerAndNonIntegerValue.sumOfIntegerValue(
                "20 -20");
        //assert
        assertEquals("0", actualResult);
    }
}