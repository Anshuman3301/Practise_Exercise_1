package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class DecreasingSortTest
{
    DecreasingSort ob;

    @Before
    public void setup()
    {
        System.out.println("Before");
        ob=new DecreasingSort();
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
    public void givenAStringOfNUmbersShouldReturnDescendingOrderAndSum()
    {
        String result1=ob.DescOrder("112244455");
        String result2=ob.SumOfDigits("112244455");


        assertEquals("554442211 True",result1+" "+result2);
    }

    @Test
    public void givenANullStringShouldReturnError()
    {
        String result1=ob.DescOrder(null);
        String result2=ob.SumOfDigits(null);

        assertEquals("Null values not allowed Null values not allowed",result1+" "+result2 );
    }

    @Test
    public void givenAnEmptyStringShouldReturnAnError()
    {
        String result1=ob.DescOrder("");
        String result2=ob.SumOfDigits("");

        assertEquals("Empty values not allowed Empty values not allowed", result1+" "+result2);
    }

}