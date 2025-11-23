package Java003_Strings;

import java.util.Scanner;

public class methodsExamples {
    public static void main(String[] args) {
        //You give input -> Process -> Gives Output
        // coffee -> water - process coffee -> Black coffee
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st num");
        int a = scn.nextInt();
        System.out.println("Enter 2nd number");
        int b = scn.nextInt();
        Employee emp = new Employee();

        emp.empDetails("Ritwik");
        methodsExamples me = new methodsExamples();
        me.func(a);
        me.greet();
        System.out.println(me.evningGreet());
        System.out.println(me.sum(a,b));

    }
    //3. With parameter without return type
    void func(int a){
        System.out.println(a);
    }
    //1. Without parameter without return type
    void greet(){
        System.out.println("GOOD MORNING SIR");
    }
    //4. Without parameter and with return type
    int evningGreet(){
        int a=200;
        return a;
    }
    //2. With parameter with return type
    int  sum (int a, int b){
        return a*b;
    }

}

class Employee{




    void empDetails(String a) {
        System.out.println(a);
    }
}
