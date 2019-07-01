package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class PallindromeCheckingTest
{
    PallindromeChecking ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new PallindromeChecking();
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
    public void givenAPallindromeShouldReturnTypeAndSumOfEvenDigits()
    {
        String result1=ob.CheckPallindrome(988889);
        String result2=ob.SumOfEvenDigits(988889);

        assertEquals("988889 is a pallindrome and the sum of even digits is greater than 25",result1+" and "+result2);
    }

    @Test
    public void givenAPallindromeShouldReturnTypAndSumLessThan25()
    {
        String result1=ob.CheckPallindrome(98889);
        String result2=ob.SumOfEvenDigits(98889);

        assertEquals("98889 is a pallindrome and the sum of even digits is lesser than 25", result1+" and "+result2);
    }

    @Test
    public void givenANonPallindromeShouldReturnAMessage()
    {
        String result1=ob.CheckPallindrome(1234);
        assertEquals("1234 is not a pallindrome", result1);
    }

}