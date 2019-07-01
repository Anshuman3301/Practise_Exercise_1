package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class RepeatLastNWordsTest
{
    RepeatLastNWords ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new RepeatLastNWords();
    }

    @After
    public void teardown()
    {
        System.out.println("After");
        ob=null;
    }

    @BeforeClass
    public static void setupAfterClass()
    {
        System.out.println("Before class");
    }

    @AfterClass
    public static void teardownAfterClass()
    {
        System.out.println("After Class");
    }

    @Test
    public void givenAStringAndNumberShouldReturnAStringRepeatedLastNDigits()
    {
        String result=ob.repeatChars("Stackroute", 1);
        assertEquals("Stackroutee", result);
    }

    @Test
    public void givenAStringAndNegativeNumberShouldReturnAnError()
    {
        String result=ob.repeatChars("Stackroute", -1);
        assertEquals("Negative numbers not allowed", result);
    }

    @Test
    public void givenANullStringAndNumberShouldReturnAnError()
    {
        String result=ob.repeatChars(null, 1);
        assertEquals("Null string not allowed", result);
    }


}