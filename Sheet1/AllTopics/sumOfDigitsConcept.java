package AllTopics;

public class sumOfDigitsConcept {
    public static void main(String[] args) {
        sumOfDigitChecker sc = new sumOfDigitChecker();
        System.out.println(sc.sumOfDigitChecker(123456789));
    }
}
class sumOfDigitChecker{
    int sumOfDigitChecker(int num){
        int sum =0;
        while (num>0){
            int digit = num%10;
            sum = sum+digit;
            num= num /10;
        }
        return sum;
    }
}
