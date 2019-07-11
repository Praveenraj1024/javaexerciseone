package com.stackroute.practiceexercise1;

import org.junit.*;

import static org.junit.Assert.*;

public class JunitDemoTest {
    JunitDemo junitDemo;

    @Before
    public void setUp() {
        System.out.println("Inside Before");
        this.junitDemo = new JunitDemo();
    }


    @After
    public void tearDown(){
        System.out.println("Inside After");
        junitDemo = null;
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }




    @Test
    public void givenTwoStringShouldReturnConcatedUpperString() {
        //arrange
//        JunitDemo junitDemo = new JunitDemo();
        //act
        String result = this.junitDemo.concatAndUppercase("Hello ", "world");
        //assert
        assertNotNull(result);
        assertEquals("HELLO WORLD", result);
    }
    @Test
    public void givenAStringAndANullShouldReturnErrorMessage() {
        //arrange
//        JunitDemo junitDemo = new JunitDemo();
        //act
        String result = this.junitDemo.concatAndUppercase("Hello ", null);
        //assert
        assertNotNull(result);
        assertEquals("Null Value Not Allowed", result);
    }


    @Test
    public void givenStringShouldReturnTheReverse(){
        //act
        String actualResult = junitDemo.reverseString("Hello");
        //assert
        assertEquals("olleH", actualResult);
    }


    @Test
    public void givenNullShouldThrowNullPointerException(){
        //act
        String actualResult = junitDemo.reverseString(null);
        //assert
        assertEquals("java.lang.NullPointerException", actualResult);

    }
}



//@ignore
//@timeout
