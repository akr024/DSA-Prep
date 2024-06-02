// Question: To find out whether the given String is Palindrome or not.

// Palindrome - The string is the same as if it is reversed

// my solution:
// reverse the string and then .equals()

import java.util.Scanner;

public class Q8{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input a string: ");

        String str = sc.nextLine();


        // reverse the string:
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        System.out.println("Reversed: " + reversed);

        if (str.equals(reversed)){
            System.out.println("This string is a palindrome");
        } else {
            System.out.println("This string is not a palindrome");
        }
        
        sc.close();

    }
}