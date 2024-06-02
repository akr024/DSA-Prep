// Question: Take in two numbers and an operator (+, -, *, /) 
// and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Q4 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input number 1: ");
        int num1 = sc.nextInt();
        
        System.out.print("Input number 2: ");
        int num2 = sc.nextInt();
        sc.nextLine(); // To consume the new line character

        System.out.print("Input an operator (+, -, *, /): ");
        String operator = sc.nextLine();

        if(operator.equals("+")){
            int result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("-")){
            int result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("*")){
            int result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (operator.equals("/")){
            float result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Not a valid operator provided");
        }

        sc.close();
    }
}