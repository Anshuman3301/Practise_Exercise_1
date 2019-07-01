package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseWordTest
{
    ReverseWord ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new ReverseWord();
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
    public void givenAStringShouldReturnItsReverse()
    {
        String result=ob.reverse("London");

        assertEquals("nodnoL", result);
    }

    @Test
    public void givenANullStringShouldReturnError()
    {
        String result=ob.reverse(null);

        assertEquals("Null values not allowed", result);
    }

    @Test
    public void givenAnEmptyStringShouldReturnAnEmptyString()
    {
        String result=ob.reverse("");

        assertEquals("", result);
    }
}