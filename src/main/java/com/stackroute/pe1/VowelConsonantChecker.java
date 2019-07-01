package com.stackroute.pe1;

public class VowelConsonantChecker
{
    public String vowelConsonant(String word)
    {
        String dummy=word.toUpperCase();
        String result="";
        int length=word.length();
        for(int i=0;i<length;i++)
        {
            char c =dummy.charAt(i);
            if(Character.isLetter(c))
            {
                if(c=='A'|| c=='E'|| c=='I' || c=='O' || c=='U')
                {
                    result+="Vowel ";
                }
                else
                {
                    result+="Consonant ";
                }
            }
            else
            {
                System.out.print("Error ");
                break;
            }
        }

        return result;
    }

}
