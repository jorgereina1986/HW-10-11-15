package com.company;

public class Main
{

    public static void main(String[] args)
    {

        //        int decimal = 1234;
        //        String string = Integer.toString(decimal);
        //        if(string.equals(new StringBuilder(string).reverse().toString()))
        //        {
        //            System.out.println(true);
        //        }
        //        else
        //        {
        //            System.out.println(false);
        //        }
        System.out.println(palindrome(3443));
    }

    public static void decimalToBinary(int decimal)
    {
        String binary = Integer.toBinaryString(decimal);
        System.out.println(binary);
    }

    public static void hexToDecimal(String hex)
    {
        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);
    }

    public static boolean palindrome(int decimal)
    {
        String string = Integer.toBinaryString(decimal);
        if(string.equals(new StringBuilder(string).reverse().toString()))
        {

            return true;
        }
        else
        {
            return false;
        }
    }
}
