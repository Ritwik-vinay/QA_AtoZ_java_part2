package AllTopics;

public class intPalindromeConcept {
    public static void main(String[] args) {
        intPalindromeChecker ip = new intPalindromeChecker();
        System.out.println(ip.intPalindromeChecker(2223));
    }
}
class intPalindromeChecker{
    boolean intPalindromeChecker(int num ){
        int orgNum = num;
        int rev = 0;
        while (num!=0){
            int digit= num%10;
            rev= rev*10+digit;
            num=num/10;
        }
        return  orgNum == orgNum;
    }
}
