package Number_10;

public class CheckArmstrong {
    public static void main(String[] args) {
        CheckArmstrong ca = new CheckArmstrong();
        ca.armstrongChecker(153);
    }


    void armstrongChecker(int num){
        int sum = 0;
        int temp=num;
        int digit;
        while (num>0){
            digit = num%10;
            sum = sum +(digit*digit*digit);
            num= num/10;

        }
        if (temp==sum){
            System.out.println("is ArmStrong");
        }
       else {
            System.out.println("is Not Armstrong");
        }
    }
}
