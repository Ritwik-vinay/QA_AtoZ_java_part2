package AllTopics;

public class primeNumber {
    public static void main(String[] args) {
        primeNumberChecker pm = new primeNumberChecker();
        System.out.println(pm.primeNumberChecker(5));
    }
}
class primeNumberChecker{
    boolean primeNumberChecker(int num){
        for (int i=2; i<=num/2;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
