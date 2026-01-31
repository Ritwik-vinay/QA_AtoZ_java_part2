package Number_10;

public class primeNumberChecker {
    public static void main(String[] args) {
        primeNumberChecker pmc= new primeNumberChecker();
        pmc.isPrime(-1);
    }

    void isPrime (int n){
        boolean isPrime= true;
        if (n<=1){
            System.out.printf("!! It is not a primeNumber");
            return;
        }
        for (int i=2; i<=Math.sqrt(n);i++){
            if (n%i==0){
                isPrime= false;

            }
        }
        if (isPrime){
            System.out.println(n +" is a Prime Number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }
    }
}
