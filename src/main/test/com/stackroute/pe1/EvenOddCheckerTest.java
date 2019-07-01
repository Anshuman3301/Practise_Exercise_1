package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class EvenOddCheckerTest
{
    EvenOddChecker ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new EvenOddChecker();
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
    public void givenANumberShouldReturnOdd()
    {
        String result=ob.evenOddChecking(23);
        assertEquals("Tom", result);
    }

    @Test
    public void givenANumberShouldReturnEven()
    {
        String result=ob.evenOddChecking(24);
        assertEquals("Jerry", result);
    }

    @Test
    public void givenANumberOutOfRangeShouldReturnError()
    {
        String result=ob.evenOddChecking(35);
        assertEquals("Error", result);
    }

}