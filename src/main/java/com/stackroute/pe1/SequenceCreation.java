package com.stackroute.pe1;

public class SequenceCreation
{
    public String sequence(int num)
    {
        if(num==0)
        {
            return "Zero values not allowed";
        }

        if(num<0)
        {
            return "Negative values not allowed";
        }
        String result="";
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                result+=(Integer.toString(i) + " ");
            }
        }

        return result.substring(0,result.length()-1);
    }


}
