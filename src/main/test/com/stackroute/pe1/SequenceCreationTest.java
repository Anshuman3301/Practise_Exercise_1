package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class SequenceCreationTest
{
    SequenceCreation ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new SequenceCreation();
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
    public void givenAnumberShouldDisplayItsCorrespondingSequence()
    {
        String result1=ob.sequence(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5", result1);
    }

    @Test
    public void givenAZeroShouldReturnError()
    {
        String result=ob.sequence(0);
        assertEquals("Zero values not allowed", result);
    }

    @Test
    public void givenANegativeNumberShouldReturnError()
    {
        String result=ob.sequence(-1);
        assertEquals("Negative values not allowed", result);
    }

}