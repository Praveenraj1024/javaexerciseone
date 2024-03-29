package com.stackroute.practiceexercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTypeTest {

    CharacterType characterType;

    @Before
    public void setUp(){
        /*
        This method runs before each and every test cases
         */
        //arrange
        this.characterType = new CharacterType();
    }
    @After
    public void tearDown() {
        /*
        This method runs after every test cases.
         */
        characterType = null;
    }

    @Test
    public void givenCharacterShouldReturnLowerCase() {
        //act
        String actualResult = this.characterType.letterChecker('z');
        //assert
        assertEquals("Lowercase letter", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnUpperCase() {
        //act
        String actualResult = this.characterType.letterChecker('G');
        //assert
        assertEquals("Capital letter", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnDigit() {
        //act
        String actualResult = this.characterType.letterChecker('3');
        //assert
        assertEquals("Digit", actualResult);
    }

    @Test
    public void givenCharacterShouldReturnSpecialSymbol() {
        //act
        String actualResult = this.characterType.letterChecker('*');
        //assert
        assertEquals("Special symbol", actualResult);
    }
}