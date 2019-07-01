package com.stackroute.pe1;

import java.util.Arrays;

public class DecreasingSort
{
    public String DescOrder(String str)
    {
        if(str==null)
        {
            return "Null values not allowed";
        }

        if(str=="")
        {
            return "Empty values not allowed";
        }
        char[] digits=str.toCharArray();
        Arrays.sort(digits);
        String digit=String.valueOf(digits);
        String rev="";
        for(int i=digit.length()-1;i>=0;i--)
        {
            rev+=digit.charAt(i);
        }

        return rev;
    }

    public String SumOfDigits(String str)
    {
        if(str==null)
        {
            return "Null values not allowed";
        }

        if(str=="")
        {
            return "Empty values not allowed";
        }
        int sum=0;
        int number=Integer.valueOf(str);
        while(number!=0)
        {
            int digit=number%10;
            if(digit%2==0)
            {
                sum+=digit;
            }
            number/=10;
        }

        if(sum>=15)
        {
            return "True";
        }
        else
        {
            return "False";
        }
    }

}
