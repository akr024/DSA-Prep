// Question: Input currency in rupees and output in USD.

import java.util.Scanner;

public class Q6{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input currency in Rs: ");
        
        double rupee = sc.nextDouble();
        double USD = rupee * 0.012;

        System.out.println("USD: " + USD);

        sc.close();
    }
}