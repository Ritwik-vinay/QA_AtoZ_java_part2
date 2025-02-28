package Java002;

import java.util.Scanner;

public class class17_userInput {
    public static void main(String[] args) {
        //You can take input from users using the Scanner class
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a= scn.nextInt();
        System.out.println("Enter the number2");
        int b= scn.nextInt();
        String input = "Hello and Welcome to 1st sum Program ";
        System.out.println(input + (a+b));
        scn.close();
    }
}
