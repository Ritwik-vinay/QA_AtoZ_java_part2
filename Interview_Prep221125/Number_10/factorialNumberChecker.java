package Number_10;

public class factorialNumberChecker {
    public static void main(String[] args) {
        factorialNumberChecker fc = new factorialNumberChecker();
        fc.checkFactorial(5);
    }



    void checkFactorial(int n){
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
