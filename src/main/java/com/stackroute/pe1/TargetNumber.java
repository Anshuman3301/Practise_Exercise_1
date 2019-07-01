package com.stackroute.pe1;

import java.util.Scanner;

public class TargetNumber
{
    public void GuessNumber(int guess)
    {
        Scanner keyboard=new Scanner(System.in);
        int a=0;
        System.out.print("Enter Your Guess");
        while(guess!=a)
        {
            a=keyboard.nextInt();
            if(a>guess)
            {
                System.out.println("Higher");
            }
            else if(a<guess)
            {
                System.out.println("Lesser");
            }
        }
        System.out.println("Congratulation!! Your guess matched");
    }
    public static void main(String[] args)
    {
        int a=1+(int)(Math.random()*99);
        TargetNumber ob=new TargetNumber();
        ob.GuessNumber(a);
    }
}
