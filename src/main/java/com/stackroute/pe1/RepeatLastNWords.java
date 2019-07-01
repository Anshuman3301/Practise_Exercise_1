package com.stackroute.pe1;

public class RepeatLastNWords
{
    public String repeatChars(String word, int times)
    {
        if(times<0)
        {
            return "Negative numbers not allowed";
        }

        if(word==null)
        {
            return "Null string not allowed";
        }

        String result=word.substring(word.length()-times);
        for(int i=1;i<=times;i++)
        {
            word+=result;
        }

        return word;
    }

}
