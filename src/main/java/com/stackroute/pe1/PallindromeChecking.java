package com.stackroute.pe1;

public class PallindromeChecking
{
    public String CheckPallindrome(int num)
    {
        int dummy=num;
        int rev=0;
        while(num!=0)
        {
            rev=rev*10+num%10;
            num/=10;
        }

        if(rev==dummy)
        {
            return dummy+" is a pallindrome";
        }
        return dummy+" is not a pallindrome";
    }

    public String SumOfEvenDigits(int num)
    {
        int sum=0;
        while(num!=0)
        {
            int rem=num%10;
            if(rem%2==0)
            {
                sum+=rem;
            }
            num/=10;
        }
        if(sum>25)
        {
            return "the sum of even digits is greater than 25";
        }
        return "the sum of even digits is lesser than 25";
    }

}
