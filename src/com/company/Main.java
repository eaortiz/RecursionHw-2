package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(isEven("tattletale"));

    }

    // string = "a"
    public static boolean isEven(String string)
    {
        if(string.length() == 0)
        {
            return true;
        }

        char first = string.charAt(0); // a
        string = string.substring(1); // ""


        if(string.contains(first + ""))
        {
            string = string.replaceFirst(first + "", ""); //a
            return isEven(string); // isEven(a);
        }
        return false;
    }
}

// this is not your code, check Ray's repo for comments. Try to do these on your own. You wont be teaming up for interviews.
