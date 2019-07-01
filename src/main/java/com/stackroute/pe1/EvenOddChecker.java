package com.stackroute.pe1;

import java.util.Scanner;

public class EvenOddChecker
{
    public String evenOddChecking(int num)
    {
        if(num>20 && num<30)
        {
            if(num%2==0)
            {
                return "Jerry";
            }
            else
            {
                return "Tom";
            }
        }

        return "Error";
    }
}
