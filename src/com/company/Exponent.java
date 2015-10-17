package com.company;
import java.util.Scanner;

/**
 * Created by Jorge Reina on 10/11/15.
 */
public class Exponent
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        String ask = "What numbers would you like to add?";

        System.out.println(ask);
        try
        {
            int firstInt = scanner.nextInt();
            int secondInt = scanner.nextInt();
            System.out.println("Your answer is " + Calculate(firstInt, secondInt));
        }
        catch(Exception e)
        {
            System.out.println("Wrong input buddy!");

        }
    }

    public static int Calculate(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
}
