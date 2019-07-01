package com.stackroute.pe1;

import java.util.Scanner;

public class AdditionNumbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true)
        {
            if(sc.hasNextInt())
            {
                sum+=sc.nextInt();
            }
            else
            {
                System.out.println("Error");
                break;
            }
        }
        System.out.print(sum);

    }
}
