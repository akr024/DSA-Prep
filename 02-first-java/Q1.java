// Question: Write a program to print whether a number is even or odd, 
// also take input from the user.

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println(num + " is even");
        } else{
            System.out.println(num + " is odd");
        }
        sc.close();
    }
}