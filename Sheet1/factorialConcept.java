public class factorialConcept{
    public static void main(String[] args) {
        factorialChecker fc= new factorialChecker(5);
    }
}

class factorialChecker{
    factorialChecker(int num){
        int factorial =1;
        for (int i =1; i<=num; i++){
            if (num==0 && num ==1){
                System.out.println(factorial);
            }
            else {
                factorial= factorial*i;


            }
        }
        System.out.print("Factorial of number " + num +"! = "+ factorial);
    }
}
