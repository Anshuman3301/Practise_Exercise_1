package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class CheckInputTest
{
    CheckInput ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new CheckInput();
    }

    @After
    public void teardown()
    {
        System.out.println("After");
        ob=null;
    }

    @BeforeClass
    public static void setupBeforeClass()
    {
        System.out.println("Before Class");
    }

    @AfterClass
    public static void teardownAfterClass()
    {
        System.out.println("After Class");
    }

    @Test
    public void givenACharacterShouldReturnItsType()
    {
        String result=ob.checkinp('9');
        assertEquals("Digit", result);
    }

    @Test
    public void givenASpecialCharatcerShouldReturnItsType()
    {
        String result=ob.checkinp('@');
        assertEquals("Special Character", result);
    }

    @Test
    public void given(){

    }

}