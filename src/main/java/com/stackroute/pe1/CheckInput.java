package com.stackroute.pe1;

public class CheckInput
{
    public String checkinp(char c)
    {
        if(c>='A' && c<='Z')
        {
            return"Capital Letter";
        }
        else if(c>='a' && c<='z')
        {
            return"Small Letter";
        }
        else if(c>='0' && c<='9')
        {
            return"Digit";
        }
        else
        {
            return"Special Character";
        }
    }

}
