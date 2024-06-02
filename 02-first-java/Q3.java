// Question: Write a program to input principal, time, and rate (P, T, R) 
// from the user and find Simple Interest.

import java.util.Scanner;
import java.util.Locale;

public class Q3{
    public static void main (String[] args){
        Locale.setDefault(Locale.US); // without this, dot in the float gives an error, as sweden uses comma for float seperator.
        Scanner sc = new Scanner (System.in);
        System.out.print("Input a principal: ");
        int principal = sc.nextInt();
        System.out.print("Input a time period: ");
        int time = sc.nextInt();
        System.out.print("Input a rate: ");
        float rate = sc.nextFloat();

        float simpleInterest = principal + (principal * rate * time);
        System.out.println("Calculated simple interest is: " + simpleInterest);
        sc.close();

    }
}