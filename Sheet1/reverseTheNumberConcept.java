import java.util.Scanner;

public class reverseTheNumberConcept {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = scn.nextInt();
        reverseTheNumber rev = new reverseTheNumber();
        System.out.println(rev.reverseTheNumber( a));

    }
}
class reverseTheNumber{
    int reverseTheNumber(int num){
        int rev=0,r;
        while (num>0){
            r= num%10;
            rev= rev*10+r;
            num= num/10;
        }
        return rev;
    }
}
