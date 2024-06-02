// Question: Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Q5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println(num1);
        } else if (num2 > num1){
            System.out.println(num2);
        } else {
            System.out.println("Both numbers are the same");
        }

        sc.close();
    }
}