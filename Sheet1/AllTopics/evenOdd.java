package AllTopics;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int num= scn.nextInt();
        evenOddClass eo= new evenOddClass();

        eo.evenOrOdd(num);
    }
}
class evenOddClass{
    static void  evenOrOdd(int num ){
        if (num%2==0){
            System.out.println("Its a even number");
        }
        else {
            System.out.println("it is an odd number");
        }
    }
}