package com.stackroute.pe1;

public class ReverseWord
{
    public String reverse(String word)
    {
        if(word==null)
        {
            return "Null values not allowed";
        }
        String rev="";
        for(int i=word.length()-1;i>=0;i--)
        {
            rev+=word.charAt(i);
        }
        return rev;
    }

}
