package Number_10;

public class numberIsPalindrome {
    public static void main(String[] args) {
        numberIsPalindrome palindrome= new numberIsPalindrome();
        System.out.println(palindrome.isPalindrome(123455));
    }

    boolean isPalindrome(int n){
        int temp=n;
        int rem=0;
        int rev=0;
        while (n!=0){
            rem = n%10;
            rev = (rev*10)+rem;
             n=n/10;
        }
        if (temp==rev){
            return true;
        }
        return false;
    }
}
