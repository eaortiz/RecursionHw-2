package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println(isEven("aabbccdd"));
        System.out.println(isEven("abcdabcd"));
        System.out.println(isEven("llooll"));

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